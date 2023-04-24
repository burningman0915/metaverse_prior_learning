package com.mtvs.section01.list.comparator;

import java.util.Comparator;

import com.mtvs.section01.list.run.BookDTO;

/* 가격 오름차순용 클래스 */
public class AscendingPrice implements Comparator<BookDTO>{

	/* 가격에 대한 오름차순 */
	@Override
	public int compare(BookDTO o1, BookDTO o2) {
		return o1.getPrice() - o2.getPrice();
	}
}
