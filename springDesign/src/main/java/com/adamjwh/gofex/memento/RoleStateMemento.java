/**
 * @Title: RoleStateMemento.java
 * @Package com.adamjwh.gofex.memento
 * @Description: 
 * @author adamjwh
 * @date 2018年7月31日
 * @version V1.0
 */
package com.adamjwh.gofex.memento;

/**
 * @ClassName: RoleStateMemento
 * @Description: 角色状态存储箱
 * @author adamjwh
 * @date 2018年7月31日
 *
 */
public class RoleStateMemento {
	
	private int vit;	//生命力
	private int atk;	//攻击力
	private int def;	//防御力
	
	public RoleStateMemento(int vit, int atk, int def) {
		this.vit = vit;
		this.atk = atk;
		this.def = def;
	}

	public int getVit() {
		return vit;
	}

	public void setVit(int vit) {
		this.vit = vit;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}
	
}
