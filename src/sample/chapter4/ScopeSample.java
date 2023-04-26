package sample.chapter4;

public class ScopeSample {
	public static void main(String[] args) {

		int num1 = 1; // num1を宣言

		{
			int num2 = 2; // num2を宣言

			System.out.println(num2); // ←宣言した{}内でのみ使える
			System.out.println(num1); // ←num1はmain()メソッド内どこからでも使える
		}

		// System.out.println(num2); // num2は宣言された{}の外では使えないためコメントアウト
		System.out.println(num1); // ←num1はmain()メソッド内どこからでも使える
	}

}
