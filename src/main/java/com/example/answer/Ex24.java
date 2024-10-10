package com.example.answer;

public class Ex24 {

	public static void main(String[] args) {
		int temp = 38;
		int cold = 37;
		int abnormal = 42;
		
		if (temp <=  cold) {
			System.out.println("正常");
		} else if (temp <= abnormal) {
			System.out.println("風邪");
		} else {
			System.out.println("異常");
		}
	}
}
