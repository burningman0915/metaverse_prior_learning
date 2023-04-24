package com.mtvs.section05.calendar;

import java.util.Date;

public class Application1 {
	public static void main(String[] args) {
		
		/* Date 클래스 */
		
		/* 시스템의 현재 시간 */
		/* 1. 기본 생성자 활용 */
		/*
		 * 기본 생성자로 인스턴스를 생성하면 개발중인 컴퓨터의 운영체제 날짜/시간 정보를 이용해서
		 * 인스턴스를 만들게 된다.(시스템 시간)
		 */
		Date today = new Date();
		
		/* toString()메소드가 Date에도 오버라이딩 되어 있어 보기 좋게 필드값(시간정보)를 출력해 볼 수 있다. */
		System.out.println(today.toString());
		
		/* 2. Date(long date) 생성자 활용 */
		/*
		 * getTime(): 1970년 1월 1일 0시 0분 0초(그리니치 천문대 기준, 우리나라는 9시 0분 0초)
		 *            이후 지난 시간을 millisecond 단위로 계산해서 long 타입으로 반환하는 메소드이다.
		 */
		Date oneDay = new Date(1000L);			// 1970년 1월 1일 9시 0분 0초에서 1초가 지난 후
		
		System.out.println(oneDay.toString());
		
		System.out.println(today.getTime());	// 1675912273796
		
		Date toDay2 = new Date(1675912273796L);
		System.out.println(toDay2);
		
		Date defaultTime = new Date(0);
		System.out.println(defaultTime);
		
		/* 1980년 2월 3일 11시 5분 30초 */
		Date oneDay2 = new Date(80, 2 - 1, 3, 11, 5, 30);
		System.out.println(oneDay2);
		
		Date birthday = new Date(87, 9 - 1, 15);
		System.out.println(birthday);
	}
}




