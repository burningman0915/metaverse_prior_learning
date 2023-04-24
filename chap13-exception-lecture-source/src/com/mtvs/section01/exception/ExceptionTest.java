package com.mtvs.section01.exception;

public class ExceptionTest {
	public void checkEnoughMoney(int price, int money) throws Exception {
		System.out.println("가격은 " + price + "원이고, 가지고 계신 돈은 " + money + "원 입니다.");
		
		/* if-else같은 조건문도 큰 범주에선 예외처리 구문이다.(하지만 코드의 메인 흐름상에서 예외처리를 위한 것인지 구분하기 힘들다.) */
		if(money >= price) {							// 정상적인 흐름(정상 흐름)
			System.out.println("상품을 구입하기 위한 금액이 충분합니다.");
		} else {										// 예외적인 흐름(예외 흐름)
//			System.out.println("상품을 구입하기 위한 금액이 충분하지 않습니다.");
			
			/* 강제로 예외 객체를 생성(예외 발생) */
			throw new Exception("돈이 모자르네");
		}
		
		System.out.println("즐거운 쇼핑 되세요~");
	}
}
