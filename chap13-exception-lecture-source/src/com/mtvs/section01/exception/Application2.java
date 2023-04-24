package com.mtvs.section01.exception;

public class Application2 {
	public static void main(String[] args) {
		ExceptionTest et = new ExceptionTest();
		
		/* try-catch를 활용한 예외처리 */
		
		/*
		 * 예외 객체 발생 방법
		 * throw new 예외클래스생성자;	(예외클래스: Exception 클래스를 상속받은 클래스)
		 * 
		 * 예외 처리 방법(예외(Exception)객체 처리 방법)
		 * 1. throws로 위임
		 * 2. try-catch로 직접 처리
		 */
		try {
			/* 예외발생 가능성이 있는 메소드(throws로 처리 된 메소드)가 try 블럭 안에서 호출된다. */
			et.checkEnoughMoney(50000, 10000);		// 예외가 발생하는 경우 
			
			/* 위의 전달인자는 메소드 호출 시 예외가 발생하므로 try블럭의 나머지 부분은 실행되지 않는다. */
			System.out.println("============ 상품 구입 가능 ==============");
		} catch (Exception e) {
			
			/* 예외가 발생하는 경우 catch블럭의 코드가 실행된다. */
			System.out.println("============ 상품 구입 불가능 ==============");
//			e.printStackTrace();					// 빨간 글씨로 에러 문구 출력 시
//			System.exit(0);							// 강제 종료 시키는 것으로 처리 시
		}
		
		System.out.println("프로그램을 종료합니다.");
	}
}
