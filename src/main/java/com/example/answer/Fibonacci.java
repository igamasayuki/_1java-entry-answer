package com.example.answer;

public class Fibonacci {
	public static void main(String[] args) {

		int num1 = 0;
		int num2 = 1;
		int answer = 0;
		System.out.print(num1 + num2 + " "); // 最初の0と1を表示
		while (true) {
			answer = num1 + num2;
			if (answer > 1000) { // 答えが1000を超えたらループを抜ける
				break;
			}
			System.out.print(answer + " ");
			num1 = num2;
			num2 = answer;
		}
	}

}
