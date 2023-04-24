package com.mtvs.section01.list.run;

//public class BookDTO implements Comparable {
public class BookDTO implements Comparable<BookDTO> {
	
	/* 도서 정보를 저장 할 DTO 클래스를 만들어 보자. */
	private int number;
	private String title;
	private String author;
	private int price;
	
	public BookDTO() {
	}
	public BookDTO(int number, String title, String author, int price) {
		this.number = number;
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "BookDTO [number=" + number + ", title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	
//	@Override
//	public int compareTo(Object o) {
//		
//		/* 가격에 대한 정렬 */
//		/* 오름차순 */
////		return this.price - ((BookDTO)o).price;
//		
//		/* 내림차순 */
////		return ((BookDTO)o).price - this.price;
//		return -(this.price - ((BookDTO)o).price);
//	}
		
	/* Comparable인터페이스의 제네릭 활용 시 */
	@Override
	public int compareTo(BookDTO o) {
		
		/* 도서 번호에 대한 정렬 */
		/* 오름차순 */
//		return this.number - o.number;
		
		/* 내림차순 */
//		return -(this.number - o.number);
		
		/* 책 제목에 대한 정렬 */
		/* 오름차순 */
//		return this.title.compareTo(o.title);
		
		/* 내림차순 */
		return -this.title.compareTo(o.title);
	}
}









