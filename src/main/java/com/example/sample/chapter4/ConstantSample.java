package com.example.sample.chapter4;

public class ConstantSample {
	public static void main(String[] args) {

		final double PAI = 3.14; // ←定数の定義
		// PAI = 3; // ←定数は上書き代入ができない
		
		// 円の面積を求める 
		int radius = 10;
		System.out.println(radius * radius * PAI); // ←変数同様に使用可能
		
	}

}
