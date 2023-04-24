package com.mtvs.section02.encapsulation.problem1;

public class Monster {
	String name;		// 몬스터 이름
	int hp;				// 몬스터 체력
	
	public void setHp(int hp) {
		if(hp >= 0) {		// 전달받은 hp가 양수 또는 0일 때
			System.out.println("양수값이 입력되어 몬스터의 체력을 입력한 값으로 변경합니다.");
		    this.hp = hp;	// 현재 이 메소드를 호출하는 객체 == this
		} else {			// 전달 받은 hp가 음수일 때
			System.out.println("0보다 작은 값이 입력되어 몬스터의 체력을 0으로 변경합니다.");
//			this.hp = 0;	// 0으로 대입할꺼면 이미 JVM이 객체를 만들 때 hp칸에는 int의 default(기본)값인 0을 채워 뒀기 때문에 안 해도 된다.
		}
	}
	
	/*
	 * 메소드에서의 this는 두가지 의미를 지닌다.
	 * 1. 매개변수인 int hp와 필드의 hp를 구분하기 위한 용도
	 * 2. 메소드를 호출할 당시 접근할 때 썼던 인스턴스를 의미하는 용도.
	 */
	
}
