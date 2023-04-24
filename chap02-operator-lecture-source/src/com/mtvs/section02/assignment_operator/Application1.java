package com.mtvs.section02.assignment_operator;

public class Application1 {
	public static void main(String[] args) {
		
		/* 단순 대입 연산자와 산술 복합 대입 연산자 */
		int num = 12;
		System.out.println("num: " + num);		// 12		
		
		num = num + 3;
		System.out.println("num: " + num);		// 15
		
		num += 3;
		System.out.println("num: " + num);		// 18
		
		num -= 5;	// num = num - 5
		System.out.println("num: " + num);		// 13
		
		num *= 2;
		System.out.println("num: " + num);		// 26
		
		num /= 2;
		System.out.println("num: " + num);		// 13
		
		num =- 3;								// 이건 -3을 대입하는 것과 같다.(복합 대입 연산자는 '='가 오른편에 온다.)
		System.out.println("num: " + num);		// -3
	}
}
