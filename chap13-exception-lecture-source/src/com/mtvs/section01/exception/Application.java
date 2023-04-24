package com.mtvs.section01.exception;

public class Application {
	public static void main(String[] args) throws Exception {

		/* throws를 활용한 예외 처리 */
		ExceptionTest et = new ExceptionTest();
		
//		et.checkEnoughMoney(10000, 50000);	// main에서 throws로 처리
		
		et.checkEnoughMoney(50000, 10000);	// 예외가 발생하면 메소드는 이 시점에서 return;
											// (JVM이 처리 - e.printStackTrace()를 통한 빨간 글씨 구문 출력 + 강제 종료)
		
		System.out.println("프로그램을 종료합니다.");
	}
}
