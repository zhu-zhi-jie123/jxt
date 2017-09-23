package com.jxt.toolmanage.quartz;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jxt.toolmanage.pojo.Tool;
import com.jxt.toolmanage.service.ToolManageService;

@Component("quartzJob")
public class QuartzJob {
	
	@Autowired
	private ToolManageService toolManageService;
	
	/*
	 * 设置的时间到了所要执行的任务
	 */
	public void autoChangeStatus() {
		
		List<Tool> allTools = toolManageService.getAllTools();
		for (Tool tool : allTools) {
			/*
			 * 判断是否要改变状态为待试验
			 */
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(tool.getLastTestDate());
			calendar.add(Calendar.MONTH, +(tool.getTestPeriod()-1));
			if(isSameDate(new Date(), calendar.getTime())) {
				toolManageService.updateStatusByIds(tool.getId().toString(), 1);
			}
			/*
			 * 判断是否要改变状态为待报废
			 */
			calendar.setTime(tool.getCreateDate());
			calendar.add(Calendar.MONTH, +(tool.getValidUsePeriod()-1));
			if(isSameDate(new Date(), calendar.getTime())) {
				toolManageService.updateStatusByIds(tool.getId().toString(), 3);
			}
		}
	}
	
	/*
	 * 判断两个日期是否为同一天
	 */
	private static boolean isSameDate(Date date1, Date date2) {
		Calendar cal1 = Calendar.getInstance();
		cal1.setTime(date1);

		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(date2);

		boolean isSameYear = cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR);
		boolean isSameMonth = isSameYear
				&& cal1.get(Calendar.MONTH) == cal2.get(Calendar.MONTH);
		boolean isSameDate = isSameMonth
				&& cal1.get(Calendar.DAY_OF_MONTH) == cal2
						.get(Calendar.DAY_OF_MONTH);
		return isSameDate;
	}
	
}





