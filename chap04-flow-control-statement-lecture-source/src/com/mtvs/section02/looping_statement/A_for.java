package com.mtvs.section02.looping_statement;

import java.util.Scanner;

public class A_for {
	public void testSimpleForStatement() {
		
		/* 1부터 10까지 1씩 증가하면서(10번 반복) i값을 출력해 보는 기본 반복문 */
		/*
		 * 동안(1부터; 10까지; 1씩 증가) {
		 * 		i값 출력;
		 * }
		 */
		
//		for(int i = 1; i <= 10; i++) {
//			System.out.println(i + " 출력");
//		}
		
		/* 10부터 1까지 반복하며 출력하는 반복문 만들기 */
//		for(int i = 10; i >= 1; i--) {
//			System.out.println(i + " 출력");
//		}
		
		/* 1부터 10까지 출력되게 하는 반복문 만들어 보기 */
		int num = 0;
		for(int i = 2; i < 12; i++) {
//			System.out.println((i - 1) + " 출력");	// 왠만하면 for문의 지역변수를 활용하자.
			System.out.println((++num) + " 출력");
		}
	}
}













