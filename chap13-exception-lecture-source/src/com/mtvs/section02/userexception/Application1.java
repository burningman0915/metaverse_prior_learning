package com.mtvs.section02.userexception;

import java.util.Scanner;

import com.mtvs.section02.userexception.exception.MoneyNegativeException;
import com.mtvs.section02.userexception.exception.NotEnoughMoneyException;
import com.mtvs.section02.userexception.exception.PriceNegativeException;

public class Application1 {
	public static void main(String[] args) {

		/*
		 * 이미 정의되어 있는 Exception의 종류는 굉장히 많이 있다.
		 * 하지만 RuntimeException의 후손 대부분은 예외처리를 강제화 하지 않았다.
		 * 간단한 조건문 등으로 처리가 가능하기 때문에 강제화 하지 않았다.(즉, UncheckedException)
		 */
		
		/* ArithmeticException: 어떤 숫자를 0으로 나누면 발생하는 예외 클래스 */
//		Scanner sc = new Scanner(System.in);
//		System.out.print("제수를 하나의 정수로 입력 하시오: ");	// 제수: 나누는 수, 피제수: 나누어 지는 수 
//		
//		int num = 10;
//		int inputNum = sc.nextInt();
//		
//		/* try 블럭 밖에서 선언해야 하는 변수인지와 try 블럭의 코드 범위를 고민할 필요가 있다. */
//		int result = 0;
//		try {
//			result = num / inputNum;		// 0으로 나누면 이 시점에 new ArithmeticException("/by zero")이 발생한다.
//			
//			System.out.println("나눈 결과: " + result);
//		} catch (ArithmeticException e) {
//			System.out.println("예외 발생 이유: " + e.getMessage());
//			System.out.println("0으로 나누다니... 수학을 못하나 보군...");
//		}
//		
//		System.out.println("result값 재활용: " + result);
//		System.out.println("여기도 실행되나?");
		
		/* 하나의 try 블럭에서 여러가지 예외 객체(우리가 예외 클래스를 만듦)가 발생하는 경우 */
		ExceptionTest et = new ExceptionTest();
		
		try {
//			et.checkEnoughMoney(-10000, 20000);		    // 가격 음수로 발생
			et.checkEnoughMoney(10000, -20000);			// 가진 돈 음수로 발생
//			et.checkEnoughMoney(50000, 10000);			// 가진 돈보다 가격이 비싼 예외 발생
			
		} /*catch (PriceNegativeException e) {
			System.out.println(e.getMessage());
			System.out.println("가격이 음수라니...");
		} catch (MoneyNegativeException e) {
			System.out.println(e.getMessage());
			System.out.println("가진 돈이 음수라니...");
		} catch (NotEnoughMoneyException e) {
			System.out.println(e.getMessage());
			System.out.println("돈이 없구나??");
		}*/
		catch (Exception e) {						// 예외 객체들은 Exception의 자식 타입이므로 Exception만으로 처리 가능
			System.out.println(e.getMessage());
			System.out.println("뭔가 예외가 발생했네...");
		}
		
		System.out.println("프로그램을 종료합니다.");
	}
}





