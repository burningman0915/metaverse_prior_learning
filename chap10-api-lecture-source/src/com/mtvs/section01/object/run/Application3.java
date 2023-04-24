package com.mtvs.section01.object.run;

import java.util.HashMap;
import java.util.Map;

import com.mtvs.section01.object.book.dto.BookDTO;

public class Application3 {
	public static void main(String[] args) {

		/* 동등객체 생성 후 hashCode 출력 */
		BookDTO book1 = new BookDTO(1, "홍길동전", "허균", 50000);
		BookDTO book2 = new BookDTO(1, "홍길동전", "허균", 50000);
		
		System.out.println("book1의 hashCode: " + book1.hashCode());
		System.out.println("book2의 hashCode: " + book2.hashCode());
		
		/* 
		 * 이후 배울 컬렉션에서 키 값으로 쓰일 객체는 동등비교를 하게 되는데
		 * 그 때는 equals뿐 아니라 hashCode도 같이 쓰이므로
		 * equals와 hashCode를 둘 다 오버라이딩 해야 한다.
		 */
		Map<BookDTO, String> map = new HashMap<>();
		map.put(new BookDTO(1, "홍길동전", "허균", 50000), "sell");
		
		String str = map.get(new BookDTO(1, "홍길동전", "허균", 50000));
		System.out.println("value는: " + str);
	}
}
