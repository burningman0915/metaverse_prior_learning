package com.mtvs.section04.parameter;

public class Rectangle {
	private double width;
	private double height;
	
	public Rectangle() {
	}
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	
	public void calcArea() {
		System.out.println("직사각형의 넓이는: " + this.width * this.height);
	}
	
	public void calcRound() {
		System.out.println("직사각형의 둘레는: " + (this.width + this.height) * 2);
	}
}
