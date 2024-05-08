package com.example.answer;

public class Ex46 {

	public static void main(String[] args) {
		int addAnswer = add();
		System.out.println(addAnswer);
		int subAnswer = sub();
		System.out.println(subAnswer);
		int multiAnswer = multi();
		System.out.println(multiAnswer);
		int divAnswer = div();
		System.out.println(divAnswer);
	}

	static int add() {
		int num1 = 5;
		int num2 = 3;
		return num1 + num2;
	}

	static int sub() {
		int num1 = 5;
		int num2 = 3;
		return num1 - num2;
	}

	static int multi() {
		int num1 = 5;
		int num2 = 3;
		return num1 * num2;
	}

	static int div() {
		int num1 = 5;
		int num2 = 3;
		return num1 / num2;
	}

}
