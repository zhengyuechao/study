package com.study.service.xml;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.List;
 
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
public class testXml {
	public static void main(String[] args) throws IOException, DocumentException {
		 
		Java_Write_XML(); //java写xml

		//java_XiuGai__XML(); // java修改xml

	}

	public static void java_XiuGai__XML() throws DocumentException, IOException {
		/*
		 * 2.java修改xml
		 */
		// 创建SAXReader对象
		SAXReader sr = new SAXReader(); // 需要导入jar包:dom4j
		// 关联xml
		Document document = sr.read("test.xml");

		// 获取根元素
		Element root = document.getRootElement();
		// 获取student标签
		Element student = root.element("student");
		// 利用student标签添加属性
		Element addAttribute = student.addAttribute("身份证号", "XXXXX");

		// 在xml的某一个标签里修改一个属性
		Attribute id_xg = student.attribute("id");
		id_xg.setText("it002");

		// 修改xml里某一个元素

		// 根据标签修改元素
		// 获取sex标签
		Element sex = student.element("sex");
		sex.setText("女女女女");
		// 根据属性值修改元素
		List<Element> elements = student.elements();
		for (Element element : elements) {
			if (element.getText().endsWith("明")) {
				element.setText("小小小小小明");
			}
		}
		// 调用下面的静态方法完成xml的写出
		saveDocument(document, new File("test.xml"));
	}

	public static void Java_Write_XML() throws IOException {
		/*
		 * 1.java写xml
		 */

		// 生成xml的第一行 <?xml version="1.0" encoding="UTF-8"?>
		Document document = DocumentHelper.createDocument();

		// 添加一个元素,作为根元素students
		Element root = document.addElement("students");

		// 根元素下的一个元素student
		Element student = root.addElement("student");
		// 在student标签里添加属性
		student.addAttribute("id", "it001");

		// 为其添加元素
		Element name = student.addElement("name");
		Element name1 = student.addElement("name");
		Element sex = student.addElement("sex");
		name.setText("小红");
		name1.setText("小明");
		sex.setText("男");

		// 上面的操作都在内存中

		// 调用下面的静态方法完成xml的写出
		saveDocument(document, new File("test.xml"));
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
