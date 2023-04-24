package com.mtvs.section01.list.run;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.mtvs.section01.list.comparator.AscendingPrice;
import com.mtvs.section01.list.comparator.DescendingAuthor;

public class Application2 {
	public static void main(String[] args) {
		
		/* ArrayList의 용법에 대해 조금 더 살펴보자 */
		List<BookDTO> bookList = new ArrayList<>();
		
		bookList.add(new BookDTO(1, "홍길동전", "허균", 50000));
		bookList.add(new BookDTO(2, "목민심서", "정약용", 30000));
		bookList.add(new BookDTO(3, "동의보감", "허준", 60000));
		bookList.add(new BookDTO(4, "삼국사기", "김부식", 46000));
		bookList.add(new BookDTO(5, "삼국유사", "일연", 35000));
		
		/* ArrayList가 지닌 값 출력하는 방법 */
		/* 1. ArrayList에 정의 된 toString()을 활용하는 방법 */
//		System.out.println("bookList: " + bookList);
		
		/* 2. for문을 통한 출력 */
//		for(int i = 0; i < bookList.size(); i++) {
//			System.out.println("bookList: " + bookList.get(i));
//		}
		
		/* 3. foreach문을 통한 출력 */
//		for(BookDTO book : bookList) {
//			System.out.println("bookList: " + book);
//		}
		
		/* 4. Iterator(반복자)를 통한 출력 (제네릭을 걸도록 하고 next()는 한번만 호출해서 쓰자) */
		Iterator<BookDTO> iter = bookList.iterator();
		
		while(iter.hasNext()) {
			BookDTO book = iter.next();
			System.out.println(book);
//			System.out.println(book);
		}
		
		System.out.println();
		
		/* 추가(정렬 심화) (feat. Comparable, Comparator) */
		Collections.sort(bookList);
		
		Collections.sort(bookList, new AscendingPrice());
		Collections.sort(bookList, new DescendingAuthor());
//		
		for(BookDTO book : bookList) {
			System.out.println(book);
		}
	}
}






