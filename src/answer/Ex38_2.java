package answer;

public class Ex38_2 {

	public static void main(String[] args) {
		int limit = 10;
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				if(j <= limit) {
					System.out.print("*");
				}
			}
			System.out.println();
			limit--;
		}
	}
}
