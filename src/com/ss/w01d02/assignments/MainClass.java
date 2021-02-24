package com.ss.w01d02.assignments;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		System.out.println(args);
		Scanner scanny = new Scanner(System.in);
		
		for(String arg:args) {
			Integer in = scanny.nextInt();
			Double dou = scanny.nextDouble();
			Long lo = scanny.nextLong();
			Float fl = scanny.nextFloat();
			System.out.println("arg: " + arg);
			System.out.println("int: " +  int);
		}
		
		//matrix max and position
		System.out.println("Matrix max and position: ");
		twoDee();
		
		//shape interface, classes, areas
		System.out.println("Area of circle: ");
		Circle circ = new Circle(4.5);
		circ.calculateArea();
		circ.display(circ.area);
		
		System.out.println("Area of square: ");
		Square squa = new Square(4.5);
		squa.calculateArea();
		squa.display(squa.area);
		
		System.out.println("Area of triangle: ");
		Triangle tri = new Triangle(3.1, 4.0);
		tri.calculateArea();
		tri.display(tri.area);
		
	}
	
	static public void twoDee() {
		Integer max = 0;
		Integer x = 0;
		Integer[] position = new Integer[2];
		
		Integer[][] matrix = {{1,5}, {6, 1}, {3,2}};
		for(Integer[] arr: matrix) {
			
			for(int y = 0; y < arr.length; y++) {
				if(arr[y] > max) {
					max = arr[y];
					position[0] = x;
					position[1] = y;
				}
			}
			x++;
		}
		System.out.println("Max: " + max);
		System.out.println("Position: [" + position[0] + "," + position[1] + "]");
	}
}
