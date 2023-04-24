package com.mtvs.section02.set.run;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application1 {
	public static void main(String[] args) {

		/* Set 인터페이스를 구현한 Set 컬렉션 클래스의 특징 */
		/*
		 * 1. 요소의 저장 순서를 유지하지 않는다.(LinkedHashSet 제외)
		 * 2. 같은 요소의 중복 저장을 허용하지 않는다.(null값도 중복되지 않게 하나의 null만 저장한다.)
		 */
		
		/*
		 * HashSet 클래스
		 * Set 컬렉션 클래스에서는 가장 많이 사용되는 클래스 중 하나이다.
		 * JDK 1.2부터 제공되고 있으며 해쉬 알고리즘을 사용하여 검색 속도가 빠르다는 장점을 가진다.
		 */
		
		/* HashSet 인스턴스 생성 */
		HashSet<String> hSet = new HashSet<>();
		
		/* 다형성 적용하여 상위 인터페이스 타입으로 사용 가능 */
		Set<String> hSet2 = new HashSet<>();		// 관례상 많이 사용
		Collection<String> hSet3 = new HashSet<>();
		
		hSet.add(new String("java"));
		hSet.add(new String("oracle"));
		hSet.add(new String("html"));
		hSet.add(new String("css"));
		hSet.add(new String("javascript"));
		
		/* Set의 toString()으로 저장된 값 확인(저장 순서 유지 안됨) */
		System.out.println("hSet: " + hSet);
		
		/* 중복 허용 안함(동등 인스턴스(hashCode의 결과가 같고, equals의 결과가 true인 인스턴스들)는 하나만 저장한다.) */
		hSet.add(new String("java"));
		hSet.add(new String("oracle"));
		
		System.out.println("hSet: " + hSet);
//		System.out.println("저장 된 인스턴스 수: " + hSet.size());
		
		/* 우리가 만든 BookDTO 객체도 HashSet에 저장해 보자. */
		Set<BookDTO> bSet = new HashSet<>();
		bSet.add(new BookDTO(1, "자바는 재밌어1", "아무개", 10000));
		bSet.add(new BookDTO(1, "자바는 재밌어2", "아무개", 10000));
		
		System.out.println("bSet: " + bSet);
		System.out.println("저장 된 인스턴스 수: " + bSet.size());
		
		/* Set의 출력 방법 */
		/* 1. iterator()로 목록 만들어 연속 처리 */
		Iterator<String> iter = hSet.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
//		for(int i = 0; i < hSet.size(); i++) {
//			System.out.println(hSet.get(i));	// Set은 인덱스의 개념이 없다.(get()메소드도 제공 X)
//		}
		
		/* 2. toArray()를 활용해서 for문 사용 */
//		Object[] objArr = hSet.toArray();
//		for(int i = 0; i < hSet.size(); i++) {
//			System.out.println((String)objArr[i]);
//		}
		
		/* 3. foreach 활용 */
//		for(String str : hSet) {
//			System.out.println(str);
//		}
//		
		/* contains() */
		System.out.println("\"oracle\" 문자열 포함 한 인스턴스: " + hSet.contains(new String("oracle")));
		
		/* clear() */
		hSet.clear();
		
		/* isEmpty() */
		System.out.println("isEmpty(): " + hSet.isEmpty());
		System.out.println("size(): " + hSet.size());
	}
	
}





