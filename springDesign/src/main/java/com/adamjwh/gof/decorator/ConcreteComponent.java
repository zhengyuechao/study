package com.adamjwh.gof.decorator;

/**
 * 具体构件
 * @author adamjwh
 *
 */
public class ConcreteComponent extends Component {

	@Override
	public void operation() {
		System.out.println("具体对象的操作");
	}

}
