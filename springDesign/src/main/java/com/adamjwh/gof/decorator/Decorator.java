package com.adamjwh.gof.decorator;

/**
 * 抽象装饰者
 * @author adamjwh
 *
 */
public abstract class Decorator extends Component {

	private Component component = null;
	
	public Decorator(Component component) {
		this.component = component;
	}
	
	@Override
	public void operation() {
		if(component != null) {
			this.component.operation();
		}
	}
	
}
