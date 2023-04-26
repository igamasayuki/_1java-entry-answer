package sample.chapter5;

public class ArithmeticSample2 {
	public static void main(String[] args) {
		System.out.println(1 + 2 * 3); // 足し算よりも掛け算が先に計算される
		System.out.println((1 + 2) * 3); // カッコの中が先に計算される
	}
}
