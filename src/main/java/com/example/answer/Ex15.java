package com.example.answer;

public class Ex15 {

	public static void main(String[] args) {
		
		int item1TotalPrice = 500 * 4;
		int item2TotalPrice = 350 * 8;
		
		int subTotal = item1TotalPrice + item2TotalPrice;
		
		System.out.println("小計金額");
		System.out.println(subTotal + "円");
		
		int tax = (int)(subTotal * 0.1);
		System.out.println("消費税");
		System.out.println(tax + "円");
		
		int total = subTotal + tax;
		System.out.println("合計金額");
		System.out.println(total + "円");
		
	}

}
