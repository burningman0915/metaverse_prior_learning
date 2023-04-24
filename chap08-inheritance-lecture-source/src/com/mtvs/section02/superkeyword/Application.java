package com.mtvs.section02.superkeyword;

public class Application {
	public static void main(String[] args) {
		
		/* super., super()에 대해 알아보자. */
		ProductDTO product1 = new ProductDTO();
		System.out.println(product1);

		ProductDTO product2 =
				new ProductDTO("S-01234", "삼성", "갤럭시Z폴드4", 2398000, new java.util.Date());
		System.out.println(product2.toString());
		
		ComputerDTO computer1 = new ComputerDTO();
		System.out.println(computer1);
		
		ComputerDTO computer2 = new ComputerDTO("퀄컴 스냅드래곤", 512, 12, "안드로이드");
		System.out.println(computer2);
		
		ComputerDTO computer3 = 
				new ComputerDTO("S-01234", "삼성", "갤럭시Z폴드4", 2398000, new java.util.Date(),
								"퀄컴 스냅드래곤", 512, 12, "안드로이드");
		System.out.println(computer3);
	}
}
