package com.study.controller;

import java.io.IOException;

import org.dom4j.DocumentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.common.util.ReadProfileProperties;
import com.study.service.xml.CRUXml;

/**
 * 
* @ClassName: ReadConfigController 
* @Description: 读取yml 属性
* @Author z
* @DateTime 2020年4月1日 下午3:05:47
 */
@RestController
public class ReadConfigController {

	@Autowired
	private ReadProfileProperties profile;
	
	@GetMapping("/config")
	public String read(){
		return profile.getEmail();
	}
	
	@GetMapping("/modifyTag")
	public String modify(String tag) throws DocumentException, IOException{
		CRUXml.updateXML(tag);
		return CRUXml.getAgeLevel(); 
	}
}
