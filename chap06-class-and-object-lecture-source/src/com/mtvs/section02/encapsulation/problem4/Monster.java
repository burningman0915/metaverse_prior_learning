package com.mtvs.section02.encapsulation.problem4;

public class Monster {
	private String kinds;
	private int hp;
	
	/* setter */
	public void setInfo(String info) {
		this.kinds = info;
	}
	
	public void setHp(int hp) {
		if(hp >= 0) this.hp = hp;
	}
	
	/* getter */
	public String getInfo() {
		return this.kinds;
	}
	
	public int getHp() {
		return this.hp;
	}
}



