package com.mtvs.section01.literal;

public class Application2 {
	public static void main(String[] args) {
		
		/*
		 * 출력 시 값을 직접 연산하여 출력할 수도 있다.
		 * 이 때 값의 형태에 따라 사용할 수 있는 연산자의 종류와 연산의 결과가 달라진다.
		 */
		
		/* 1. 숫자와 숫자의 연산 */
		/* 1-1. 정수와 정수의 연산 */
		/* 수학적으로 사용하는 사칙연산 외에 추가적으로 나머지를 구하는 연산(mod 혹은 modulus)을 사용할 수 있다. */
		System.out.println("=========== 정수와 정수의 연산 =============");
		System.out.println(123 + 456);		// 579
		System.out.println(123 - 23);  		// 100
		System.out.println(123 * 10); 		// 1230
		System.out.println(123 / 10); 		// 12, 정수와 정수의 연산은 그 결과가 정수(소수점 이하 무시(버림 o, 반올림 x))
		System.out.println(123 % 10);		// 3, modulus == mod, 피제수 나누기 제수를 했을 때의 나머지
	
		/* 1-2. 실수와 실수의 연산 */
		/* 실수끼리도 연산 시 수학에서 사용하는 사칙연산 외에 mod를 사용할 수 있다. */
		System.out.println("=========== 실수와 실수의 연산 =============");
		System.out.println(1.23 + 1.23);	// 2.46
		System.out.println(1.23 - 1.23);	// 0.0
		System.out.println(1.23 * 1.23);	// 1.5129
		System.out.println(1.23 / 1.23);	// 1.0
		System.out.println(1.23 % 1.0);		// 0.22999999999999998, 약간의 오차가 발생한다. 
		                                    // (왜냐하면 컴퓨터는 실수를 정확하게 인지하지 않는 체계이기 때문이다.)
		
		/* 1-3. 정수와 실수의 연산 */
		/* 정수와 실수의 연산 시 수학에서 사용하는 사칙연산 외에 mod를 사용할 수 있다. */
		System.out.println("=========== 정수와 실수의 연산 =============");
		System.out.println(123 + 0.5);		// 123.5
		System.out.println(123 - 0.5);		// 122.5
		System.out.println(123 * 0.5);		// 61.5
		System.out.println(123 / 0.5);		// 246.0
		System.out.println(123 % 0.5);		// 0.0
		
		/* 2. 문자의 연산 */
		/* 2-1. 문자와 문자의 연산 */
		/* 문자끼리의 연산도 사칙연산에 mod 연산까지 가능하다. */
		System.out.println("=========== 문자와 문자의 연산 =============");
		System.out.println('a' + 'b');		// 195
		System.out.println('a' - 'b');		// -1
		System.out.println('a' * 'b');		// 9506
		System.out.println('a' / 'b');		// 0
		System.out.println('a' % 'b');		// 97
		
		/* 3. 문자열의 연산 */
		/* 3-1. 문자열과 문자열의 연산 */
		System.out.println("=========== 문자열과 문자열의 연산 =============");
		System.out.println();	            // 엔터 효과를 낼 수 있다.
		System.out.println();
		System.out.println();
		
		/* 문자열과 문자열은 '+'연산 외에 다른 연산을 사용하지 못하며 문자열 합치기(이어붙이기)가 된다. */
		System.out.println("hello" + "hello");	// hellohello
//		System.out.println("hello" - "hello");	// 컴파일 에러 발생
//		System.out.println("hello" * "hello");	// 컴파일 에러 발생
//		System.out.println("hello" / "hello");	// 컴파일 에러 발생
//		System.out.println("hello" % "hello");	// 컴파일 에러 발생
	}
}





