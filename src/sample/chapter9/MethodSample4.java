package sample.chapter9;

public class MethodSample4 {
	public static void main(String[] args) {
		method(1);

		method(1, 2);
	}

	static void method(int num1) {
		System.out.println("引数を１つ受け取るメソッドが呼ばれました");
	}

	static void method(int num1, int num2) {
		System.out.println("引数を２つ受け取るメソッドが呼ばれました");
	}
}