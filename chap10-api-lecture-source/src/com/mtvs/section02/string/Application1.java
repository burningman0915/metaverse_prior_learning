package com.mtvs.section02.string;

public class Application1 {
	public static void main(String[] args) {

		String str1 = "java";
		String str2 = "java";
		String str3 = new String("java");
		String str4 = new String("java");
		
		/* 주소값 비교를 해보자. */
		System.out.println("str1 == str2: " + (str1 == str2));	// true
		System.out.println("str2 == str3: " + (str2 == str3));	// false
		System.out.println("str3 == str4: " + (str3 == str4));	// false
		
		/* hashCode로 값을 확인해 보자. */
		System.out.println("str1의 hashCode: " + str1.hashCode());
		System.out.println("str2의 hashCode: " + str2.hashCode());
		System.out.println("str3의 hashCode: " + str3.hashCode());
		System.out.println("str4의 hashCode: " + str4.hashCode());
		
		/* hashCode()가 오버라이딩 되어 구분이 안되니 진짜 주소를 찍어보자. */
		System.out.println("str1의 identityHashCode: " + System.identityHashCode(str1));
		System.out.println("str2의 identityHashCode: " + System.identityHashCode(str2));
		System.out.println("str3의 identityHashCode: " + System.identityHashCode(str3));
		System.out.println("str4의 identityHashCode: " + System.identityHashCode(str4));
		
		/*
		 * String은 불변이라는 특징을 가진다.
		 * 기존 문자열에 '+'연산을 수행하는 경우 문자열을 기존의 문자열 인스턴스가 아닌
		 * 새로운 문자열 인스턴스를 할당한다.(기존 인스턴스 안의 문자열은 변화를 줄 수 없음 - 불변)
		 */
		str2 += "oracle";
		System.out.println("str2의 identityHashCode: " + System.identityHashCode(str2));
		str2 += "oracle";
		System.out.println("str2의 identityHashCode: " + System.identityHashCode(str2));
		str2 += "oracle";
		System.out.println("str2의 identityHashCode: " + System.identityHashCode(str2));
		
		/*
		 * String은 equals()와 hashCode()메소드들 둘 다 오버라이딩이 되어 있다는 사실을 기억해 두자!
		 * 나중에 컬렉션에서 써먹을 내용이다.
		 */
	}
}











