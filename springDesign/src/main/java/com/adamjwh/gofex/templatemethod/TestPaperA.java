/**
 * @Title: TestPaperA.java
 * @Package com.adamjwh.gofex.templatemethod
 * @Description: 
 * @author adamjwh
 * @date 2018年5月29日
 * @version V1.0
 */
package com.adamjwh.gofex.templatemethod;

/**
 * @ClassName: TestPaperA
 * @Description: 学生甲的试卷
 * @author adamjwh
 * @date 2018年5月29日
 *
 */
public class TestPaperA extends TestPaper {

	@Override
	protected String answer1() {
		return "d";
	}

	@Override
	protected String answer2() {
		return "c";
	}

	@Override
	protected String answer3() {
		return "a";
	}
	
}
