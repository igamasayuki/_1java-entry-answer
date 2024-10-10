package com.example.answer;

public class Ex40 {

	public static void main(String[] args) {

		int x = 4; // 最大の*の数
		// *を増やすループ
		for (int i = 1; i <= x; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println(); // 改行
		}
		// *を減らすループ
		for (int i = x - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println(); // 改行
		}

	}
}
