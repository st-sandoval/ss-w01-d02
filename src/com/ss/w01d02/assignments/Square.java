package com.ss.w01d02.assignments;

public class Square implements Ishape {

	Double length;
	Double area;


	public Square(Double length) {
		this.length = length;
	}
	
	public void calculateArea() {
		this.area = Math.pow(length, 2);
	}


}
