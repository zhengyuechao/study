/**
 * @Title: Handler.java
 * @Package com.adamjwh.gof.chain_of_responsibility
 * @Description: 
 * @author adamjwh
 * @date 2018年7月27日
 * @version V1.0
 */
package com.adamjwh.gof.chain_of_responsibility;

/**
 * @ClassName: Handler
 * @Description: 抽象处理者
 * @author adamjwh
 * @date 2018年7月27日
 *
 */
public abstract class Handler {
	
	private Handler nextHandler;	//下一个处理者
	
	public final Response handlerMessage(Request request) {
		Response response = null;
		
		if(this.getHandlerLevel().equals(request.getRequestLevel())) {	//判断是否是自己的处理级别
			response = this.echo(request);
		} else {
			if(this.nextHandler != null) {	//下一处理者不为空
				response = this.nextHandler.handlerMessage(request);
			} else {
				//没有适当的处理者，业务自行处理
			}
		}
		
		return response;
	}
	
	//设定下一个处理者
	public void setNext(Handler handler) {
		this.nextHandler = handler;
	}
	
	//每个处理者的处理等级
	protected abstract Level getHandlerLevel();
	
	//每个处理者都必须实现的处理任务
	protected abstract Response echo(Request request);

}
