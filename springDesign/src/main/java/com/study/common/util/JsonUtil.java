package com.study.common.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.study.entity.Student;
/**
 * 
 * @author z
 * 20201207 
 * JSON tools
 *
 */
public class JsonUtil {

	/** 
	 * 将json转换实体类
	 * @param jsonStr
	 * @param obj
	 * @return
	 */
	public static <T> T getJSONToObj(String jsonStr, Class<T> obj) {
		T t = null;
		try {
			t = JSON.parseObject(jsonStr, obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return t;
	}

	/**
	 * 将实体POJO转化为JSON
	 * @param obj
	 * @return
	 * @throws JSONException
	 * @throws IOException
	 */
	public static String getObjectToString(Object obj ) {
		
		String studentJson = JSON.toJSONString(obj);// 将对象转json
		System.out.println(studentJson);
		return studentJson;
 
	}
	/**
	 * 将json数据转换成list泛型集合
	 * @param <T>
	 * @param json json数据
	 * @param clazz 将要转换的类
	 * @return
	 */
	public static <T> List<T> getJsonToList(String json,Class<T> clazz) {
		List<T> list= JSON.parseArray(json, clazz);
		return list;
	}

	public static void main(String[] args) throws JSONException, IOException {
		// (1) 创建一个对象并将 给对象赋值 然后使用fastjson转化为json类型的数据
		List<Student> list = new ArrayList<Student>();
		Student student = new Student();
		student.setId(UUID.randomUUID().toString().replaceAll("-", ""));// 生成id
		student.setName("刘莹");
		student.setPassword("123456");
		Student student2 = new Student();
		student2.setId(UUID.randomUUID().toString().replaceAll("-", ""));// 生成id
		student2.setName("张晓琪");
		student2.setPassword("789456");
		list.add(student);
		list.add(student2);
		
		getObjectToString(student2);
		
		
		Student stObj = getJSONToObj(getObjectToString(student2),Student.class);
		System.out.println(stObj.getName()+"---"+stObj.getPassword());
		
		getObjectToString(list);
		
		List<Student> lists = getJsonToList(getObjectToString(list),Student.class);
		for (Student stu : lists) {
			System.out.println("------"+stu.getId());
			System.out.println("------"+stu.getName());
			System.out.println("------"+stu.getPassword());
		}
	}
}
