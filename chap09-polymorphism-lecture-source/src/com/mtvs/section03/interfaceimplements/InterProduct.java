package com.mtvs.section03.interfaceimplements;

public interface InterProduct {

	/* 인터페이스는 public static final 필드만 작성이 가능하다.(선언과 동시에 초기화 해야 함) */
	public static final String NAME = "아브라카타브라";
	public final static int MAX_NUM = 10;
	
	/* public static final(상수 필드)만을 가질 수 있기 때문에 모든 필드는 묵시적으로 public static final이다. */
	int MIN_NUM = 5;
	
	/* 인터페이스는 생성자를 가질 수 없다.(객체의 의미를 사용하지 않는다.(클래스와 다른 점)) */
//	public InterProduct() {}				// 에러남
	
	/* 추상 메소드만 작성이 가능하다. */
	public abstract void nonStaticMethod();
	
	/* 인터페이스 안에 작성한 메소드는 묵시적으로 public abstract의 의미를 가진다. */
	void abstractMethod();
	
	/* 일반적인 메소드를 만들 수 없다. */
//	public normalMethod() {
//		
//	}
	
	/* 추가 개념(메소드 몸체({ }) 구현이 가능한 경우) */
	/* static 메소드인 경우(JDK 1.8에서 추가된 기능) */
	public static void staticMethod() {
		System.out.println("InterProduct 클래스의 staticMethod 호출됨...");
	}
	
	/* default 키워드를 사용한 non-static 메소드인 경우(JDK 1.8에서 추가된 기능) */
	public default void defaultMethod() {
		System.out.println("InterProduct 인터페이스의 defaultMethod 호출됨...");
	}
}








