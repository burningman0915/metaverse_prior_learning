package com.mtvs.section02.userexception;

import com.mtvs.section02.userexception.exception.MoneyNegativeException;
import com.mtvs.section02.userexception.exception.NotEnoughMoneyException;
import com.mtvs.section02.userexception.exception.PriceNegativeException;

public class ExceptionTest {
//	public void checkEnoughMoney(int price, int money) throws PriceNegativeException, MoneyNegativeException, NotEnoughMoneyException {
	public void checkEnoughMoney(int price, int money) throws Exception {
		
		if(price < 0) {
			throw new PriceNegativeException("상품 가격은 음수일 수 없습니다.");
		}
		
		if(money < 0) {
			throw new MoneyNegativeException("가진 돈은 음수일 수 없습니다.");
		}
		
		if(price > money) {
			throw new NotEnoughMoneyException("가진 돈보다 상품 가격이 비쌉니다.");
		}
		
//		String str = "";
//		System.out.println(str.charAt(0));
		
		System.out.println("가진 돈이 충분합니다. 즐거운 쇼핑 되세요~");
	}
}






