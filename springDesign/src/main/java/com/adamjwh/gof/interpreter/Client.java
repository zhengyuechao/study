/**
 * @Title: Client.java
 * @Package com.adamjwh.gof.interpreter
 * @Description: 
 * @author adamjwh
 * @date 2018年7月27日
 * @version V1.0
 */
package com.adamjwh.gof.interpreter;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: Client
 * @Description: 解释器模式
 * @author adamjwh
 * @date 2018年7月27日
 *
 */
public class Client {
	
	public static void main(String[] args) {
		Context context = new Context();
		List<AbstractExpression> list = new ArrayList<>();
		
		list.add(new TerminalExpression());
		list.add(new NonterminalExpression());
		list.add(new TerminalExpression());
		list.add(new TerminalExpression());
		
		for (AbstractExpression abstractExpression : list) {
			abstractExpression.Interpret(context);
		}
	}

}
