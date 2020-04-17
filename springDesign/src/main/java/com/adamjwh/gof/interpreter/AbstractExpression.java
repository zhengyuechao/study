/**
 * @Title: AbstractExpression.java
 * @Package com.adamjwh.gof.interpreter
 * @Description: 
 * @author adamjwh
 * @date 2018年7月27日
 * @version V1.0
 */
package com.adamjwh.gof.interpreter;

/**
 * @ClassName: AbstractExpression
 * @Description: 抽象解释器
 * @author adamjwh
 * @date 2018年7月27日
 *
 */
public abstract class AbstractExpression {
	public abstract void Interpret(Context context);
}
