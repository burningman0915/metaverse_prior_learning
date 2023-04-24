package com.mtvs.section02.looping_statement;

import java.util.Scanner;

public class C_while {
	public void testSimpleWhileStatement() {
		
		/* 반복문의 기본 흐름 테스트 */
		
		/* 1부터 10까지 1씩 증가시키면서 i값을 출력하는 기본 반복문 */
//		int i = 1;
//		while(i <= 10) {
//			System.out.println(i + "출력");
//			i++;
//		}
		
		/*
		 * while을 쓰는게 적합한 경우(for문과 달리 예측 가능하지 않거나 조건이 항상 true로 할 경우 사용) 
	     * 반복의 횟수가 정해지지 않고 조건식만 쓸 때 
	     */
		/* length(): 문자열의 길이를 int형으로 반환하는 기능 */ 
		
		Scanner sc = new Scanner(System.in);
		String answer = "";
		while(!(answer.equals("y"))) {		// answer에 담긴 문자열이 "y"와 같지 않다면 true
			System.out.print("종료하고 싶다면 'y'를 입력하세요: ");
			answer = sc.next();
		}
	}

	public void testWhileExample1() {
		
		/* 입력한 문자열의 인덱스를 이용하여 문자 하나씩 출력해 보자 */
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력: ");
		String str = sc.nextLine();
		
		/*
		 * charAt(): 문자열에서 인덱스에 해당하는 문자를 char형으로 반환하는 기능
		 * length(): 문자열의 길이를 int형으로 반환하는 기능 
		 */
		System.out.println(str.charAt(1));		// 입력한 문자열의 두번째 문자
		System.out.println(str.length());		// 입력한 문자열의 길이
		
		System.out.println("======= for문 ========");
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			System.out.println(i + "번째 인덱스: " + ch);
		}
		
		System.out.println("======= while문 ========");
		int i = 0;
		while(i < str.length()) {
			char ch = str.charAt(i);
			System.out.println(i + "번째 인덱스: " + ch);
			i++;
		}
	}
}







