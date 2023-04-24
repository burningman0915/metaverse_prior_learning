package com.mtvs.section03.constructor.vo;

import java.util.Date;
import java.util.Objects;

public class User {
	
	/*
	 * 간략히 사용자 정보를 취급 할 필드를 선언한다.
	 * 아이디, 비밀번호, 이름, 가입일을 관리한다.
	 */
	private String id;
	private String pwd;
	private String name;
	private java.util.Date enrollDate;		// 아직 배우지 않은 날짜를 저장하고 다룰 수 있는 참조 자료형
	
	/*
	 * 생성자를 만드는 방법(메소드와 유사)
	 * 1. 생성자는 반드시 클래스의 이름과 동일해야 한다.(대/소문자까지 같아야 함)
	 * 2. 생성자는 반환형을 명시하지 않는다.(명시하는 경우 생성자가 아닌 순수 메소드로만 인식한다.)
	 */
	
	/* 기본 생성자 */
	public User() {
		System.out.println("User 클래스의 기본 생성자 호출함...");
	}
	
	/* 매개변수 있는 생성자 */
	public User(String id, String pwd, String name) {
		System.out.println("User 클래스의 매개변수가 3개 있는 생성자 호출함...");
		this.id = id;			// 여기서의 this는 이 생성자를 통해 생성될 객체를 뜻함
		this.pwd = pwd;
		this.name = name;
	}
	
	public User(String id, String pwd, String name, Date enrollDate) {
		
		/*
		 * this()는 클래스 내의 다른 생성자를 활용하는 것이다.
		 * 1. 생성자 내에서 첫 줄(처음)에 작성해야 한다.
		 * 2. 다른 생성자는 하나만 활용이 가능하다.
		 * 
		 * this()의 사용 목적은 다른 생성자에 적힌 코드를 활용하여 중복을 줄이고 코드 줄 수를 줄이기 위함이다.
		 */
//		this();
		this(id, pwd, name);
//		this.id = id;
//		this.pwd = pwd;
//		this.name = name;
		this.enrollDate = enrollDate;
		
		System.out.println("User 클래스의 매개변수가 4개 있는 생성자 호출함...");
	}

	public String getInformation() {
		return "id: " + this.id + ", pwd: " + this.pwd + ", name: " + this.name
			   + ", enrollDate: " + this.enrollDate;
	}
}
