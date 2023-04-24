package com.mtvs.section03.constructor;

import com.mtvs.section03.constructor.vo.User;

public class Application {
	public static void main(String[] args) {
		
		/*
		 * 지금까지 우리는 인스턴스를 생성할 때
		 * 클래스명 레퍼런스변수 = new 클래스명(); 이렇게 인스턴스를 생성했다.
		 * 하지만 new 뒤에 클래스명과 소괄호 부분은 사실 생성자(constructor)라 불리는
		 * 일종의 메소드를 호출하는 구문이다.
		 * 정확히 말하자면 클래스명 레퍼런스변수 = new 생성자;라고 표현한다.
		 */
		User user1 = new User();
		System.out.println(user1.getInformation());
		User user2 = new User("user02", "pass02", "신사임당");
		System.out.println(user2.getInformation());
		User user3 = new User("user03", "pass03", "이순신", new java.util.Date());
		System.out.println(user3.getInformation());
		
	}
}





