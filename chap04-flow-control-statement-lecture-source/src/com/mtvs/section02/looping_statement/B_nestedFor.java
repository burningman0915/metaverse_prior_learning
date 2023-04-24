package com.mtvs.section02.looping_statement;

import java.util.Scanner;

public class B_nestedFor {
	public void printGugudanFromTwoToNine() {
		
		/* for문 안에서 for문을 이용할 수 있다.(중첩 반복문) */
		/*
		 * 2 * 1 = 2
		 * 2 * 2 = 4
		 * 2 * 3 = 6
		 * 2 * 4 = 8
		 * 2 * 5 = 10
		 * 2 * 6 = 12
		 * 2 * 7 = 14
		 * 2 * 8 = 16
		 * 2 * 9 = 18
		 * 
		 * 3 * 1 = 3
		 * 3 * 2 = 6
		 * 3 * 3 = 9
		 * 3 * 4 = 12
		 * 3 * 5 = 15
		 * 3 * 6 = 18
		 * 3 * 7 = 21
		 * 3 * 8 = 24
		 * 3 * 9 = 27
		 * 
		 * ...
		 */
		
		for(int i = 2; i <= 9; i++) {	    // i는 단수
			System.out.println("=======" + i + "단 출력 =======");
			for(int j = 1; j <= 9; j++) {	// j는 곱하는 수
				System.out.println(i + " * " + j + " = " + (i * j));
			}
			System.out.println("=====================");
		}
	}
}





