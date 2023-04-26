package sample.chapter7;

public class WhileSample1 {
	public static void main(String[] args) {
		int i = 1;
		
		while( i <= 3) {
			
			System.out.println("処理を実行");
			
			i = i + 1; // ←この処理がなければ無限ループしてプログラムが終わらない
		}
	}
}
