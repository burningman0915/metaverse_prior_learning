package com.mtvs.section01.usertype;

import java.util.Arrays;

public class Application {
	public static void main(String[] args) {
		
		/* 지금까지 자바에서 제공되는 자료들을 취급하는 자료형에 대해 학습했다.(변수, 배열) */
		
		/* 
		 * 회원 정보를 관리하기 위해 회원의 여러 정보(아이디, 비밀번호, 이름, 나이, 성별, 취미)를
		 * 취급하여 지금까지 배운 내용을 가지고 한 번 값들을 저장하고 출력해 보자.
		 */
		String id = "user01";
		String pwd = "pass01";
		String name = "홍길동";
		int age = 20;
		char gender = '남';
		String[] hobby = new String[] {"축구", "볼링", "테니스"};
		
		System.out.println("id: " + id);
		System.out.println("pwd: " + pwd);
		System.out.println("name: " + name);
		System.out.println("age: " + age);
		System.out.println("gender: " + gender);
		System.out.println("hobby: " + Arrays.toString(hobby));
		System.out.println(returnString(id, pwd, name, age, gender, hobby));
		
		/*
		 * 이렇게 각각의 변수로 관리하게 되면 여러가지 단점이 있다.
		 * 1. 변수명을 다 관리해야 하는 어려움이 생긴다. (회원 수가 늘어날수록 어려움이 커짐)
		 * 2. 모든 회원 정보를 인자로 메소드 호출 시 값을 전달해야 하면 너무 많은 값들을 인자로 전달해야 한다.
		 * 3. 리턴은 1가지 자료형의 값만 가능하기 때문에 회원 정보를 묶어서 리턴값으로 사용할 수 없다.
		 *    (서로 다른 자료형이기 때문에)
		 */
		
		/* 1. 변수 선언 및 객체(인스턴스) 생성 */
		Member m = new Member();	// m이라는 객체를 생성
		m.id = "user01";
		m.pwd = "pass01";
		m.pwd = "pass02";
		System.out.println(m.id);
		System.out.println(m.pwd);
		System.out.println(m.age);
		System.out.println(m.gender);
		
		System.out.println(returnMember(m).id);
		
		Member m1 = new Member();	// 또 다른 m1이라는 객체를 생성
		m1.method();				// m1이 가진 기능을 호출할 수도 있다.
	}
	
	/* 회원의 정보를 넘겨주면 하나의 문자열로 반환해 주는 메소드 */
	public static String returnString(String id, String pwd, String name, int age,
			                          char gender, String[] hobby) {
		System.out.println(id);
		System.out.println(pwd);
		
		return id + pwd + name + age + gender + Arrays.toString(hobby);
	}
	
	public static Member returnMember(Member m1) {
		
		System.out.println(m1.id);
		System.out.println(m1.pwd);
		
		return m1;
	}
}






