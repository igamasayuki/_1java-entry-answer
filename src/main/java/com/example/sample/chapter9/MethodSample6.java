package com.example.sample.chapter9;

public class MethodSample6 {
	public static void main(String[] args) {
		method(1);
	}

	static void method(int num) {
		System.out.println("int型の引数を受け取るメソッドが呼ばれました");
	}

	static void method(double num) {
		System.out.println("double型の引数を受け取るメソッドが呼ばれました");
	}
}
