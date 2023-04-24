package com.mtvs.section01.generic;

public class Application {
	public static void main(String[] args) {

		/* 제네릭(Generic) */
		/*
		 * 제네릭의 사전적인 의미는 일반적인이라는 의미이다.
		 * 자바에서 제네릭이란 데이터의 타입을 일반화한다는 의미를 가진다.
		 * 
		 * JDK 1.5버전부터 추가된 문법
		 * 
		 * 제네릭 프로그래밍
		 * 데이터의 형식에 의존하지 않고 하나의 값이 여러 다른 데이터 타입들을 가질 수 있는
		 * 기술에 중점을 두어 재사용성을 높일 수 있는 프로그래밍 방식이다.
		 * 
		 * 제네릭의 이점
		 * 1. 구현의 편리성(하나의 클래스만 작성해도 여러 타입을 타룰 수 있음)
		 * 2. 자료형의 안전성
		 */
		
		/* 제네릭 클래스로 객체를 만들 때 원하는 타입을 다이아몬드 연산자(<>)에 적어 해당 타입으로 정의된 객체를 만들 수 있다. */
		/* 1. 타입을 Itneger로 인스턴스를 생성하는 경우 */
		GenericTest<Integer> gt1 = new GenericTest<Integer>(); 
		
		/* 2. 타입을 Double로 인스턴스를 생성하는 경우 */
		GenericTest<Double> gt2 = new GenericTest<>();		// 뒤의 다이아몬드 연산자에는 타입 생략 가능(JDK 1.7부터)
		
		/* 메소드의 타입을 확인해서 실제 제네릭 클래스의 타입이 정의 되었는지 확인 */
		gt1.setValue(new Integer(10));
//		gt1.setValue(new Double(10));		// 제네릭 클래스의 T가 Integer기 때문에 컴파일 에러 발생
		gt2.setValue(new Double(10));		
		Integer intNum = gt1.getValue();
		
		/* Object타입의 클래스와 제네릭 클래스의 차이점(자료형의 안전성 차이) */
		GenericTest<Integer> genericInt = new GenericTest<>();
		genericInt.setValue(1);
		int genericResult = genericInt.getValue();
//		String genericResult = genericInt.getValue();	// 자료형에 안전하다.(컴파일 시 에러 발생)
		
		ObjectTest obj = new ObjectTest();
		obj.setValue(1);
//		String objResult = (String)obj.getValue();		// 자료형에 안전하지 않다.(런타임 시 에러 발생)
		Integer objResult = (Integer)obj.getValue();
		System.out.println("프로그램 종료");
	}
}




