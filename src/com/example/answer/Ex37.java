package com.example.answer;

public class Ex37 {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*"); // ここでは改行しない
			}
			System.out.println(); // 改行
		}

	}
}
