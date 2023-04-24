package com.mtvs.section03.increment_decrement_operator;

public class Application1 {
	public static void main(String[] args) {

		/* 증감 연산자 */
		/*
		 * '++': 1 증가를 의미
		 * '--': 1 감소를 의미
		 * 단항일때 사용(단항 연산자)
		 */
		
		 int num = 20;
		 System.out.println("num: " + num);		// 20
		 
		 num++;
		 System.out.println("num: " + num);		// 21
		 
		 ++num;
		 System.out.println("num: " + num);		// 22

		 num--;
		 System.out.println("num: " + num);		// 21
		 
		 --num;
		 System.out.println("num: " + num);		// 20
		 
		 /* 다른 연산자(출력이나 대입)와 같이 사용할 때 증감 연산자의 의미 */
		 /*
		  * '++var': 피연산자의 값을 먼저 1 증가 시킨 후 다른 연산을 진행
		  * 'var++': 다른 연산을 먼저 진행하고 난 뒤 마지막에 피연산자의 값을 1 증가
		  * '--var': 피연산자의 값을 먼저 1 감소 시킨 후 다른 연산을 진행
		  * 'var--': 다른 연산을 먼저 진행하고 난 뒤 마지막에 피연산자의 값을 1 감소
		  */
		 
		 /* 전위 연산자 */
		 int firstNum = 20;
		 
		 int result1 = firstNum++ * 3;			
		 
		 System.out.println("result1: " + result1);			// 60
		 System.out.println("firstNum: " + firstNum);		// 21
		 
		 /* 후위 연산자 */
		 int secondNum = 20;
		 
		 int result2 = ++secondNum * 3;
		 
		 System.out.println("result2: " + result2);			// 63
		 System.out.println("secondNum: " + secondNum);		// 21
		 
		 System.out.println("secondNum: " + ++secondNum);	// secondNum: 22
		 System.out.println("secondNum: " + secondNum++);	// secondNum: 22
		 System.out.println("secondNum: " + secondNum); 	// secondNum: 23
	}
}
