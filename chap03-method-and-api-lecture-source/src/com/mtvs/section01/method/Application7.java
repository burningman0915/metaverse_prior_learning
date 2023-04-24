package com.mtvs.section01.method;

/* static 메소드 호출 */
public class Application7 {
	public static void main(String[] args) {
		
		/* 10과 20을 전달인자로써 넘겨주고 static 메소드 호출 후 반환값을 출력한다. */
		System.out.println("10과 20의 합: " + Application7.sumTwoNumbers(10, 20));
		
		/* 같은 클래스에 있는 static 메소드는 클래스명을 생략해도 된다. */
		System.out.println("10과 20의 합: " + sumTwoNumbers(10, 20));	
	}
	
	public static int sumTwoNumbers(int first, int second) {
//		int result = first + second;
//		return result;
		
		return first + second;
	}
}
