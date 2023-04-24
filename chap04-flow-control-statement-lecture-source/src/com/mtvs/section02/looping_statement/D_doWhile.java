package com.mtvs.section02.looping_statement;

import java.util.Scanner;

public class D_doWhile {
	public void testSimpleDoWhileStatement() {
		do {
			System.out.println("do While 실행");
		} while(false);
	}

	public void testDoWhileExample1() {
		
		/*
		 * 키보드로 문자열 입력 받아 반복적으로 출력
		 * 단, "exit"가 입력이 되면 반복문을 종료한다.
		 */
		
		/*
		 * do {
		 *    입력받은 문자열 출력
		 * } while(입력받은 문자열이 "exit"가 아니라면);
		 */
		
		/*
		 * equals(): 문자열이 같은지 비교할 때 사용
		 *           문자열이 같으면 true를 반환하고 그렇지 않으면 false를 반환한다.
		 *           (문자열은 ==으로 비교가 안되는 경우가 있다는 정도로 이해하자 (이후 배우게 됨)) 
		 */
		
		/* do-while일 때 */
		Scanner sc = new Scanner(System.in);
		String str = "exit";
		do {
			System.out.print("문자열을 입력하세요: ");
			str = sc.nextLine();
			System.out.println("입력받은 문자열: " + str);
		} while(!str.equals("exit"));
		
		/* while일 때 */
//		Scanner sc = new Scanner(System.in);
//		String str = "exit";
//		while(!str.equals("exit")) {
//			System.out.print("문자열을 입력하세요: ");
//			str = sc.nextLine();
//			System.out.println("입력받은 문자열: " + str);
//		}
	}
}






