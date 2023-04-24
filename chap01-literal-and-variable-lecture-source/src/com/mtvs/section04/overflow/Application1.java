package com.mtvs.section04.overflow;

public class Application1 {
	public static void main(String[] args) {
		
		/* 데이터 오버플로우 */
		byte num1 = 126;
		
		num1++;			
		System.out.println("num1: " + num1);	// 127
		
		num1++;
		System.out.println("num1: " + num1);	// -128
		
		num1++;
		System.out.println("num1: " + num1);	// -127
		
		num1++;
		System.out.println("num1: " + num1);	// -126
		
		/* 데이터 언더플로우 */
		byte num2 = -127;
		
		num2--;
		System.out.println("num2: " + num2);	// -128
		
		num2--;
		System.out.println("num2: " + num2);	// 127
		
		num2--;
		System.out.println("num2: " + num2);	// 126
		
		num2--;
		System.out.println("num2: " + num2);	// 125
	}
}







