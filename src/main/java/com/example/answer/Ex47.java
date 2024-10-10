package com.example.answer;

public class Ex47 {

	public static void main(String[] args) {
		
		double average = average(79, 80, 100);
		
		System.out.println(average);
		
	}
	
	static double average(int num1, int num2, int num3) {
		
		return (num1 + num2 + num3) / 3.0;
		
	}
}
