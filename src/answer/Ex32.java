package answer;

public class Ex32 {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i = i + 1) {
			for (int j = 1; j <= 5; j = j + 1) {
				System.out.print(j); // ここでは改行しません
			}
			System.out.println();// 改行
		}

	}
}
