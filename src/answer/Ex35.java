package answer;

public class Ex35 {

	public static void main(String[] args) {

		for (int i = 1; i <= 9; i = i + 1) {
			for (int j = 1; j <= 9; j = j + 1) {
				// i × j の結果をanswerに入れる
				int answer = i * j;
				// answerの値を表示して表示後スペースを入れる
				System.out.print(answer + " ");
			}
			System.out.println(); // 改行
		}

	}
}
