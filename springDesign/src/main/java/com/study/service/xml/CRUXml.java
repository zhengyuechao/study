package com.study.service.xml;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Iterator;
import java.util.List;
 
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
 
public class CRUXml {
	

	public static void main(String[] args) throws IOException, DocumentException {
		 
		//Java_Write_XML(); //java写xml

		// java_XiuGai__XML("level1"); // java修改xml
		 String tag = getAgeLevel();
		 System.out.println("真正的级别："+tag);
	}
	
	public static String  getAgeLevel() throws DocumentException, IOException {
		String res_level = null;
		/*
		 * 2.java修改xml
		 */
		// 创建SAXReader对象
		SAXReader sr = new SAXReader(); // 需要导入jar包:dom4j
		// 关联xml
		Document document = sr.read("investigateAge.xml");
		
		
		/**
         * 节点对象的操作方法
         */
        
        //获取文档根节点
        Element root = document.getRootElement();
        //输出根标签的名字
        System.out.println(root.getName());
        
        
        //获取根节点下面的所有子节点（不包过子节点的子节点）
        List<Element> list = root.elements() ;
        //遍历List的方法
        for (Element e:list){ 
        	Element _val = e.element("value");
            if("true".equals(_val.getStringValue())) {
            	System.out.println(_val.getStringValue()+" level="+ e.attribute("id").getStringValue());
            	res_level = e.attribute("id").getStringValue();
            } 
        }
		return res_level;
	}

	public static void updateXML(String level) throws DocumentException, IOException {
		/*
		 * 2.java修改xml
		 */
		// 创建SAXReader对象
		SAXReader sr = new SAXReader(); // 需要导入jar包:dom4j
		// 关联xml
		Document document = sr.read("investigateAge.xml");
		
		/**
         * 节点对象的操作方法
         */
        
        //获取文档根节点
        Element root = document.getRootElement();
        //输出根标签的名字
        System.out.println(root.getName());
        
        
        //获取根节点下面的所有子节点（不包过子节点的子节点）
        List<Element> list = root.elements() ;
        //遍历List的方法
        for (Element e:list){
            Attribute id_level = e.attribute("id");
            Element _val = e.element("value");
        	_val.setText("false");
    		// 根据属性值修改元素
    		// 调用下面的静态方法完成xml的写出
    		saveDocument(document, new File("investigateAge.xml"));
            if(id_level.getStringValue().equals(level)) {
            	System.out.println("why:"+id_level.getStringValue());
            	
            	_val = e.element("value");
            	_val.setText("true");
        		// 根据属性值修改元素
        		// 调用下面的静态方法完成xml的写出
        		saveDocument(document, new File("investigateAge.xml"));
            }
        }
	}

	 //递归查询节点函数,输出节点名称
	private static void getChildNodes(Element elem) {
		System.out.println(elem.getName());
		Iterator<Node> it = elem.nodeIterator();
		while (it.hasNext()) {
			Node node = it.next();
			if (node instanceof Element) {
				Element e1 = (Element) node;
				getChildNodes(e1);
			}

		}
	}
	
	public static void writeXML() throws IOException {
		/*
		 * 1.java写xml
		 */

		// 生成xml的第一行 <?xml version="1.0" encoding="UTF-8"?>
		Document document = DocumentHelper.createDocument();

		// 添加一个元素,作为根元素students
		Element root = document.addElement("ages");

		// 根元素下的一个元素student
		Element student = null;
		
		for (int i = 0; i <5 ; i++) {
			student = root.addElement("level");
			student.addAttribute("id", "level"+i);
			Element value = student.addElement("value");
			Element desc = student.addElement("description");
			value.setText("false");
			if(0==i) {
				desc.setText("30-40");
			}
			if(1==i) {
				desc.setText("40-50");
			}
			if(2==i) {
				desc.setText("50-60");
			}
			if(3==i) {
				desc.setText("60-70");
			}
			if(4==i) {
				desc.setText("70");
			}
			
		}
 

		// 调用下面的静态方法完成xml的写出
		saveDocument(document, new File("investigateAge.xml"));
	}

	// 下面的为固定代码---------可以完成java对XML的写,改等操作
	public static void saveDocument(Document document, File xmlFile) throws IOException {
		Writer osWrite = new OutputStreamWriter(new FileOutputStream(xmlFile));// 创建输出流
		OutputFormat format = OutputFormat.createPrettyPrint(); // 获取输出的指定格式
		format.setEncoding("UTF-8");// 设置编码 ，确保解析的xml为UTF-8格式
		XMLWriter writer = new XMLWriter(osWrite, format);// XMLWriter
															// 指定输出文件以及格式
		writer.write(document);// 把document写入xmlFile指定的文件(可以为被解析的文件或者新创建的文件)
		writer.flush();
		writer.close();
	}
}
