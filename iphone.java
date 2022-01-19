package technical;
import java.util.*;


public class Iphone1 {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int M=sc.nextInt();
		
		switch(M) {
		case 128:
			System.out.println("the cost of 128 GB Iphone is 64,900 rs");
			break;
		case 256:
			System.out.println("the cost of 256 GB Iphone is 79,900 rs");
			break;
		case 64:
			System.out.println("the cost of 64 GB Iphone is 53,900 rs");
			break;
		default:
			System.out.println("invalid memory size");
		}
		
		
		// TODO Auto-generated method stub

	}

}
