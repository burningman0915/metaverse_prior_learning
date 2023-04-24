package com.mtvs.section01.array;

public class Application5 {
	public static void main(String[] args) {

		/* 랜덤한 카드를 한장 뽑아서 출력해 보자. */
		/* 먼저 카드 모양과 카드 숫자별로 값을 저장할 두 종류의 배열을 만들자. */
		String[] shapes = {"♠", "♣", "♥", "◆"};
		String[] cardNumbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
				                "JACK", "QUEEN", "KING", "ACE"};
		
		/* 배열 인덱스 범위의 난수 발생 */
		int randomShapeIndex = (int)(Math.random() * shapes.length) + 0;			// 0 ~ 3
		int randomCardNumberIndex = (int)(Math.random() * cardNumbers.length) + 0; 	// 0 ~ 12
		
		/* 무작위로 선정된 index들을 이용해서 카드 출력 */
		System.out.println("당신이 뽑은 카드는 " + shapes[randomShapeIndex] + " "
				           + cardNumbers[randomCardNumberIndex] + "입니다.");
	}
}
