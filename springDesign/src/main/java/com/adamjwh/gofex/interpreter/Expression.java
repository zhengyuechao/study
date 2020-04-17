/**
 * @Title: Expression.java
 * @Package com.adamjwh.gofex.interpreter
 * @Description: 
 * @author adamjwh
 * @date 2018年7月27日
 * @version V1.0
 */
package com.adamjwh.gofex.interpreter;

import java.util.HashMap;

/**
 * @ClassName: Expression
 * @Description: 抽象表达式类
 * @author adamjwh
 * @date 2018年7月27日
 *
 */
public abstract class Expression {
	
	//解析公式和数值，key是公式中的参数，value是具体的数值
	public abstract int interpreter(HashMap<String, Integer> var);

}
