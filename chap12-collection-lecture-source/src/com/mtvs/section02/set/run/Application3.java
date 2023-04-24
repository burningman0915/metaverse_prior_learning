package com.mtvs.section02.set.run;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Application3 {
	public static void main(String[] args) {
		
		/* TreeSet 클래스 */
		Set<String> tSet = new TreeSet<>();
		
		tSet.add("java");
		tSet.add("oracle");
		tSet.add("html");
		tSet.add("css");
		tSet.add("javascript");
		tSet.add("html");
		
		/* 오름차순(String의 정렬 기준이 오름차순이라 오름차순으로 나온다.) */
		System.out.println(tSet);
		
		/* 내림차순(정렬기준과 반대 방향으로 바꾸는 메소드 활용) */
		System.out.println(((TreeSet<String>)tSet).descendingSet());
		
		Iterator<String> dIter = ((TreeSet<String>)tSet).descendingIterator();
		while(dIter.hasNext()) {
			System.out.println(dIter.next().toUpperCase());
		}
	}
}






