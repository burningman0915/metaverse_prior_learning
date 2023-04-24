package com.mtvs.section01.list.comparator;

import java.util.Comparator;

import com.mtvs.section01.list.run.BookDTO;

public class DescendingAuthor implements Comparator<BookDTO>{

	/* 작가에 대한 내림차순 */
	@Override
	public int compare(BookDTO o1, BookDTO o2) {
		return -o1.getAuthor().compareTo(o2.getAuthor());
	}
}
