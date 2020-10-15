/**
 * @Title: AddExpression.java
 * @Package com.adamjwh.gofex.interpreter
 * @Description: 
 * @author adamjwh
 * @date 2018年7月28日
 * @version V1.0
 */
package com.adamjwh.gofex.interpreter;

import java.util.HashMap;

/**
 * @ClassName: AddExpression
 * @Description: 加法解析器
 * @author adamjwh
 * @date 2018年7月28日
 *
 */
public class AddExpression extends SymbolExpression {

	public AddExpression(Expression left, Expression right) {
		super(left, right);
	}
	
	public int interpreter(HashMap<String, Integer> var) {
		return super.left.interpreter(var) + super.right.interpreter(var);
	}

}
