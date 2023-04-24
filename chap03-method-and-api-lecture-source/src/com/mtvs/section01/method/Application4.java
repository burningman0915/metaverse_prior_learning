package com.mtvs.section01.method;

public class Application4 {
	public static void main(String[] args) {
		
		/* 여러 개의 전달인자를 이용한 메소드 호출 테스트 */
		Application4 app4 = new Application4();
		app4.testMethod("흥민쏜", 29, '남');		// 매개변수 있는 메소드를 호출할 때는 전달인자의 자료형과 순서에 유의하자.
		
		/* 변수에 저장된 값을 전달인자로 전달하며 메소드 호출(가독성이 좋음) */
		String name = "유관순";
		int age = 21;
		char gender = '여';
		
		app4.testMethod(name, age, gender);
	}
	
	public void testMethod(String name, int age, final char GENDER) {
		
		name = "이순신";
		age = 33;
//		GENDER = '여';		// final로 선언 된 매개변수에는 값이 더 이상 대입될 수 없다.
		
		System.out.println("당신의 이름은 " + name + "이고, 나이는 "
				           + age + "세이며, 성별은 " + GENDER + "입니다.");
	}
}
