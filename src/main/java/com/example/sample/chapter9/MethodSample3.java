package com.example.sample.chapter9;

public class MethodSample3 {
	public static void main(String[] args) {
		// 1と2を渡してadditional()メソッドを呼び出す(呼出部分)
		// その後、計算結果(戻り値)をresult1で受け取る
		int result1 = additional(1, 2);
		System.out.println(result1);

		System.out.println("==================");
		
		// 3と5を渡してadditional()メソッドを呼び出す(呼出部分)
		// その後、計算結果(戻り値)をresult1で受け取る
		int result2 = additional(3, 5);
		System.out.println(result2);
	}

	// 定義部分
	static int additional(int num1, int num2) {
		
		int answer = num1 + num2;
		return answer;
	}
}
