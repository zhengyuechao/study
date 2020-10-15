/**
 * @Title: Client.java
 * @Package com.adamjwh.gofex.templatemethod
 * @Description: 
 * @author adamjwh
 * @date 2018年5月29日
 * @version V1.0
 */
package com.adamjwh.gofex.templatemethod;

/**
 * @ClassName: Client
 * @Description: 模板方法模式——写试卷
 * @author adamjwh
 * @date 2018年5月29日
 *
 */
public class Client {

	public static void main(String[] args) {
		System.out.println("学生甲的试卷：");
		TestPaper studentA = new TestPaperA();
		studentA.question1();
		studentA.question2();
		studentA.question3();
		
		//分隔符
		System.out.println("------------------------------------------------");
		
		System.out.println("学生乙的试卷：");
		TestPaper studentB = new TestPaperB();
		studentB.question1();
		studentB.question2();
		studentB.question3();
	}
	
}
