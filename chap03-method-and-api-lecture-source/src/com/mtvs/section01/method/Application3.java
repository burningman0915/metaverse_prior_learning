package com.mtvs.section01.method;

/* 전달인자(argument)와 매개변수(parameter) */
public class Application3 {	
	public static void main(String[] args) {

		Application3 app3 = new Application3();
		
		/* 전달인자로 19를 전달하여 메소드 호출 테스트 */
		app3.testMethod(19);				// 19는 전달인자
		
		int age = 20;
		app3.testMethod(age);
		
		/* 자동형변환을 이용하여 값을 전달할 수 있다. */
		byte byteAge = 10;
		app3.testMethod(byteAge);
		
		/* 강제형변환을 이용하여 값을 전달할 수 있다. */
		long longAge = 80L;
		app3.testMethod((int)longAge);
		
		/* 연산 결과를 이용해서 값을 전달할 수 있다. */
		app3.testMethod(age * 3);
	}
	
	public void testMethod(int age) {		// age는 매개변수 (내부적으로 int age = 19)
		System.out.println("당신의 나이는 " + age + "세 입니다.");
	}
}
