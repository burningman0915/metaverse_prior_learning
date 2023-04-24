package com.mtvs.section06.ternary_operator;

public class Application1 {
	public static void main(String[] args) {
		
		/* 삼항 연산자 */ 
		/* 자바에서 유일하게 피연산자 항목이 3개인 연산자이다. */
		/*
		 * 항목이 3개: (조건식) ? 참일 때 사용할 값 또는 식1 : 거짓일 때 사용할 값 또는 식2
		 * 조건식은 반드시 결과가 true 또는 false가 나오게끔 작성해야 함
		 * 비교/논리 연산자가 주로 사용 됨
		 */
		
		int num1 = 10;
		int num2 = -10;
		
//		String result1 = (num1이 양수냐) ? (num1이 양수면 "양수다") : (num1이 양수가 아니면 "양수가 아니다");
		String result1 = (num1 > 0) ? "양수다" : "양수가 아니다";
		String result2 = (num2 > 0) ? "양수다" : "양수가 아니다";
		
		System.out.println("num1은 " + result1);
		System.out.println("num2는 " + result2);
		
		/* 삼항 연산자는 중첩해서 사용하는 것이 가능하다. */
		int num3 = 0;	// 양수, 음수, 0을 넣고 구분되어 출력되게 테스트 하자.
		
//		String result3 = (num3가 양수냐) ? (num3가 양수면 "양수다") : ((num3가 0이냐) ? (num가 0이면 "0이다") : (num가 0이 아니면 "음수다"));
//		String result3 = (num3 > 0) ? "양수다" : "0 또는 음수다";
		String result3 = (num3 > 0) ? "양수다" : ((num3 == 0) ? "0이다" : "음수다");
		
		System.out.println("num3는 " + result3);
	}
}











