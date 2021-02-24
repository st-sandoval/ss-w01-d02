package com.ss.w01d02.assignments;

public class MainClass {
	public static void main(String[] args) {
		System.out.println(args);
		
		for(String arg:args) {
			System.out.println(arg);
		}
		twoDee();
		
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
