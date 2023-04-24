package com.mtvs.section07.initblock;

public class Product {
	
	/* 0. JVM이 각각 초기화를 해줌 */
//	private String name;
//	private int price;
//	private static String brand;
	
	/* 1. 명시적 초기화를 통해 초기화를 할 수 있다. */
	private String name = "갤럭시";
	private int price = 1000000;
	private static String brand = "샘송";
	
	/* 2. 초기화 블럭을 통해 초기화를 할 수 있다.(어떤 생성자든 상관없이 공통적인 로직이 필요할 때 사용) */
	/* 2-2. 인스턴스 초기화 블럭이 이후에 실행 */
	{
		name = "사이언";
//		Product.brand = "알지";
		System.out.println("인스턴스 초기화 블럭 동작");
	}
	
	/* 2-1. 정적 초기화 블럭이 먼저 실행(인스턴스 변수는 초기화를 할 수 없음) */
	static {
//		name = "사이언2";
		Product.brand = "알지2";
		System.out.println("정적 초기화 블럭 동작");
	}
	
	/* 3. 생성자를 통한 초기화가 마지막 단계에 진행 됨*/
	public Product() {
		name = "아이뽕";
		Product.brand = "사과";
		System.out.println("객체 생성");
	}
	

	public Product(String name) {
		super();
		this.name = name;
	}


	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}



	@Override
	public String toString() {
		return "Product [name=" + this.name + ", price=" + this.price 
				+ ", brand=" + Product.brand + "]";
	}
}
