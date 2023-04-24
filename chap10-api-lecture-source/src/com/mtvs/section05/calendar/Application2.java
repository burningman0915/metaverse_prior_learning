package com.mtvs.section05.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Application2 {
	public static void main(String[] args) {
		
		/*
		 * Calendar 클래스 사용
		 * 
		 * 1. 필드 넘버(메소드 오버로딩으로 메소드 이름 갯수 줄이는 효과)
		 * 2. 타임존 기능
		 * 
		 * GregorianCalendar 클래스 사용
		 * 
		 * 1. 윤년 개념 강화(알고리즘)
		 * 2. Calendar를 상속
		 * 3. 실제 우리가 사용하는 날짜 관련 타입
		 */
//		Calendar cal = new Calendar();				// 생성자를 호출할 수 없다(protected)
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.toString());
		
		/* 2014년 9월 17일 16:42:20 */
		int year = 2014;
		int month = 9 - 1;
		int dayOfMonth = 17;
		int hour = 16;
		int min = 42;
		int second = 20;
		
//		cal.set(year, month, dayOfMonth, hour, min, second);
//		System.out.println(cal);
		
		/* Calendar 자체의 객체를 사용하지 않고 실제로는 GregorianCalendar를 사용하게 된다. */
		Calendar oneDay =
				new GregorianCalendar(year, month, dayOfMonth, hour, min, second);
		System.out.println(oneDay);
		
		/* 년도를 2022년으로 수정 */
		oneDay.set(Calendar.YEAR, 2023);
//		oneDay.set(GregorianCalendar.YEAR, 2023);
//		oneDay.set(1, 2023);
		System.out.println(oneDay);
		
		int oneDayMonth = oneDay.get(Calendar.MONTH);
//		int oneDayMonth = oneDay.get(GregorianCalendar.MONTH);
//		int oneDayMonth = oneDay.get(2);
		System.out.println(oneDayMonth + 1);	// 월은 get을 통해 빼내면 +1을 해야 우리가 아는 월의 개념이 나옴(1 ~ 12월)
		int oneDayDayOfMonth = oneDay.get(Calendar.DAY_OF_MONTH);
		System.out.println(oneDayDayOfMonth);
		
		System.out.println(oneDayMonth + "월 " + oneDayDayOfMonth + "일");
		
		/* 추가(GregorianCalendar 객체의 시간을 예쁜 포맷으로 나오게 해보기)(feat.Date, SimpleDateFormat) */
		SimpleDateFormat sdf = new SimpleDateFormat("a yyyy년 MM월 dd일 hh시 mm분 ss초 E요일 완전조아");
		String format = sdf.format(oneDay.getTime());
		System.out.println(format);
		
		/*
		 * 윤년이란? 
		 * 년도가(4의 배수이면서, 100의 배수가 아니거나, 400의 배수가) 되는 해가 윤년
		 * 1년을 366일로 계산하는 해(== 2월이 29일인 해)
		 * 
		 * 율리우스력의 근소한 오차 값을 수정한 그레고리력
		 * (1년을 365 1/4일(정확하게는 365.2422일))
		 * 1) 그 해의 연도가 4의 배수가 아니면 평년으로 2월은 28일만 있다.
		 * 2) 만약 연도가 4의 배수이면서 100의 배수가 아니면 윤일(2월 29일)을 도입한다.
		 * 3) 만약 연도가 100의 배수이면서 400의 배수가 아닐 때 이 해는 평년으로 생각한다.
		 * 4) 만약 연도가 400의 배수면 윤일(2월 29일)을 도입한다.(이거만 맞으면 윤년) 
		 * 
		 * 1)의 예
		 * 2001년 - 평년, 365일
		 * 
		 * 2)의 예
		 * 2008년 - 윤년, 366일 
		 * 
		 * 3)의 예
		 * 2300년 - 평년, 364일
		 * 
		 * 4)의 예
		 * 2400년 - 윤년, 366일
		 */
		
		Calendar cal2 =
				new GregorianCalendar(2001, 2 - 1, 28 + 3);		// 년도가 평년인지 윤년인지를 파악해서 날짜를 다룰 수 있다.
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일");
		String result = sdf2.format(cal2.getTime());
		System.out.println(result);
		
		/* 요일 조건 처리(일:1 ~ 토:7) - SimpleDateFormat 없이 한글로 요일 추출해 보기 */
		Calendar cal3 =
				new GregorianCalendar(2023, 3 - 1, 31);
		
		String day = "";
		switch(cal3.get(GregorianCalendar.DAY_OF_WEEK)) {
			case 1: day = "일"; break;
			case 2: day = "월"; break;
			case 3: day = "화"; break;
			case 4: day = "수"; break;
			case 5: day = "목"; break;
			case 6: day = "금"; break;
			case 7: day = "토"; break;
		}
		System.out.println("오늘은 " + day + "요일이야!");
	}
}





