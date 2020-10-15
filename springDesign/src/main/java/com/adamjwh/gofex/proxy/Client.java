package com.adamjwh.gofex.proxy;

/**
 * 代理模式——游戏代练打怪升级
 * @author adamjwh
 *
 */
public class Client {
	
	public static void main(String[] args) {
		//定义一个玩家
		IGamePlayer player = new GamePlayer("桐人");
		//定义一个代练
		IGamePlayer proxy = new GamePlayerProxy(player);
		
		//开始打游戏
		//登陆
		proxy.login("adam", "123456");
		//开始杀怪
		proxy.killBoss();
		//升级
		proxy.upgrade();
	}

}
