package com.mtvs.section01.object.run;

import com.mtvs.section01.object.book.dto.BookDTO;

public class Application1 {
	public static void main(String[] args) {
		
		/*
		 * 모든 클래스는 Object 클래스의 후손이다.
		 * 따라서 Object 클래스가 가진 메소드를 자신의 것처럼 사용할 수 있다.
		 * 또한 부모 클래스가 가지는 메소드를 오버라이딩해서 사용하는 것도 가능하다.
		 * 
		 * Object 클래스의 메소드 중 관례상 많이 오버라이딩 해서 사용하는 메소드들이 있다.
		 * toString(), equals(), hashCode()
		 */
		
		BookDTO book1 = new BookDTO(1, "홍길동전", "허균", 50000);
		BookDTO book2 = new BookDTO(2, "목민심서", "정약용", 30000);
		BookDTO book3 = new BookDTO(3, "자바가 제일 쉬웠어요", "김자바", 10000);
		BookDTO book4 = new BookDTO(3, "자바가 제일 쉬웠어요", "김자바", 10000);
		
		/* Object로부터 물려받은 toString()은 풀클래스명과 @, 그리고 16진수 해쉬코드를 반환한다. */
		System.out.println("book1.toString(): " + book1);
		System.out.println("book2.toString(): " + book2);
		System.out.println("book3.toString(): " + book3);
		System.out.println("book4.toString(): " + book4);
		
		System.out.println(book1.hashCode());
		
		/* 
		 * 우리는 각 클래스의 필드값을 확인하기 위해 오버라이딩해서 쓰게 되며 toString()을 오버라이딩하면
		 * print, println에서 메소드 호출을 생략해서 실행하는 것이 가능하다. 
		 */
	}
}


