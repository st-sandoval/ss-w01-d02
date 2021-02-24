package com.ss.w01d02.assignments;

public interface Ishape {
	
	public Double pieSquared = Math.pow(Math.PI, 2);
	
	public void calculateArea();
	
	default void display(String shape, Double area) {
		System.out.println("The area of your " + shape + " is: " + area);
	};
}
