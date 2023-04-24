package com.mtvs.section01.conditional_statement;

import java.util.Scanner;

public class D_switch {

	public void testSimpleSwitchStatement() {
		
		/*
		 * 정수 두 개와 연산 기호 문자를 입력 받아서
		 * 두 숫자의 연산 결과를 출력해 보는 간단한 계산기 만들기
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 입력: ");
		int first = sc.nextInt();
		System.out.print("두 번째 정수 입력: ");
		int second = sc.nextInt();
		System.out.print("연산 기호 입력(+, -, *, /, %): ");
		char op = sc.next().charAt(0);
		
//		switch(op) {
//			case '+':
//				System.out.println(first + " " + op + " " + second + " = " + (first + second));
//				break;
//			case '-':
//				System.out.println(first + " " + op + " " + second + " = " + (first - second));
//				break;
//			case '*':
//				System.out.println(first + " " + op + " " + second + " = " + (first * second));
//				break;
//			case '/':
//				System.out.println(first + " " + op + " " + second + " = " + (first / second));
//				break;
//			case '%':
//				System.out.println(first + " " + op + " " + second + " = " + (first % second));
//				break;
//			default:
//				System.out.println("연산자를 올바르게 입력해 주세요");
//		}
		
		/* 개선된 코드(case별 해당 결과를 한번에 출력하자(쓸데없는 중복 코드 제거)) */
		int result = 0;
		switch(op) {
			case '+':
				result = first + second;
				break;
			case '-':
				result = first - second;
				break;
			case '*':
				result = first * second;
				break;
			case '/':
				result = first / second;
				break;
			case '%':
				result = first % second;
				break;
			default:
				System.out.println("연산자를 올바르게 입력해 주세요");
		}
		
		if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
			System.out.println(first + " " + op + " " + second + " = " + result);
		}
	}
}



