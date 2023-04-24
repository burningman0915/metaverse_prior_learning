package com.mtvs.section02.variable;

public class Application2 {
	public static void main(String[] args) {
		
		/* 변수를 사용하기 위한 방법 */
		/*
		 * 1. 변수를 준비한다. (선언)
		 * 2. 변수에 값을 대입한다. (값 대입 혹은 초기화)
		 * 3. 변수를 사용한다.
		 */
		
		/* 1. 변수를 준비한다. (선언) */
		/* 자료형 변수명; */
		
		/* 1-1. 숫자를 취급하는 자료형 */
		byte bNum;		// 1byte
		short sNum;		// 2byte
		int iNum;		// 4byte
		long lNum;		// 8byte
		
		float fNum;		// 4byte
		double dNum;	// 8byte
		
		/* 1-2. 문자를 취급하는 자료형 */
		char ch;		// 2byte
		
		/* 1-3. 논리값을 취급하는 자료형 */
		boolean isTrue;	// 1byte, 긍정 의문문 형태의 변수명 사용(암묵적 규칙)
		
		/* 여기까지가 8가지 기본 자료형(Primitive Type)이라고 한다. */
		
		/* 1-4. 문자열을 취급하는 참조 자료형 */
		String str; 	// 주소 값을 담는 공간이고 엄밀히 말하면 4byte이다. 
		
		/* 2. 변수에 값을 대입한다. (값 대입 및 초기화(선언 후 처음 대입)) */
		/* 2-1. 정수를 취급하는 자료형에 값 대입 */
		bNum = 127;				// 허용, 예외, 자동형변환
		sNum = 3;				// 허용, 예외, 자동형변환
		iNum = 4;
		lNum = 2200000000L;		// 대략 21억이 넘어가는 정수는 L을 붙여주자
		
		/* 2-2. 실수를 취급하는 자료형에 값 대입 */
		fNum = 4.0f;
		dNum = 8.0;
		
		/* 2-3. 문자를 취급하는 자료형에 값 대입 */
		ch = 'a';
		char ch2;
		ch2 = 97;
		
		/* 2-4. 논리를 취급하는 자료형에 값 대입 */
		isTrue = true;
		isTrue = false;
		
		/* 2-5. 문자열을 취급하는 자료형에 값 대입 */
		str = "안녕하세요";

		/* 3. 변수를 사용한다. */      
		System.out.println("========== 변수에 저장된 값 출력 ============");
		System.out.println("bNum의 값: " + bNum);
		System.out.println("sNum의 값: " + sNum);
		System.out.println("iNum의 값: " + iNum);
		System.out.println("lNum의 값: " + lNum);
		
		System.out.println("fNum의 값: " + fNum);
		System.out.println("dNum의 값: " + dNum);
		
		System.out.println("ch의 값: " + ch);
		System.out.println("ch2의 값: " + ch2);
		
		System.out.println("isTrue의 값: " + isTrue);
		
		System.out.println("str의 값: " + str);
	}
}






