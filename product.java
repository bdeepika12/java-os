package technical;

public class Product {
	public int ProId;
	public String ProName;
	public static int ProPrice;
	public static int ProTax;
	
	public static double calcPrice() {
		return ProPrice+ProTax;
	}
	

}
