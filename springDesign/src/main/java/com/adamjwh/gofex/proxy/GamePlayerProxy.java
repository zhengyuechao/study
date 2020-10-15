package com.adamjwh.gofex.proxy;

/**
 * 游戏代练
 * @author adamjwh
 *
 */
public class GamePlayerProxy implements IGamePlayer {

	private IGamePlayer gamePlayer = null;
	
	public GamePlayerProxy(IGamePlayer gamePlayer) {
		this.gamePlayer = gamePlayer;
	}

	@Override
	public void login(String user, String password) {
		this.gamePlayer.login(user, password);
	}

	@Override
	public void killBoss() {
		this.gamePlayer.killBoss();
	}

	@Override
	public void upgrade() {
		this.gamePlayer.upgrade();
	}
	
	
	
}
