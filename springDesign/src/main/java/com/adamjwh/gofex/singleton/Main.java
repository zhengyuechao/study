package com.adamjwh.gofex.singleton;

/**
 * 单例模式——当朝皇帝
 * @author adamjwh
 *
 */
public class Main {

	public static void main(String[] args) {
		//臣子朝拜
		for(int day=0; day<3 ;day++) {
			Emperor emperor = Emperor.getEmperor();
			emperor.say();
		}
	}
	
}
