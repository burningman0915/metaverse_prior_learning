package com.mtvs.section02.package_and_import;

/* 패키지 */
public class Application1 {
	public static void main(String[] args) {
		
		int first = 30;
		int second = 20;
		
		/* Calculator(다른 패키지에 있는)에 있는 non-static 메소드 호출 */ 
		com.mtvs.section01.method.Calculator calc = 
				new com.mtvs.section01.method.Calculator();
		
		int min = calc.minNumberOf(first, second);
		System.out.println("30과 20 중에 더 작은 값은: " + min);
		
		/* Calculator(다른 패키지에 있는)에 있는 static 메소드 호출 */
		int max = com.mtvs.section01.method.Calculator.maxNumberOf(first, second);
		System.out.println("30과 20 중에 더 큰 값은: " + max);
	}
}




