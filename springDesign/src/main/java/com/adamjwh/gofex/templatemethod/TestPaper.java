/**
 * @Title: TestPaper.java
 * @Package com.adamjwh.gofex.templatemethod
 * @Description: 
 * @author adamjwh
 * @date 2018年5月29日
 * @version V1.0
 */
package com.adamjwh.gofex.templatemethod;

/**
 * @ClassName: TestPaper
 * @Description: 试卷父类
 * @author adamjwh
 * @date 2018年5月29日
 *
 */
public abstract class TestPaper {

	//问题
	public void question1() {
		System.out.println("博主帅不帅？【】 a.帅 b.很帅 c。非常帅 d。帅出了天际");
		System.out.println("答案：" + answer1());
	}
	
	public void question2() {
		System.out.println("博主聪不聪明？【】 a.聪明 b.很聪明 c.非常聪明 d.超出了人类的范畴");
		System.out.println("答案：" + answer2());
	}
	
	public void question3() {
		System.out.println("博主最擅长什么？【】 a.Java b.C/C++ c.Python d.Android");
		System.out.println("答案：" + answer3());
	}
	
	//答案
	protected abstract String answer1();
	
	protected abstract String answer2();
	
	protected abstract String answer3();
}
