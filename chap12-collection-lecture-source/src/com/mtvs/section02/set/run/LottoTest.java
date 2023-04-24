package com.mtvs.section02.set.run;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class LottoTest {
	public static void main(String[] args) {
		
		/* 로또 번호 생성기 만들기 */
		/* 배열과 반복문 및 조건문으로 알고리즘으로 구현하기 */
		/* 1. 배열로 로또 번호 6개 생성하기(중복제거) */
		int[] lotto = new int[6];
		
		for(int index = 0; index < lotto.length; index++) {
			lotto[index] = (int)(Math.random() * 45) + 1;		// 1 ~ 45까지 난수 발생
			
			/* 안쪽 for문은 중복 제거를 위한 알고리즘이다.(중복되면 (index - 1)의 개념) */
			for(int pre = 0; pre < index; pre++) {				// 현재 난수 생성 칸 이전에 생성한 값들을 확인하는 반복문
				if(lotto[pre] == lotto[index]) {
					index--;
					break;
				}
			}
		}
		
		/* 2. 생성된 로또 번호 정렬(순차정렬, 오름차순) */
		int temp = 0;
		for(int i = 0; i < lotto.length; i++) {
			for(int j = 0; j < i; j++) {
				if(lotto[j] > lotto[i]) {		// 두 인덱스 번째의 값을 서로 바꿀 조건(스위칭)
					temp = lotto[j];
					lotto[j] = lotto[i];
					lotto[i] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(lotto));
		
		/* TreeSet을 활용해서 구현하기 */
		Set<Integer> s = new TreeSet<>();
		
		while(true) {
//			int random = (int)(Math.random() * 45) + 1;
//			s.add(random);
			s.add((int)(Math.random() * 45) + 1);
			
			if(s.size() == 6) break;
		}
		
		/* 오름차순 */
		System.out.println(s);
		
		/* 내림차순 */
		System.out.println(((TreeSet<Integer>)s).descendingSet());
	}
}






