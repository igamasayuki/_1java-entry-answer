package sample.chapter7;

public class BreakSample {
	public static void main(String[] args) {
		int loopBreakCount = 3; // ループを抜けるときの数
		
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + " 回目");

			if (i == loopBreakCount) {
				break; // iが3になったらループを終了
			}
		}
	}
}
