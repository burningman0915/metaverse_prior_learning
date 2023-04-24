package com.mtvs.section03.api.math;

import java.util.Random;

public class Application3 {
	public static void main(String[] args) {

		/* java.util.Random 클래스 */
		/*
		 * java.util.Random 클래스의 nextInt() 메소드를 이용한 난수 발생
		 * nextInt(int bound): 0부터 매개변수로 전달받은 정수 범위까지의 난수를 발생시켜서
		 *                     정수 형태로 반환
		 */
		
		/*
		 * 원하는 범위의 난수를 Random클래스로 구하는 공식
		 * Random random = new Random();
		 * random.nextInt(구하려는 난수의 갯수) + 구하려는 난수의 최소값;
		 */
		
		/* Random 클래스는 java.lang 패키지 소속이 아니므로 풀클래스명 혹은 import를 해 주어야 한다. */
//		java.util.Random random  = new java.util.Random();
		Random random = new Random();
		
		/* 0 ~ 9까지의 난수 발생 */
		int randomNumber1 = random.nextInt(10) + 0;
		System.out.println("0부터 9까지의 난수: " + randomNumber1);
		
		/* 2 ~ 5까지의 난수 발생 */
		int randomNumber2 = random.nextInt(4) + 2;
		System.out.println("2부터 5까지의 난수: " + randomNumber2);
	}
}






