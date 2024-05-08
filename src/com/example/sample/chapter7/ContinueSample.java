package com.example.sample.chapter7;

public class ContinueSample {
	public static void main(String[] args) {
		int loopSkipCount = 3; // ループをスキップするときの数
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + " 回目");
			if (i == loopSkipCount) {
				System.out.println("スキップします"); // スキップする時は改行だけ行う
				continue;
			}
			System.out.println("for文が最後まで行われました");
		}
	}
}
