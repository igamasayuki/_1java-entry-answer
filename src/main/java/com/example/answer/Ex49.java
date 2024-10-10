package com.example.answer;

public class Ex49 {

	public static void main(String[] args) {
		int price = 2000;
		System.out.println(calcTax(price));
		System.out.println(calcIncludTax(price));
		System.out.println(calcHalfPrice(price));
		System.out.println(calcTimeServicePrice(price, 0.8));
	}

	// 消費税を計算して返す
	static int calcTax(int price) {
		final double TAX_RATE = 0.1;
		return (int) (price * TAX_RATE);
	}

	// 消費税込金額を計算して返す
	static int calcIncludTax(int price) {
		final double TAX_RATE = 0.1;
		return (int) (price + (price * TAX_RATE));
	}

	// 半額を計算して返す(小数点以下は切り捨て)
	static int calcHalfPrice(int price) {
		final double HALF_RATE = 0.5;
		return (int) (price * HALF_RATE);
	}

	// 第２引数で与えられた割引率で計算してその結果を返す(小数点以下は切り捨て)
	static int calcTimeServicePrice(int price, double discountRate) {
		return (int) (price * discountRate);
	}

}
