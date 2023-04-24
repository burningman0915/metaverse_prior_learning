package com.mtvs.section01.method;

public class Application6 {
	public static void main(String[] args) {

		/* 메소드 리턴값 테스트 */
		Application6 app6 = new Application6();
		
		/* 메소드의 리턴값을 여러번 활용 할 경우에는 변수에 담는게 좋다. */
		String returnTest = app6.testMethod();
		System.out.println("메소드 반환값: " + returnTest);
		
		/* 한번만 호출해서 리턴값을 활용 할 경우에는 따로 변수에 안 담아도 좋다. */
		System.out.println("메소드 반환값: " + app6.testMethod());
	}
	
	public String testMethod() {
		return "Hello World";
	}
}





