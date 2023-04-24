package com.mtvs.section01.literal;

public class Application1 {

	public static void main(String[] args) {
		
		// 한줄 주석
		
	    /*
		   범위 주석
	     */
		
		/* 범위 주석 */
		
		/* 여러가지 값의 형태를 출력해 보자 */
		/*
		 * 1. 숫자 형태의 값
		 * 	1-1. 정수 형태의 값
		 * 	1-2. 실수 형태의 값
		 * 2. 문자 형태의 값
		 * 3. 문자열 형태의 값
		 * 4. 논리 형태의 값
		 */
		
		/* 1. 숫자 형태의 값 */
		/* 1-1. 정수 형태의 값 출력 */
		System.out.println(123);
		System.out.println(-123);
		
		/* 1-2. 실수 형태의 값 출력 */
		System.out.println(1.23);
		System.out.println(-1.23);
		
		/* 2. 문자(한 글자) 형태의 값 */
		System.out.println('a');		// 문자 형태의 값은 홑따옴표(single-quotation)으로 감싸 주어야 한다.
//		System.out.println('ab');		// 두 개 이상의 문자는 문자로 취급하지 않기 때문에 컴파일 에러가 발생한다.
//		System.out.println('');     	// 아무 문자도 기록되지 않는 경우도 컴파일 에러가 발생한다.
		System.out.println('1');    	// 숫자 값이지만 홑따옴표로 감싸져 있는 경우 문자 '1'이라고 판단한다.
		
		/* 3. 문자열 형태의 값 */
		System.out.println("안녕하세요");  // 문자열은 문자 여러 개가 나열 된 형태를 말하며 쌍따옴표(double-quotation)으로 감싸 주어야 한다.
		System.out.println("123");		// 정수이지만 쌍따옴표로 감싸져 있기 때문에 문자열로 보아야 한다. 
		System.out.println("");			// 아무 것도 없는 빈 쌍따옴표도 에러 없이 문자열로 취급한다.
		System.out.println("a");		// 한 개의 문자도 쌍따옴표로 감싸면 문자열이다.(주의! 문자 'a'와는 다르다!)
		
		/* 4. 논리 형태의 값 출력 */
		System.out.println(true);		// true 혹은 false 값을 논리형이라고 한다.
		System.out.println(false);

	}

}
