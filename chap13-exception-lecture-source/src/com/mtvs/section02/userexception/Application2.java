package com.mtvs.section02.userexception;

import com.mtvs.section02.userexception.exception.MoneyNegativeException;
import com.mtvs.section02.userexception.exception.NotEnoughMoneyException;
import com.mtvs.section02.userexception.exception.PriceNegativeException;

public class Application2 {
	public static void main(String[] args) {
		
		/* multi-catch */
		/*
		 * JDK 1.7에서 추가 된 구문으로
		 * 동일한 레벨의 다른 타입의 예외를 하나의 catch블럭으로 다룰 수 있다.
		 */
		
		ExceptionTest et = new ExceptionTest();
		try {
			
			/* 3가지의 예외 발생 가능성이 있는 메소드 호출 */
			et.checkEnoughMoney(20000, 30000);
			
		/* 예외 상황별로 catch블럭을 따로 작성 가능 */
		} catch (PriceNegativeException | MoneyNegativeException e) {	// 동일 레벨 예외 처리
			System.out.println("입력 값이 음수일 경우 예외 발생!");
			System.out.println(e.getMessage());				// 발생한 예외 객체의 메세지
			System.out.println(e.getClass() + " 발생!");		// 발생한 예외 객체의 자료형(class 풀 클래스명)
		} catch (NotEnoughMoneyException e) {
			
			/*
			 * 예외 클래스명, 예외 발생 위치, 예외 메세지 등을 stack호출 역순으로
			 * 빨간색 글씨를 이용해서 로그 형태로 출력해 주는 기능
			 */
			e.printStackTrace();
		} catch (Exception e) {		// 예외 처리 범위가 클수록 아래쪽에서 처리
			                        // (나머지 모든 예외 처리를 위해 Exception으로 catch)
			e.printStackTrace();
		} finally {
			
			/* try-catch문에서 예외 발생 여부와 상관없이 실행 할 내용 */
			System.out.println("finally 블럭 내용이 동작함...");
		}
		
		System.out.println("프로그램을 종료합니다.");
	}
}
