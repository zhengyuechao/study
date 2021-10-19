package com.study.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * 解决 此文要从SpringBoot打包后不能读取classpath下文件说起
 * @author zheng
 *
 */
@RestController
public class ReadClassPathController {

	private static final Logger LOGGER = LoggerFactory.getLogger(ReadClassPathController.class);

	/**
	 * 图片下载接口
	 *
	 * @param response
	 * @Author xiang.wei
	 */
	@RequestMapping("/download/image")
	public void errorDownloadImage(HttpServletResponse response) throws IOException {
		// 读取文件的路径
		String path = Thread.currentThread().getContextClassLoader().getResource("").getPath() + "img/qr_code-icon.png";
		LOGGER.info("qr_code-icon path is: " + path);
		InputStream is = new FileInputStream(new File(path));
		downloadFile(is, "qr_code-icon.png", response);
	}

	@RequestMapping("/correct/download/image1")
	public void correctDownloadImage1(HttpServletResponse response) throws IOException {
		InputStream is = new ClassPathResource("img/qr_code-icon.png").getInputStream();
		downloadFile(is, "qr_code-icon.png", response);
	}

	@RequestMapping("/correct/download/image2")
	public void correctDownloadImage2(HttpServletResponse response) throws IOException {
		InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("img/qr_code-icon.png");
		downloadFile(is, "qr_code-icon.png", response);
	}

	private void downloadFile(InputStream is, String name, HttpServletResponse response) throws IOException {
		// 设置响应头 "application/octet-stream"
		response.setContentType(MediaType.APPLICATION_OCTET_STREAM_VALUE);
		response.setHeader("Content-Disposition",
				"attachment;filename=" + java.net.URLDecoder.decode(name, "ISO-8859-1"));
		// 输出流自动关闭
		try (OutputStream os = response.getOutputStream()) {
			byte[] buffer = new byte[1024];
			int len = 0;
			while ((len = is.read(buffer)) != -1) {
				os.write(buffer, 0, len);
				os.flush();
			}
		} finally {
			if (is != null) {
				is.close();
			}
		}
	}

}
