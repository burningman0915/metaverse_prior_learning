package com.mtvs.section01.conditional_statement;

import java.util.Scanner;

public class A_if {
	public void testSimpleIfStatement() {

		/* 입력받은 수가 짝수인지를 물어보는 조건을 기술하자. */
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 한 개를 입력하세요: ");
		int num = sc.nextInt();
//		System.out.println("입력 잘 받나? " + num);

//		만약에(입력받은 수가 짝수이면){
//			"입력받은 숫자는 짝수입니다"를 출력;
//		}

		if (num % 2 == 0) {
			System.out.println("입력받은 숫자는 짝수입니다.");
		}
	} 
	
	public void testNestedIfStatement() {
		
		/*
		 * 정수 한 개를 입력 받아 그 수가 양수인 경우에만 짝수인지를 확인하여
		 * 짝수이면 "입력하신 숫자는 양수이면서 짝수입니다."라고 출력하고,
		 * 둘 중 하나라도 해당되지 않으면 아무 내용도 출력하지 않는 구문을 작성해 보자.
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요: ");
		int inputNum = sc.nextInt();
		
//		System.out.println("inputNum 잘 나오나? " + inputNum);
		
//		만약에(입력받은 정수가 양수이면) {
//			만약에(입력받은 정수가 짝수이면) {
//				"입력하신 숫자는 양수이면서 짝수입니다."라고 출력;
//			}
//		}
		
		if(inputNum > 0) {						// 양수라면
			if(inputNum % 2 == 0) {				// 짝수라면
				System.out.println("입력하신 숫자는 양수이면서 짝수입니다.");
			}
		}
		
		if((inputNum > 0) && ((inputNum % 2) == 0)) {
			System.out.println("입력하신 숫자는 양수이면서 짝수입니다.");
		}
	}
}




