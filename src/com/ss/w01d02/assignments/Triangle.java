package com.ss.w01d02.assignments;

public class Triangle implements Ishape {

	Double base;
	Double height;
	Double area;


	public Triangle(Double base, Double height) {
		this.base = base;
		this.height = height;
	}
	
	public void calculateArea() {
		this.area = .5 * this.base * this.height;
	}

}
