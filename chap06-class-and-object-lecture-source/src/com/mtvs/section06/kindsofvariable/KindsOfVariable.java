package com.mtvs.section06.kindsofvariable;

public class KindsOfVariable {

	/*
	 * static field를 정적필드(클래스 변수, static 변수)라고 한다.
	 * (정적(클래스)영역(static)에 생성되는 변수라는 의미)
	 */
	private static int staticNum;
	
	/* non-static field를 인스턴스 변수라고 한다. */
	private int globalNum;	// 클래스의 필드에 선언한 변수는(캡슐화 적용 후) 필드 변수이자 전역 변수라고 부른다.
	
	public KindsOfVariable() {}
	
	public void testMethod(int num) {
		
		/*
		 * 메소드 영역에서 작성하는 변수를 지역변수라고 한다.
		 * 메소드의 괄호 안에 선언하는 변수는 매개변수이고
		 * 매개변수도 일종의 지역변수이다.
		 * 지역변수와 매개변수는 모두 메소드 호출 시 stack에 할당받아 생성된다.
		 */
		int localNum;
		
		System.out.println(num);
//		System.out.println(localNum);	     			// 매개변수가 아닌 지역변수는 반드시 초기화가 되어야 한다.
		System.out.println(this.globalNum);	 			// 인스턴스가 존재할 때 쓸 수 있는 인스턴스 변수(전역 변수)일 때
		System.out.println(globalNum);					// this.은 생략이 가능하다.(단, 매개변수와 일치하지 않을 
		System.out.println(KindsOfVariable.staticNum);  // 인스턴스가 존재하지 않고도 쓸 수 있는 클래스 변수(전역 변수)일 때
		System.out.println(staticNum);
		
		/*
		 * 클래스 로딩 과정
		 * 클래스 로더(Class Loader)가 .class 클래스 파일(컴파일 된 소스파일)의 위치를 찾아
		 * 클래스 영역(== static 영역)에 올려놓는 과정을 뜻한다.
		 * JVM을 실행할 때(== 프로그램 실행 시) 이미 static이 붙은 필드나 메소드는 따로 호출하지 않아도
		 * 클래스 영역에 로딩 된다.
		 */
	}
	
	/* 전역 변수와 지역 변수의 차이를 살펴 볼 메소드를 추가하고 접근하기 */
	public void testMethod2() {
		System.out.println(globalNum);
		System.out.println(staticNum);
//		System.out.println(localNum);  	// 지역 변수는 해당 지역(블럭)을 벗어나면 접근할 수 없다.
	}
	
	public static void main(String[] args) {
		
		/* testMethod라는 KindsOfVariable에 있는 non-static 메소드를 호출해 보기 */
		/* 객체를 하나만 사용 시 */
		KindsOfVariable kov = new KindsOfVariable();
		kov.testMethod(1);
		kov.testMethod(1);
		
		/* 축약형(변수 따로 안 만들기)이지만 객체를 여러번 생성해야 할 시 */
		new KindsOfVariable().testMethod(1);
		new KindsOfVariable().testMethod(1);
	}
}







