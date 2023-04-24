package com.mtvs.section02.package_and_import;

import com.mtvs.section01.method.Calculator;

/* 임포트 */
public class Application2 {
	public static void main(String[] args) {
		
		/* non-static 메소드일 경우 */
		Calculator calc = new Calculator();
		int min = calc.minNumberOf(50, 60);
		
		System.out.println("50과 60 중에 더 작은 값은: " + min);
		
		/* static 메소드일 경우 */
		int max = Calculator.maxNumberOf(50, 60);
		
		System.out.println("50과 60 중에 더 큰 값은: " + max);
	}
}






