package com.example.answer;

public class Ex48 {

	public static void main(String[] args) {
		
		int total = amount(10);
		
		System.out.println(total);
		
	}
	
	static int amount(int count) {
		

		int answer = 0;
		
		for (int i = 1; i <= count; i++) {
			answer = answer + i;
			// answer += i; この記述でも良い
		}
		
		return answer;
	}
}
