package answer;

public class Ex28 {

	public static void main(String[] args) {
		int i = 1;

		while (i <= 10) {

			System.out.println("1" + " + " + i + " = " + (1 + i));

			i = i + 1; // ←この処理がなければ無限ループしてプログラムが終わらない
		}
	}
}
