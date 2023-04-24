package com.mtvs.section01.object_array;

public class Application {
	public static void main(String[] args) {
		Car car1 = new Car("페라리", 300);
		Car car2 = new Car("람보르기니", 350);
		Car car3 = new Car("롤스로이스", 250);
		Car car4 = new Car("부가티베이론", 400);
		Car car5 = new Car("포터", 500);
		
		car1.driveMaxSpeed();
		car2.driveMaxSpeed();
		car3.driveMaxSpeed();
		car4.driveMaxSpeed();
		car5.driveMaxSpeed();
		
		/* 동일한 타입의 인스턴스를 여러 개 사용해야 할 때 객체 배열을 사용하면 보다 효율적이다. */
		Car[] carArray = new Car[5];
		carArray[0] = new Car("페라리", 300);
		carArray[1] = new Car("람보르기니", 350);
		carArray[2] = new Car("롤스로이스", 250);
		carArray[3] = new Car("부가티베이론", 400);
		carArray[4] = new Car("포터", 500);
		
		/* for문 사용 시 */
//		for(int i = 0; i < carArray.length; i++) {
//			carArray[i].driveMaxSpeed();
//		}
		
		/* for-each 사용 시 */
		for(Car car : carArray) {
			car.driveMaxSpeed();
		}
		
//		int[][] twoDArray = new int[2][3];
//		for(int[] iArr : twoDArray) {
//			
//		}
		System.out.println();
		
		/* 객체 배열도 할당과 동시에 초기화 할 수 있다. */
		Car[] carArray2 = {
				new Car("페라리", 300), 
				new Car("람보르기니", 350),
				new Car("롤스로이스", 250),
				new Car("부가티베이론", 400),
				new Car("포터", 500)
		};
		
		for(Car c : carArray2) {
			c.driveMaxSpeed();
		}
	}
}










