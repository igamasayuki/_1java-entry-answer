package com.example.answer;

public class Fibonacci2 {
	public static void main(String[] args) {
		for (int i = 0; true; i++) {
			int answer = fibonacci(i);
			if (answer > 1000) { // 答えが1000を超えたらループを抜ける
				break;
			}
			System.out.print(answer + " ");
		}
	}

	static int fibonacci(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			// 再帰呼び出し
			return fibonacci(n - 2) + fibonacci(n - 1);
		}
	}

}
