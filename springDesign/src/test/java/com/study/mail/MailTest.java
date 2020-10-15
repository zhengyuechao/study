package com.study.mail;

import javax.annotation.Resource;
import javax.mail.MessagingException;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.web.ResourceProperties.Content;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MailTest {

	@Resource
	MailService mailService;
	
	 
	@Resource
	TemplateEngine templateEngine;
	
	/**
	 * 
	* @Title: SimpleMailTest 
	* @Description: 
	* @Author z
	* @DateTime 2020年9月3日 下午5:04:41
	 */
	@Test
	public void SimpleMailTest() {
		mailService.sendSimpleMail("zhengchao2009@163.com", "一次测试", "这是第一封测试邮件");
	}
	
	@Test
	public void SimpleHtmlTest() throws MessagingException {
		String content = "<!DOCTYPE html>\r\n" + 
				"<html>\r\n" + 
				"<body>\r\n" + 
				"<h1>Hello Mail</h1>\r\n"+
				"<p id=\"uuid\" style=\"\">这是Html测试邮件</p>\r\n" + 
				"</body>\r\n" + 
				"</html>";
		mailService.sendHtmlMail("zhengchao2009@163.com", "html测试", content);
	}
	
	@Test
	public void SimpleAttachmentTest() throws MessagingException {
		
		String filePath = "G:\\easyexcel.xlsx"; 
		mailService.sendAttachmentMail("zhengchao2009@163.com", "附件测试", "这是一个附件邮件",filePath);
	}
	
	 
	
	@Test
	public void SimpleImageTest(){
		String filePath = "G:\\img2020.png"; 
		String srcId = "0001";
		
		//String html ="<h1 style='color:red'>helloWorld</h1><img src='cid:0001'/>";
		mailService.sendImageMail("zhengchao2009@163.com", "图片附件测试", "图片附件测试", filePath, srcId);
	}
	
	@Test
	public void SimpleTemplateTest() throws MessagingException { 
		Context context = new Context();
		context.setVariable("id", "007");
		String emailContent  = templateEngine.process("mail", context);
		mailService.sendHtmlMail("zhengchao2009@163.com", "thymeleaf模板测试", emailContent);
	}
}
