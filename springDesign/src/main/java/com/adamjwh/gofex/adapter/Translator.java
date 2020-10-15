package com.adamjwh.gofex.adapter;

/**
 * 翻译者
 * @author adamjwh
 *
 */
public class Translator extends Player {
	
	private ForeignCenters foreignCenter = new ForeignCenters();

	public Translator(String name) {
		super(name);
		foreignCenter.setName(name);
	}

	@Override
	public void attack() {
		foreignCenter.attackChi();
	}

	@Override
	public void defense() {
		foreignCenter.defenseChi();
	}

}
