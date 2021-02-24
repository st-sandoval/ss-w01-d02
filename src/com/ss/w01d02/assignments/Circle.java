package com.ss.w01d02.assignments;

public class Circle implements Ishape{
	Double radius;
	Double area;

	public void Circle(Double radius) {
		this.radius = radius;
	}
	public void calculateArea() {
		this.area = 2 * pieSquared * radius;
	}

}
