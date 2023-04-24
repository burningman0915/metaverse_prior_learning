package com.mtvs.section01.method;

public class Application5 {
	public static void main(String[] args) {
		
		System.out.println("main()메소드 시작함...");
		
		Application5 app5 = new Application5();
		app5.testMethod();
		
		System.out.println("main()메소드 종료 됨...");
		return;
	}
	
	public void testMethod() {
		System.out.println("testMethod() 동작 확인...");
		return;
	}
}
