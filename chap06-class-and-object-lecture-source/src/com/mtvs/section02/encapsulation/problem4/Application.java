package com.mtvs.section02.encapsulation.problem4;

public class Application {
	public static void main(String[] args) {
		
		/* Monster 클래스의 필드에 private 적용 후 직접 접근이 안됨을 확인 */
		Monster monster1 = new Monster();
//		monster1.kinds = "드라큘라";
//		monster1.hp = 100;
		
		/* setter를 통해 객체의 필드에 값을 대입 */
		monster1.setInfo("드라큘라");
		monster1.setHp(100);
		
//		System.out.println(monster1.kinds);
//		System.out.println(monster1.hp);
		
		/* getter를 통해 객체의 필드를 반환받음 */
		System.out.println(monster1.getInfo());
		System.out.println(monster1.getHp());
	}
}
