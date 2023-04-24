package com.mtvs.section03.stringbuilder;

public class Application1 {
	public static void main(String[] args) {
		
		/* StringBuilder와 StringBuffer */
		/*
		 * StringBuilder: 스레드 동기화 기능 제공되지 않음
		 * StringBuffer: 스레드 동기화 기능 제공, 성능면에서 StringBuilder보다 느림
		 * 
		 * 두 클래스는 스레드 동기화 유무를 제외하면 제공되는 기능 차이가 없다.
		 */
		
		/*
		 * String과 StringBuilder
		 * 1. String: 불변이라는 특징을 가지고 있다.
		 *            문자열에 '+' 연산으로 문자열이 수정되면 기존 인스턴스를 수정하는 것이 아닌
		 *            새로운 인스턴스를 할당한다.
		 *            따라서 문자열 변경이 자주 일어나는 경우 성능 면에서 좋지 않다.
		 *            하지만 변하지 않는 문자열을 자주 읽어들이는 경우에는 오히려 좋은 성능을
		 *            기대할 수 있다.(상수 풀 활용 때문)
		 *            
		 * 2. StringBuilder: 가변이라는 특징을 가지고 있다.
		 *                   문자열에 append()메소드를 이용하여 합치기 하는 경우
		 *                   기존 인스턴스를 수정하기 때문에 새로운 인스턴스를 생성하지 않는다.
		 *                   따라서 잦은 문자열 변경이 일어나는 경우 String보다 성능이 좋다. 
		 */
		
//		StringBuilder sb = "java";			// String처럼 문자열 리터럴 값으로 인스턴스 생성 X
		StringBuilder sb = new StringBuilder("java");
		
		/* StringBuilder도 toString()이 오버라이딩 되어 있다. */
		System.out.println(sb);
		
		/* hashCode는 오버라이딩 되어 있지 않다.(동등 비교용으로 혹은 컬렉션(map)의 키값으로는 적합하지 않다.) */
		System.out.println("sb의 hashCode: " + sb.hashCode() + 
				           " " + System.identityHashCode(sb));
		
		/* 문자열 누적 */
//		sb += "oracle";			// StringBuilder와 String 리터럴 값을 직접 더해서 대입할 순 없다.
		sb.append("oracle");	// append 메소드를 사용해야 누적 효과를 줄 수 있다.
		sb.append("oracle");
		
		System.out.println("sb를 수정 후 주소값: " + sb.hashCode() + 
							" " + System.identityHashCode(sb));
		System.out.println(sb);
		
	}
}
