package com.adamjwh.gofex.adapter;

/**
 * 适配器模式——教练的翻译官
 * @author adamjwh
 *
 */
public class Client {

	public static void main(String[] args) {
		Player bPlayer = new Forwards("巴蒂尔");
		bPlayer.attack();
		
		Player mPlayer = new Guards("麦克格雷迪");
		mPlayer.attack();
		
		Player yPlayer = new Translator("姚明");
		yPlayer.attack();
		yPlayer.defense();
	}
	
}
