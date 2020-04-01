package com.study.gof.crp;
/**
 * 
 * 责任链模式（Chain of Responsibility Pattern）为请求创建了一个接收者对象的链。
 * 这种模式给予请求的类型，对请求的发送者和接收者进行解耦。这种类型的设计模式属于行为型模式。
在这种模式中，通常每个接收者都包含对另一个接收者的引用。如果一个对象不能处理该请求，
那么它会把相同的请求传给下一个接收者，依此类推。
* @ClassName: AbstractLogger 
* @Description: 
* @Author z
* @DateTime 2020年3月3日 上午8:00:38
 */
public class AbstractLogger {

	public static void main(String[] args) {
		String condition = "";
	}
}
