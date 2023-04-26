package answer;

public class Ex36 {

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			// i % 15だと良くない書き方です(15が何なのか後から見てわからないため)
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}

	}
}
