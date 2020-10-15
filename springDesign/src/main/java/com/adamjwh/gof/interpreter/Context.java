/**
 * @Title: Context.java
 * @Package com.adamjwh.gof.interpreter
 * @Description: 
 * @author adamjwh
 * @date 2018年7月27日
 * @version V1.0
 */
package com.adamjwh.gof.interpreter;

/**
 * @ClassName: Context
 * @Description: 环境角色
 * @author adamjwh
 * @date 2018年7月27日
 *
 */
public class Context {

	private String input;
	private String output;
	
	public String getInput() {
		return input;
	}
	public void setInput(String input) {
		this.input = input;
	}
	public String getOutput() {
		return output;
	}
	public void setOutput(String output) {
		this.output = output;
	}
	
}
