package com.jxt.toolmanage.service;

import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.jxt.category.mapper.CategoryMapper;
import com.jxt.category.pojo.Category;
import com.jxt.common.FastDFSClient;
import com.jxt.toolmanage.mapper.ToolMapper;
import com.jxt.toolmanage.pojo.QRCodeInfo;
import com.jxt.toolmanage.pojo.Tool;
import com.jxt.toolmanage.pojo.ToolExample;
import com.jxt.toolmanage.pojo.ToolExample.Criteria;
import com.jxt.toolmanage.pojo.ToolVo;
import com.jxt.utils.QRCode;
import com.jxt.utils.JsonUtils;
import com.jxt.utils.JxtResult;

@Service
public class ToolManageServiceImpl implements ToolManageService {

	@Autowired
	private ToolMapper toolMapper;
	@Autowired
	private CategoryMapper categoryMapper;
	
	@Value("${QRCODE_WIDTH}")
	private int QRCODE_WIDTH;
	@Value("${QRCODE_HEIGHT}")
	private int QRCODE_HEIGHT;
	@Value("${QRCODE_FORMAT}")
	private String QRCODE_FORMAT;
	@Value("${IMAGE_SERVER_URL}")
	private String IMAGE_SERVER_URL;
	
	/*
	 * 根据分类查询工器具(non-Javadoc)
	 * @see com.jxt.toolmanage.service.ToolManageService#getToolsByCid(java.lang.Long)
	 */
	@Override
	public List<Tool> getToolsByCid(Long cid) {
		//设置查询条件
		ToolExample example = new ToolExample();
		Criteria criteria = example.createCriteria();
		criteria.andCidEqualTo(cid);
		//查询
		List<Tool> toolList = toolMapper.selectByExample(example);
		return toolList;
	}
	
	/*
	 * 根据工器具名称查询工器具(non-Javadoc)
	 * @see com.jxt.toolmanage.service.ToolManageService#getToolsByToolName(java.lang.String)
	 */
	@Override
	public List<Tool> getToolsByToolNames(String toolNames) {
		//创建装结果的List
		List<Tool> toolList = new ArrayList<Tool>();
		//将多个工器具名称拆分
		String[] names = toolNames.split(",");
		//逐个查询
		for (String toolName : names) {
			//设置查询条件
			ToolExample example = new ToolExample();
			Criteria criteria = example.createCriteria();
			criteria.andToolNameEqualTo(toolName);
			List<Tool> list = toolMapper.selectByExample(example);
			//将每个查询的结果装入结果List中
			for (Tool tool : list) {
				toolList.add(tool);
			}
		}
		return toolList;
	}

	/*
	 * 根据id查询工器具(non-Javadoc)
	 * @see com.jxt.toolmanage.service.ToolManageService#getToolById(java.lang.Long)
	 */
	@Override
	public Tool getToolById(Long id) {
		//查询
		Tool tool = toolMapper.selectByPrimaryKey(id);
		return tool;
	}

	/*
	 * 根据状态查询工器具(non-Javadoc)
	 * @see com.jxt.toolmanage.service.ToolManageService#getToolByStatus(int)
	 */
	@Override
	public List<Tool> getToolByStatus(Integer status) {
		//设置查询条件
		ToolExample example = new ToolExample();
		Criteria criteria = example.createCriteria();
		criteria.andStatusEqualTo(status);
		//查询
		List<Tool> toolList = toolMapper.selectByExample(example);
		return toolList;
	}

	/*
	 * 根据id修改工器具状态(non-Javadoc)
	 * @see com.jxt.toolmanage.service.ToolManageService#updateStatusById(java.lang.Long, java.lang.Integer)
	 */
	@Override
	public JxtResult updateStatusByIds(String ids, Integer status) {
		String[] idStrings = ids.split(",");
		for (String id : idStrings) {
			//根据id查询工器具z
			Tool tool = this.getToolById(Long.parseLong(id));
			//修改状态
			tool.setStatus(status);
			//状态  0:正常，1:待试验，2:正在试验，3:待报废，4:已报废，5:未被领用，6:被领用
			//如果修改状态为正在试验则需要修改上次试验日期为此时的日期
			if(status == 2) {
				tool.setLastTestDate(new Date());
			}
			//修改数据库中的状态
			toolMapper.updateByPrimaryKey(tool);
		}
		return JxtResult.build(200, "修改成功");
	}
	

