package com.example.answer;

public class Ex38 {

	public static void main(String[] args) {

		for (int i = 10; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println(); // 改行
		}

	}
}
