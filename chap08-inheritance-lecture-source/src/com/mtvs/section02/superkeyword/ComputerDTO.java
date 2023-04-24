package com.mtvs.section02.superkeyword;

import java.util.Date;

public class ComputerDTO extends ProductDTO{

	/* Computer가 가지는 추가적인 속성 */
	private String cpu;					// cpu
	private int hdd;					// 하드
	private int ram;					// 램
	private String operationSystem;		// 운영체제
	
	public ComputerDTO() {
	}
	public ComputerDTO(String cpu, int hdd, int ram, String operationSystem) {
		this.cpu = cpu;
		this.hdd = hdd;
		this.ram = ram;
		this.operationSystem = operationSystem;
	}
	public ComputerDTO(String code, String brand, String name, int price, Date manufacturingDate, String cpu, int hdd,
			int ram, String operationSystem) {
		
		super(code, brand, name, price, manufacturingDate);
//		this.setCode(code);
//		this.setBrand(brand);
//		this.setName(name);
//		this.setPrice(price);
//		this.setManufacturingDate(manufacturingDate);
		
		this.cpu = cpu;
		this.hdd = hdd;
		this.ram = ram;
		this.operationSystem = operationSystem;
	}
	
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public int getHdd() {
		return hdd;
	}
	public void setHdd(int hdd) {
		this.hdd = hdd;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public String getOperationSystem() {
		return operationSystem;
	}
	public void setOperationSystem(String operationSystem) {
		this.operationSystem = operationSystem;
	}
	
	@Override
	public String toString() {
		
		/* 부모로부터 물려받은 메소드를 부모 객체에 접근(super.)해서 toString()메소드를 새롭게 정의(자동완성 구문을 수정해서) */
//		return "code: " + super.getCode() + ", brand: " + super.getBrand() +
//		       ", name: " + super.getName() + ", price: " + super.getPrice() +
//		       ", manufacturingDate: " + super.getManufacturingDate() +
//		       "ComputerDTO [cpu=" + cpu + ", hdd=" + hdd + ", ram=" + ram + ", operationSystem=" + operationSystem
//				+ "]";
		
		/* 부모로부터 물려받은 필드나 메소드 중에 접근이 가능한 필드나 메소드는 super. 대신 this.으로 해도 인식한다. */
//		return "code: " + this.getCode() + ", brand: " + this.getBrand() +
//		       ", name: " + this.getName() + ", price: " + this.getPrice() +
//		       ", manufacturingDate: " + this.getManufacturingDate() +
//		       "ComputerDTO [cpu=" + cpu + ", hdd=" + hdd + ", ram=" + ram + ", operationSystem=" + operationSystem
//				+ "]";
		
		/* 
		 * 부모로부터 물려받은 toString()메소드를 활용하면 한결 편하게 작성할 수 있다.
		 * (단, 물려받은 것과 현재 작성중이 메소드가 같으므로 this.이 아닌 super.으로 구분해 주어야 한다.
		 *  그렇지 않으면 stackoverflow 에러가 발생하게 된다.(주의할 것!)
		 *  this.을 했을 시에는 재귀호출(Recursive Call)이 발생하기 때문이다.
		 *  ) 
		 */
		return super.toString()
				+ "ComputerDTO [cpu=" + cpu + ", hdd=" + hdd + ", ram=" + ram + ", operationSystem=" + operationSystem
				+ "]";
	}
}
