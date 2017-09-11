package com.jxt.toolmanage.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
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
	public JxtResult updateStatusById(Long id, Integer status) {
		//根据id查询工器具
		Tool tool = this.getToolById(id);
		//修改状态
		tool.setStatus(status);
		//修改数据库中的状态
		toolMapper.updateByPrimaryKey(tool);
		return JxtResult.build(200, "修改成功", tool);
	}

	/*
	 * 添加工器具，同时要生成二维码(non-Javadoc)
	 * @see com.jxt.toolmanage.service.ToolManageService#addTool(com.jxt.toolmanage.pojo.Tool)
	 */
	@Override
	public JxtResult addTool(Tool tool) throws Exception {
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
	
}




