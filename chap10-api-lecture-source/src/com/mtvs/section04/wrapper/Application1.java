package com.mtvs.section04.wrapper;

public class Application1 {
	public static void main(String[] args) {
		
		/* Wrapper 클래스 */
		/*
		 * 상황에 따라 기본 타입의 데이터를 인스턴스화 해야 하는 경우들이 발생한다.
		 * 이 때 기본 타입의 데이터를 먼저 인스턴스로 변환 후 사용해야 하는데
		 * 8가지에 해당하는 기본 타입의 데이터를 인스턴스화 할 수 있도록 하는
		 * 클래스를 래퍼 클래스(Wrapper Class)라고 한다.
		 * 
		 * 기본 타입              래퍼 클래스
		 * byte					Byte
		 * short				Short						
		 * int					Integer   (V)
		 * long					Long
		 * float				Float
		 * double				Double
		 * char					Character (V)
		 * boolean				Boolean
		 */
		
		/*
		 * 박싱(Boxing)과 언박싱(UnBoxing)
		 * 기본 타입을 래퍼클래스의 인스턴스로 인스턴스화 하는 것을 박싱(Boxing)이라고 하며,
		 * 래퍼 클래스 타입의 인스턴스를 기본 타입으로 변경하는 것을 언박싱(UnBoxing)이라고 한다.
		 */
		int intValue = 20;
		
		/* Boxing */
		Integer boxingNumber1 = new Integer(intValue);		// Integer의 매개변수 있는 생성자 활용
		Integer boxingNumber2 = Integer.valueOf(intValue);	// Integer의 static 메소드 활용
		
		/* UnBoxing */
		int unBoxingNumber1 = boxingNumber1.intValue();		// Integer의 non-static 메소드 활용
		
		/*
		 * 오토 박싱(AutoBoxing)과 오토 언박싱(AutoUnBoxing)
		 * JDK 1.5부터는 박싱과 언박싱이 필요한 상황에서 자바 컴파일러가 이를 자동으로 처리해 준다.
		 */
		Integer boxingNumber3 = intValue;
		
		int unBoxingNumber2 = boxingNumber3;
		
		/* Wrapper 클래스 값 비교 */
		int iNum = 20;
		Integer integerNum1 = new Integer(20);
		Integer integerNum2 = new Integer(20);
		Integer integerNum3 = 20;
		Integer integerNum4 = 20;
		
		/* 기본 타입과 래퍼클래스 타입도 == 연산으로 비교 가능하다.(기본자료형과 래퍼클래스 자료형이 지닌 필드값 비교(동등)) */
		System.out.println("int와 Integer 비교: " + (iNum == integerNum1));		// true
		System.out.println("int와 Integer 비교: " + (iNum == integerNum3));		// true
		
		/* 생성자를 이용해 생성한 인스턴스간 ==으로 비교 시 주소값 비교를 하게 된다.*/
		System.out.println("Integer와 Integer 비교: " + (integerNum1 == integerNum2));	// false
		System.out.println("Integer와 Integer 비교: " + (integerNum1 == integerNum3));	// false   
		System.out.println("Integer와 Integer 비교: " + (integerNum3 == integerNum4));	// true (String처럼 상수 풀 활용으로 인스턴스가 동일하다.)
		
		/* Wrapper 클래스이 Integer 객체들의 주소값 확인 */
		System.out.println(System.identityHashCode(integerNum1));
		System.out.println(System.identityHashCode(integerNum2));
		System.out.println(System.identityHashCode(integerNum3));
		System.out.println(System.identityHashCode(integerNum4));
		
		method(intValue);		// 기본자료형 -> (오토박싱) -> 래퍼클래스 -> (다형성) -> Object형
	}
	
	public static void method(Object obj) {
		int intNum = (Integer)obj;
	}
}