	/*
	 * 添加工器具，同时要生成二维码(non-Javadoc)
	 * @see com.jxt.toolmanage.service.ToolManageService#addTool(com.jxt.toolmanage.pojo.Tool)
	 */
	@Override
	public JxtResult addTool(final Tool tool) throws Exception {
		//补充对象属性
		tool.setIsQualified(0);  //是否合格    0:合格，1:不合格
		tool.setStatus(0);  //状态  0:正常，1:待试验，2:正在试验，3:待报废，4:已报废，5:未被领用，6:被领用
		//创建二维码信息对象
		QRCodeInfo qrCodeInfo = new QRCodeInfo(tool);
		//将对象转换成json数据
		String jsonData = JsonUtils.objectToJson(qrCodeInfo);
		//生成二维码
		String generateQRCode = QRCode.generateQRCode(jsonData, QRCODE_WIDTH, QRCODE_HEIGHT, QRCODE_FORMAT);
		//上传二维码图片到图片服务器
		FastDFSClient fastDFSClient = new FastDFSClient("classpath:client.conf");
		String QRCodePath = fastDFSClient.uploadFile(generateQRCode);
		//设置二维码图片路径
		tool.setTwoDimensionCode(IMAGE_SERVER_URL+QRCodePath);
		//插入
		toolMapper.insert(tool);		
		return JxtResult.build(200, "添加成功", tool);
	}

	/*
	 * 批量增加工器具(non-Javadoc)
	 * @see com.jxt.toolmanage.service.ToolManageService#addTools(com.jxt.toolmanage.pojo.ToolVo)
	 */
	@Override
	public JxtResult addTools(ToolVo toolVo) throws Exception {
		List<Tool> toolList = toolVo.getToolList();
		for (Tool tool : toolList) {
			//补充对象属性
			tool.setIsQualified(0);  //是否合格    0:合格，1:不合格
			tool.setStatus(0);  //状态  0:正常，1:待试验，2:正在试验，3:待报废，4:已报废，5:未被领用，6:被领用
			//创建二维码信息对象
			QRCodeInfo qrCodeInfo = new QRCodeInfo(tool);
			//将对象转换成json数据
			String jsonData = JsonUtils.objectToJson(qrCodeInfo);
			//生成二维码
			String generateQRCode = QRCode.generateQRCode(jsonData, QRCODE_WIDTH, QRCODE_HEIGHT, QRCODE_FORMAT);
			//上传二维码图片到图片服务器
			FastDFSClient fastDFSClient = new FastDFSClient("classpath:client.conf");
			String QRCodePath = fastDFSClient.uploadFile(generateQRCode);
			//设置二维码图片路径
			tool.setTwoDimensionCode(IMAGE_SERVER_URL+QRCodePath);
			//插入
			toolMapper.insert(tool);
		}
		return JxtResult.build(200, "添加成功", toolList);
	}

	/*
	 * 单个编辑工器具(non-Javadoc)
	 * @see com.jxt.toolmanage.service.ToolManageService#editTool(com.jxt.toolmanage.pojo.Tool)
	 */
	@Override
	public JxtResult editTool(Tool tool) throws Exception {
		//补充对象属性
		if(tool.getIsQualified()==null){
			tool.setIsQualified(0);  //是否合格    0:合格，1:不合格
		}
		//使用用户编辑后的数据创建二维码信息对象
		QRCodeInfo qrCodeInfo = new QRCodeInfo(tool);
		//将对象转换成json数据
		String jsonData = JsonUtils.objectToJson(qrCodeInfo);
		//使用新的信息生成二维码
		String generateQRCode = QRCode.generateQRCode(jsonData, QRCODE_WIDTH, QRCODE_HEIGHT, QRCODE_FORMAT);
		//上传二维码图片到图片服务器
		FastDFSClient fastDFSClient = new FastDFSClient("classpath:client.conf");
		String QRCodePath = fastDFSClient.uploadFile(generateQRCode);
		//设置二维码图片路径
		tool.setTwoDimensionCode(IMAGE_SERVER_URL+QRCodePath);
		//编辑
		toolMapper.updateByPrimaryKeySelective(tool);
		//查询编辑后的工器具信息
		Tool toolResult = toolMapper.selectByPrimaryKey(tool.getId());
		return JxtResult.build(200, "编辑成功！", toolResult);
	}

	/*
	 * 批量编辑工器具(non-Javadoc)
	 * @see com.jxt.toolmanage.service.ToolManageService#editTools(com.jxt.toolmanage.pojo.ToolVo)
	 */
	@Override
	public JxtResult editTools(ToolVo toolVo) throws Exception {
		//编辑后的工器具信息的List
		List<Tool> toolList = new ArrayList<Tool>();
		//遍历需要编辑的工器具列表并逐个编辑
		for (Tool tool : toolVo.getToolList()) {
			//补充对象属性
			if(tool.getIsQualified()==null){
				tool.setIsQualified(0);  //是否合格    0:合格，1:不合格
			}
			//使用用户编辑后的数据创建二维码信息对象
			QRCodeInfo qrCodeInfo = new QRCodeInfo(tool);
			//将对象转换成json数据
			String jsonData = JsonUtils.objectToJson(qrCodeInfo);
			//使用新的信息生成二维码
			String generateQRCode = QRCode.generateQRCode(jsonData, QRCODE_WIDTH, QRCODE_HEIGHT, QRCODE_FORMAT);
			//上传二维码图片到图片服务器
			FastDFSClient fastDFSClient = new FastDFSClient("classpath:client.conf");
			String QRCodePath = fastDFSClient.uploadFile(generateQRCode);
			//设置二维码图片路径
			tool.setTwoDimensionCode(IMAGE_SERVER_URL+QRCodePath);
			//编辑
			toolMapper.updateByPrimaryKeySelective(tool);
			//查询编辑后的工器具信息
			Tool toolResult = toolMapper.selectByPrimaryKey(tool.getId());
			toolList.add(toolResult);
		}
		return JxtResult.build(200, "编辑成功！", toolList);
	}

