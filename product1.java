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
package technical;

public class Product1 {

	public static void main(String[] args) {
		Product p1=new Product();
		p1.ProId=2121;
		p1.ProName="sony";
		p1.ProPrice=5000;
		p1.ProTax=500;
		System.out.println(p1.ProId);
		System.out.println(p1.ProName);
		double calcPrice=Product.calcPrice();
		System.out.println(calcPrice);
		
		// TODO Auto-generated method stub

	}

}

