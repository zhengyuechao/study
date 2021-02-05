package com.study.timetask;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 
* @ClassName: ScheduledTask 
* @Description: 定时任务
* @Author z
* @DateTime 2020年2月25日 下午2:07:15
 */
@Component
public class ScheduledTask {

	private int count = 0;
	/**
	 * https://www.cnblogs.com/lenve/p/10728897.html
	 * 参考网址
	 */
	@Scheduled(fixedDelay = 2000L)
	public void work() {
		System.out.println("Task hello world"+(++count)+"次执行"+new Date());
	}
}
