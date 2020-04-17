/**
 * @Title: TerminalExpression.java
 * @Package com.adamjwh.gof.interpreter
 * @Description: 
 * @author adamjwh
 * @date 2018年7月27日
 * @version V1.0
 */
package com.adamjwh.gof.interpreter;

/**
 * @ClassName: TerminalExpression
 * @Description: 终结符表达式
 * @author adamjwh
 * @date 2018年7月27日
 *
 */
public class TerminalExpression extends AbstractExpression {

	@Override
	public void Interpret(Context context) {
		System.out.println("终端解释器");
	}

}
