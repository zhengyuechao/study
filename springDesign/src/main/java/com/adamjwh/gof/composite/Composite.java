package com.adamjwh.gof.composite;

import java.util.ArrayList;

/**
 * 树枝构件
 * @author adamjwh
 *
 */
public class Composite extends Component {

	public Composite(String name) {
		super(name);
	}

	//构建容器
	private ArrayList<Component> componentArrayList = new ArrayList<Component>();
	
	@Override
	public void add(Component component) {
		this.componentArrayList.add(component);
	}

	@Override
	public void remove(Component component) {
		this.componentArrayList.remove(component);
	}

	@Override
	public void display(int depth) {
		//输出树形结构
		for(int i=0; i<depth; i++) {
			System.out.print('-');
		}
		System.out.println(name);
		
		//下级遍历
		for (Component component : componentArrayList) {
			component.display(depth + 1);
		}
	}

}
