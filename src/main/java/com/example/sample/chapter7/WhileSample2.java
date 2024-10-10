package com.example.sample.chapter7;

public class WhileSample2 {
	public static void main(String[] args) {
		int i = 1;
		
		while( i <= 3) {
			
			System.out.println( i + "回目の処理");
			
			i = i + 1; // ←この処理がなければ無限ループしてプログラムが終わらない
		}
	}
}
