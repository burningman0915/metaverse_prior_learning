package com.mtvs.section01.list.run;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Application1 {
	public static void main(String[] args) {
	
		/* 컬렉션 프레임워크(Collection Framework) */	
		/*
		 * 자바에서 컬렉션 프레임워크는 여러 개의 다양한 데이터들을 쉽고 효과적으로 처리할 수 있도록
		 * 표준화 된 방법을 제공하는 클래스들의 집합이다.
		 * (데이터를 효율적으로 저장하는 자료구조 + 데이터를 처리하는 알고리즘을 미리 구현해 놓은 클래스들)
		 * 
		 * Collection Framework는 크게 3가지 인터페이스 중 한가지를 구현해 놓았따.
		 * 1. List 인터페이스
		 * 2. Set 인터페이스
		 * 3. Map 인터페이스
		 * 
		 * List 인터페이스와 Set 인터페이스의 공통 부분은 Collection 인터페이스에서 정의하고 있다.
		 * 하지만 Map은 구조상의 차이로 Collection 인터페이스의 정의를 따르지 않는다.
		 */
		
		/*
		 * 각 인터페이스 별 특징
		 * 1. List 인터페이스
		 * 	- 넣는 순서를 유지하고 데이터의 중복 저장을 허용한다.
		 * 	- ArrayList, Vector, LinkedList, Stack, Queue 등이 있다.
		 * 
		 * 2. Set 인터페이스
		 *  - 넣는 순서를 유지하지 않고 데이터 집합의 의미로 저장되어 중복을 허용하지 않는다.
		 *  - HashSet, LinkedHashSet, TreeSet 등이 있다.
		 *  
		 * 3. Map 인터페이스
		 *  - 키와 값이 한 쌍(엔트리)으로 이루어지는 데이터 집합이다.
		 *  - key를 Set방식으로 관리(동등비교)하기 때문에 데이터의 순서를 관리하지 않고 중복된 key를
		 *    허용하지 않는다.
		 *  - value는 중복된 값을 저장할 수 있다.
		 *  - HashMap, TreeMap, HashTable, properties 등이 있다.
		 */
		
		/*
		 * ArrayList
		 * 가장 많이 사용되는 컬렉션 클래스이다.
		 * JDK 1.2부터 제공된다.
		 * 내부적으로 배열을 이용하여 요소를 관리하며, 인덱스를 이용해 배열 요소에 빠르게 접근할 수 있다.
		 */
		
		/* ArrayList는 인스턴스를 생성하게 되면(기본 생성자) 내부적으로 10칸짜리 배열을 생성한다. */
		ArrayList aList = new ArrayList();		// 저장 크기가 10칸짜리인 배열 선언한 것과 같다.
//		Vector aList = new Vector();			// Vector는 ArrayList와 달리 동기화 처리가 가능하다.(느리다)(구현 시 제공 메소드는 ArrayList와 똑같다.)                
		
		/* 다형성을 적용하여 상위 레퍼런스로 ArrayList 객체를 만들수도 있다.(관례상 많이 사용하는 방식) */
		List list = new ArrayList();
		
		Collection collection = new ArrayList();
		
		aList.add("apple");
		aList.add(123);				// autoBoxing 처리됨(기본 자료형 값(int) -> 인스턴스(Integer))
		aList.add(45.67);			// double -> Double
		aList.add(new java.util.Date());
		
		System.out.println(aList);
		
		/*
		 * 내부에서 관리중인 배열의 크기가 아닌 들어있는 요소의 개수를 반환한다.
		 * 내부적으로 관리하는 배열의 사이즈는 외부에서 활용하거나 알 필요가 없기 때문에 기능을 제공하지 않는다.
		 */
		System.out.println("aList의 size: " + aList.size());  // 배열의 length와 달리 size()를 쓰게 된다.
		
		/* 1. ArrayList는 넣은 순서가 유지된다. */
		/* size()를 활용한 for문으로 값 꺼내기 */		
		for(int i = 0; i < aList.size(); i++) {
			System.out.println(i + "번째 인덱스: " + aList.get(i));
		}
		
		/*
		 *  foreach를 쓸 수 있지만 따로 제네릭을 걸지 않고 다양한 자료형이 들어있다면
		 *  foreach 좌항에 Object형 변수를 써야 한다.
		 *  그리고 상황에 따라 일일이 instanceof로 확인해서 다운캐스팅을 해서 써야한다.(불편함, 자료형의 안정성 문제)
		 */
		for(Object obj : aList) {
			System.out.println(obj);
		}
		
		/* 2. ArrayList는 데이터의 중복 저장을 허용한다. */
		aList.add("apple");
		System.out.println("aList: " + aList);
		
		aList.remove(2);
		System.out.println("aList: " + aList);
		System.out.println("aList의 size: " + aList.size());
		
		aList.add(1, "banana");
		System.out.println("aList: " + aList);
		
		aList.add(1, new Boolean(true));
		System.out.println("aList: " + aList);
		
		/*
		 * 모든 컬렉션 프레임워크 클래스는 제네릭 클래스로 작성되어 있다.
		 * 자료형의 안전성을 보장하기 위해서 되려 제네릭을 적용한다.(타입 제한을 건다.)
		 * 
		 * ArrayList는 저장 순서가 유지되며 index(순번)이 적용된다.
		 * 제네릭을 걸지 않으면 Object 클래스의 하위 타입 인스턴스를 모두 저장할 수 있지만 권장되지 않는다.
		 */
		List<String> stringList = new ArrayList<>();
//		stringList.add(123);
		stringList.add("apple");
		stringList.add("banana");
		stringList.add("orange");
		stringList.add("mango");
		stringList.add("grape");
		
		System.out.println("stringList: " + stringList);
		
		/* 추가(정렬) */
		/*
		 * iterator(반복자) 인터페이스를 활용해서 역순으로 정렬
		 * 
		 * Iterator란?
		 * Collection 인터페이스의 iterator() 메소드를 사용해서 인스턴스를 생성할 수 있다.
		 * 컬렉션에서 값을 읽어오는 방식을 통일된 방식으로 제공하기 위해 사용된다.
		 * 반복자라고 불리우며, 반복문을 이용해서 목록을 하나씩 꺼내는 방식으로 사용하기 위함이다.
		 * 인덱스로 관리되는 컬렉션이 아닌 경우(Set 계열, Map 계열)에는 반복문을 사용해서
		 * 요소에 하나씩 접근할 수 없기 때문에 인덱스를 사용하지 않고도 반복문을 사용하기 위한
		 * 목록을 만들어 주는 역할이라고 보면 된다.
		 * 
		 * hasNext(): 다음 요소를 가지고 있는 경우 true, 더 이상 요소가 없는 경우 false를 반환
		 * next(): 다음 요소를 반환하고 그 다음 요소 전으로 커서를 옮긴다.
		 */
		/* 오름차순 */
		Collections.sort(stringList);
		System.out.println("stringList: " + stringList);
		
		/* 내림차순 */
		stringList = new LinkedList<>(stringList);		// ArrayList -> LinkedList
		Iterator<String> dIter = ((LinkedList<String>)stringList).descendingIterator();
		while(dIter.hasNext()) {
			System.out.println(dIter.next() + " ");
		}
	}
}







