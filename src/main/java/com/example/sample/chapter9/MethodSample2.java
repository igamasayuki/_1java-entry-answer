package com.example.sample.chapter9;

public class MethodSample2 {
	public static void main(String[] args) {
		// 1と2を渡してadditional()メソッドを呼び出す(呼出部分)
		additional(1, 2);

		System.out.println("==================");
		
		// 3と5を渡してadditional()メソッドを呼び出す(呼出部分)
		additional(3, 5);
	}

	// 定義部分
	static void additional(int num1, int num2) {
		System.out.println("第１引数の値：" + num1);
		System.out.println("第２引数の値：" + num2);
		System.out.println("足し算結果：" + (num1 + num2));
	}
}
