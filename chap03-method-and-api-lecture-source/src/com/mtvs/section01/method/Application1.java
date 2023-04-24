package com.mtvs.section01.method;

public class Application1 {
	public static void main(String[] args) {		// main()메소드는 자바 프로그램을 실행 및 종료하는 기능을 지님
		
		System.out.println("main() 시작 됨...");
		
		Application1 app1 = new Application1();		
		app1.methodA();
		
		System.out.println("main() 종료...");
	}
	
	public void methodA() {
		
		System.out.println("methodA() 호출 됨...");
		
		methodB();									// static이 안 붙은 메소드들끼리는 쉽게 메소드명으로 호출할 수 있다.
		
		System.out.println("methodA() 종료 됨...");
	}  
	
	public void methodB() {
		
		System.out.println("methodB() 호출 됨...");
		
		methodC();
		
		System.out.println("methodB() 종료 됨...");
	}
	
	public void methodC() {
		
		System.out.println("methodC() 호출 됨...");
		
		System.out.println("methodC() 종료 됨...");
	}
}