	/*
	 * 查询所有工器具(non-Javadoc)
	 * @see com.jxt.toolmanage.service.ToolManageService#getAllTools()
	 */
	@Override
	public List<Tool> getAllTools() {
		//设置空条件
		ToolExample example = new ToolExample();
		//查询
		List<Tool> tools = toolMapper.selectByExample(example);
		return tools;
	}

	/*
	 * 以excel格式导出工器具信息(non-Javadoc)
	 * @see com.jxt.toolmanage.service.ToolManageService#exportExcel(java.lang.String)
	 */
	@Override
	public JxtResult exportExcel(String path) throws Exception {
		this.export(path, this.getAllTools());
		return JxtResult.ok();
	}
	
	//导出excel格式
	public void export(String path,List<Tool> toolList) throws Exception {
		//创建workbook
		HSSFWorkbook workbook = new HSSFWorkbook();
		
		//创建sheet
		HSSFSheet sheet = workbook.createSheet("工器具信息");
		
		//创建表头行，第0行
		HSSFRow row = sheet.createRow(0);
		//设置样式为居中
		HSSFCellStyle style = workbook.createCellStyle();
		style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		
		//创建单元格
		HSSFCell cell = row.createCell(0);  //第一个
		cell.setCellValue("所属分类");
		cell.setCellStyle(style);
		cell = row.createCell(1);  //第二个
		cell.setCellValue("编号");
		cell.setCellStyle(style);
		cell = row.createCell(2);  //第三个
		cell.setCellValue("工器具名称");
		cell.setCellStyle(style);
		cell = row.createCell(3);  //第四个
		cell.setCellValue("试验周期(天)");
		cell.setCellStyle(style);
		cell = row.createCell(4);  //第五个
		cell.setCellValue("上次试验日期");
		cell.setCellStyle(style);
		cell = row.createCell(5);  //第六个
		cell.setCellValue("规格类型");
		cell.setCellStyle(style);
		cell = row.createCell(6);  //第七个
		cell.setCellValue("出厂日期");
		cell.setCellStyle(style);
		cell = row.createCell(7);  //第八个
		cell.setCellValue("有效使用周期");
		cell.setCellStyle(style);
		cell = row.createCell(8);  //第九个
		cell.setCellValue("保管与存放要求");
		cell.setCellStyle(style);
		cell = row.createCell(9);  //第十个
		cell.setCellValue("检查与使用要求");
		cell.setCellStyle(style);
		cell = row.createCell(10);  //第十一个
		cell.setCellValue("是否合格");
		cell.setCellStyle(style);
		cell = row.createCell(11);  //第十二个
		cell.setCellValue("状态");
		cell.setCellStyle(style);
		
		//日期格式
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		
		//插入数据
		for (int i = 0; i < toolList.size(); i++) {
			Tool  tool = toolList.get(i);
			//创建行
			row = sheet.createRow(i+1);
			//创建单元格并且添加数据
			Category category = categoryMapper.selectByPrimaryKey(tool.getCid());
			row.createCell(0).setCellValue(category.getCategoryName());
			row.createCell(1).setCellValue(tool.getNumber());
			row.createCell(2).setCellValue(tool.getToolName());
			row.createCell(3).setCellValue(tool.getTestPeriod());
			row.createCell(4).setCellValue(format.format(tool.getLastTestDate()));
			row.createCell(5).setCellValue(tool.getModelNumber());
			row.createCell(6).setCellValue(format.format(tool.getCreateDate()));
			row.createCell(7).setCellValue(tool.getValidUsePeriod());
			row.createCell(8).setCellValue(tool.getKeepAndDepositRequire());
			row.createCell(9).setCellValue(tool.getInspectionAndUseRequire());
			if(tool.getIsQualified() == 0) {
				row.createCell(10).setCellValue("合格");
			} else if(tool.getIsQualified() == 1) {
				row.createCell(10).setCellValue("不合格");
			}
			if(tool.getStatus() == 0) {
				row.createCell(11).setCellValue("正常");
			} else if (tool.getStatus() == 1) {
				row.createCell(11).setCellValue("待试验");
			} else if (tool.getStatus() == 2) {
				row.createCell(11).setCellValue("正在试验");
			} else if (tool.getStatus() == 3) {
				row.createCell(11).setCellValue("待报废");
			} else if (tool.getStatus() == 4) {
				row.createCell(11).setCellValue("已报废");
			} else if (tool.getStatus() == 5) {
				row.createCell(11).setCellValue("未被领用");
			} else if (tool.getStatus() == 6) {
				row.createCell(11).setCellValue("被领用");
			}
		}
		//生成excel文件并且保存到指定目录下
		FileOutputStream outputStream = new FileOutputStream(path);
		workbook.write(outputStream);
		outputStream.close();
	}
	
}




