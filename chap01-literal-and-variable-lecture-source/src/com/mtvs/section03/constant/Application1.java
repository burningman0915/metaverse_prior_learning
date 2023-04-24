package com.mtvs.section03.constant;

public class Application1 {
	public static void main(String[] args) {
		
		/* 1. 상수 선언 */
		/* 상수 선언 시 자료형 앞에 final 키워드를 붙인다. */
		final int AGE;
		final double PI = 3.14;
		
		/* 2. 초기화(Initialization) */
		AGE = 20;
//		AGE = 30;			// 한 번 초기화 된 이후 값을 또 다시 대입하는 것은 불가능하다.
		
		/* 3. 필요한 위치에서 상수를 호출하여 사용한다. */
		System.out.println("AGE의 값: " + AGE);
		
		int varAge = AGE;
		System.out.println(varAge);
		
		/* 4. 선언과 동시에 초기화를 할 수 있다. */
		final int AGE2 = 11;
	}
}










