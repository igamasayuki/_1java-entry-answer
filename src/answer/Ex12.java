package answer;

public class Ex12 {

	public static void main(String[] args) {
		
		int item1TotalPrice = 500 * 4;
		int item2TotalPrice = 350 * 8;
		
		int subTotal = item1TotalPrice + item2TotalPrice;
		
		System.out.println("小計金額");
		System.out.println(subTotal);
		
		int tax = (int)(subTotal * 0.1);
		System.out.println("消費税");
		System.out.println(tax);
		
		int total = subTotal + tax;
		System.out.println("合計金額");
		System.out.println(total);
		
	}

}
