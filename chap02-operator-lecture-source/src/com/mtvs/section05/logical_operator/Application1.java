package com.mtvs.section05.logical_operator;

public class Application1 {
	public static void main(String[] args) {
		
		/* 논리 연산자 */
		/* 논리값(true or false)를 취급하는 연산자이다. */
		
		/*
		 * 논리 연산자의 종류
		 * 1. 논리 연결 연산자: 두 개의 피연산자를 가지는 이항 연산자이며, 연산자의 결합 방법은 왼쪽에서
		 * 					 오른쪽이다.
		 * 	1-1. &&(논리 AND) 연산자: 두 개의 논리식 모두 참일 경우 참을 반환, 둘 중 한개라도 거짓인
		 *                          경우 거짓을 반환한다.(이면서, 그리고)
		 *  1-2. ||(논리 OR) 연산자: 두 개의 논리식 중 둘 중 하나라도 참일 경우 참을 반환, 둘 다 모두
		 *                         거짓일 경우 거짓을 반환한다.(이거나, 또는)
		 * 
		 * 2. 논리 부정 연산자: 피연산자가 하나인 단항 연산자로, 피연산자의 결합 방법은 왼쪽에서 오른쪽이다.
		 *  2-1. !(논리 NOT) 연산자: 논리식의 결과가 참이면 거짓을, 거짓이면 참을 반환한다.
		 */
		
		/* 1. 논리 연결 연산자 결과값 확인 */
		System.out.println("true와 true의 논리 and 연산: " + (true && true));		// True
		System.out.println("true와 false의 논리 and 연산: " + (true && false));		// False
		System.out.println("false와 true의 논리 and 연산: " + (false && true));		// False
		System.out.println("false와 false의 논리 and 연산: " + (false && false));	// False
		
		System.out.println("true와 true의 논리 or 연산: " + (true || true));		// True
		System.out.println("true와 false의 논리 or 연산: " + (true || false));		// True
		System.out.println("false와 true의 논리 or 연산: " + (false || true));		// True
		System.out.println("false와 false의 논리 or 연산: " + (false || false));	// False
		
		/* 2. 논리 부정 연산자 결과값 확인 */
		System.out.println("true의 논리 not 연산: " + (!true));						// False
		System.out.println("false의 논리 not 연산: " + (!false));					// True
	}
}





