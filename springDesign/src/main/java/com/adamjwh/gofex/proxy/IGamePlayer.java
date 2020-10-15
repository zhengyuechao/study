package com.adamjwh.gofex.proxy;

/**
 * 游戏玩家接口
 * @author adamjwh
 *
 */
public interface IGamePlayer {
	//登陆
	public void login(String user, String password);
	//杀怪
	public void killBoss();
	//升级
	public void upgrade();
}
