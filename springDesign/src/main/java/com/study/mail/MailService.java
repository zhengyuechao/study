package com.study.mail;

import java.io.File;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMailMessage;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class MailService {
	
	private final Logger logger = LoggerFactory.getLogger(MailService.class);
	
	@Value("${spring.mail.username}")
	private String from;
	
	@Autowired
	private JavaMailSender javaMailSender;
	
	public void sendSimpleMail(String to,String subject,String content) {
		//实例化简单发送邮件对象
		SimpleMailMessage msg = new SimpleMailMessage();
		//邮件接收人
		msg.setTo(to);
		//邮件主题
		msg.setSubject(subject);
		//邮件内容
		msg.setText(content);
		//邮件发送人
		msg.setFrom(from);
		//发送邮件
		javaMailSender.send(msg);
	}
	public void sendHtmlMail(String to,String subject,String content) throws MessagingException {
		MimeMessage mimeMsg = javaMailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(mimeMsg,true);
		
		//邮件接收人
		helper.setTo(to);
		//邮件主题
		helper.setSubject(subject);
		//邮件内容
		helper.setText(content,true);
		//邮件发送人
		helper.setFrom(from);
		//发送邮件
		javaMailSender.send(mimeMsg);
	}
	
	public void sendAttachmentMail(String to,String subject,String content, String filePath) throws MessagingException {
		MimeMessage mimeMsg = javaMailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(mimeMsg,true);
		
		//邮件接收人
		helper.setTo(to);
		//邮件主题
		helper.setSubject(subject);
		//邮件内容
		helper.setText(content,true);
		//邮件发送人
		helper.setFrom(from);
		//加载文件资源
		FileSystemResource file = new FileSystemResource(new File(filePath));
		helper.addAttachment(file.getFilename(), file);
		//发送邮件
		javaMailSender.send(mimeMsg);
	}
	
	public void sendImageMail(String to,String subject,String content, String rscPath,String rscId) {
		logger.info("");
		MimeMessage mimeMsg = javaMailSender.createMimeMessage();
		MimeMessageHelper helper;
		try {
			helper = new MimeMessageHelper(mimeMsg,true);
			//邮件接收人
			helper.setTo(to);
			//邮件主题
			helper.setSubject(subject);
			//邮件内容
			helper.setText(content,true);
			//邮件发送人
			helper.setFrom(from);
			//加载文件资源
			FileSystemResource file = new FileSystemResource(new File(rscPath));
			helper.addInline(rscId, file);
			//发送邮件
			javaMailSender.send(mimeMsg);
			logger.info("发送邮件成功！");
		} catch (MessagingException e) {
			e.printStackTrace();
			logger.error("发送邮件失败！");
		}
		
		
	}
	
	
	
	
}
