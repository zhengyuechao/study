/**
 * @Title: SubExpression.java
 * @Package com.adamjwh.gofex.interpreter
 * @Description: 
 * @author adamjwh
 * @date 2018年7月28日
 * @version V1.0
 */
package com.adamjwh.gofex.interpreter;

import java.util.HashMap;

/**
 * @ClassName: SubExpression
 * @Description: 减法解析器
 * @author adamjwh
 * @date 2018年7月28日
 *
 */
public class SubExpression extends SymbolExpression {
	
	public SubExpression(Expression left, Expression right) {
		super(left, right);
	}
	
	public int interpreter(HashMap<String, Integer> var) {
		return super.left.interpreter(var) - super.right.interpreter(var);
	}

}
