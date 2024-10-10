package com.example.sample.chapter9;

public class MethodSample5 {
	public static void main(String[] args) {
		method(1);

		method("山田太郎");
	}

	static void method(int num) {
		System.out.println("int型の引数を受け取るメソッドが呼ばれました");
	}

	static void method(String str) {
		System.out.println("String型の引数を受け取るメソッドが呼ばれました");
	}
}
