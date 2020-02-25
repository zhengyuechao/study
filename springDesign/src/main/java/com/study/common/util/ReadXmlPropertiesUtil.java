package com.study.common.util;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.xml.sax.SAXException; 

public class ReadXmlPropertiesUtil {
	/**
     * 根据xml解析属性
     * @param path xml路径
     * @param id mapping组id
     * @param key 键值对key标识
     * @return value key对应的value
     * @throws SAXException
     * @throws IOException
     * @throws Exception
     */
    public static String getItemValue(String path, String key)
            throws SAXException, IOException, Exception {
        
        // 解析文件，生成document对象
        DocumentBuilder builder = DocumentBuilderFactory.newInstance()
                .newDocumentBuilder();
        Document document = builder.parse(path);
        // 生成XPath对象
        javax.xml.xpath.XPath xpath = XPathFactory.newInstance().newXPath();
 
        //String webTitleLang = (String) xpath.evaluate("/root/mapping[@id='"+ id + "']/item[@key='" + key + "']/@value", document, XPathConstants.STRING);
        String value = (String) xpath.evaluate("/root/item[@key='" + key + "']/@value", document, XPathConstants.STRING);
        return value;
    }
 
    /**
     * 根据key取出value属性
     * @param key
     * @return
     * @throws SAXException
     * @throws IOException
     * @throws Exception
     */
    public static String getValue(String key)
            throws SAXException, IOException, Exception {
        key = key.trim();
        String rootPath = ReadXmlPropertiesUtil.class.getResource("/").getPath() + "config";
        String value = getItemValue(rootPath+"/WeiXinConfig.xml",key);
        return value;
    }
    
    public static void main(String[] args) {
		try {
			String value = ReadXmlPropertiesUtil.getValue("REMOTE_SERVER_URL");
			System.out.println(value);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
 
}
