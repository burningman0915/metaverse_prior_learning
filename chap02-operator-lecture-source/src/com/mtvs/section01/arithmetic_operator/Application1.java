package com.mtvs.section01.arithmetic_operator;

public class Application1 {
	public static void main(String[] args) {
		
		/* 산술 연산자 */
		int num1 = 20;
		int num2 = 7;
		
		System.out.println("num1 + num2 = " + (num1 + num2));			// 27
		System.out.println("num1 - num2 = " + (num1 - num2));			// 13
		System.out.println("num1 * num2 = " + (num1 * num2));			// 140
		System.out.println("num1 / num2 = " + (num1 / (double)num2));	// 2.857142857142857
		System.out.println("num1 % num2 = " + (num1 % num2));			// 6
		
		System.out.println(((num1 * 100) / num2) / 100.0);				// 2.85, 소수점 셋째자리부터 버림 효과 내기
	}
}




