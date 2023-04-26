package sample.chapter9;

public class MethodSample1 {
	public static void main(String[] args) {
		System.out.println("メソッド呼び出し前");
		// printHello()メソッドの呼び出し
		printHello();
		System.out.println("メソッド呼び出し後");
	}
	
	static void printHello() {
		System.out.println("こんにちは");
	}
}
