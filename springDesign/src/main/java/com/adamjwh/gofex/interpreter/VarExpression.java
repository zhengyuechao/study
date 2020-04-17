/**
 * @Title: VarExpression.java
 * @Package com.adamjwh.gofex.interpreter
 * @Description: 
 * @author adamjwh
 * @date 2018年7月28日
 * @version V1.0
 */
package com.adamjwh.gofex.interpreter;

import java.util.HashMap;

/**
 * @ClassName: VarExpression
 * @Description: 变量解析器
 * @author adamjwh
 * @date 2018年7月28日
 *
 */
public class VarExpression extends Expression {
	
	private String key;
	
	public VarExpression(String key) {
		this.key = key;
	}

	@Override
	public int interpreter(HashMap<String, Integer> var) {
		return var.get(this.key);
	}

}
