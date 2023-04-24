package com.mtvs.section02.string;

public class Application4 {
	public static void main(String[] args) {
		
		/*
		 * 이스케이프(escape) 문자 - 문법적인 것과 문법적으로 쓰지 않을 것을 구분하기 위한 문자
		 * 
		 * \n: 개행 문자
		 * \t: 탭 문자
		 * \": 쌍 따옴표 문자
		 * \\: 역슬래쉬 문자
		 * \': 홑 따옴표 문자
		 * 
		 */
		
		System.out.println("안녕하세요.\n저는 김자바입니다.");
		System.out.println("안녕하세요.\t저는 안자바입니다.");
		System.out.println("안녕하세요. 저는 '뭘자바'입니다.");
		System.out.println("안녕하세요. 저는 \"다자바\"입니다.");
		System.out.println("안녕하세요. 저는 \\못자바\\입니다.");
		
		System.out.println('\'');
	}
}





