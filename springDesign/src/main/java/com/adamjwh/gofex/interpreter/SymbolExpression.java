/**
 * @Title: SymbolExpression.java
 * @Package com.adamjwh.gofex.interpreter
 * @Description: 
 * @author adamjwh
 * @date 2018年7月28日
 * @version V1.0
 */
package com.adamjwh.gofex.interpreter;

import java.util.HashMap;

/**
 * @ClassName: SymbolExpression
 * @Description: 抽象运算符号解析器
 * @author adamjwh
 * @date 2018年7月28日
 *
 */
public class SymbolExpression extends Expression {
	
	protected Expression left;
	protected Expression right;

	public SymbolExpression(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public int interpreter(HashMap<String, Integer> var) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
