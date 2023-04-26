package answer;

public class Factorial {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			int answer = factorial(i);
			System.out.println(i + "! = " + answer);
		}
	}

	static int factorial(int n) {
		// 正の整数のみ対応
		if (n == 0) {
			return 1;
		} else {
			// 再帰呼び出し
			return n * factorial(n - 1);
		}
	}
}
