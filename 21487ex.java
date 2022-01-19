package exercise.address;

public class SingleAddress {
	private String firstName;
	private String lastName;
	private String streetAddress;
	private String city;
	private String state;
	private String country;
	private int postalCode;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}
	
	
	
	
	
	
}




package exercise.address;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;


public class AddressBook {
	//String streetAddress;
	String city;
	String state;
	//String country;
	
	public AddressBook(String streetAddress, String city, String state, String country){
		//this.streetAddress=streetAddress;
		this.city=city;
		this.state=state;
		//this.country=country;	
		
	}
	@Override
	public String toString() {
		return "AddressBook [city=" + city + ", state=" + state + "]";
	}
	public class Names{
		String firstName;
		String lastName;
		public Names(String firstName, String lastName) {
			this.firstName=firstName;
			this.lastName=lastName;
		}
		@Override
		public String toString() {
			return "Names [firstName=" + firstName + ", lastName=" + lastName + "]";
		}
		




		
		
		
		
		
		
		
	}
	
	public static void main(String args[]) throws Exception {
		//Scanner in=new Scanner(System.in);
		ArrayList<String> addlist =new ArrayList<String>();
		ArrayList<String> namesadd=new ArrayList<String>();
		ArrayList<String> namesadd1=new ArrayList<String>();
		namesadd.add("smith jones");
		namesadd1.add("william jones");
		System.out.println(namesadd);
		System.out.println(namesadd1);
		
		
		//addlist.add("blr-kar");
		addlist.add("chittor-Ap");
		//addlist.add("hyd-Ts");
		//addlist.add("sec-Ts");
		//addlist.add("mysore-kar");
		//addlist.add("tpt-Ap");
		addlist.add("puttur-Ap");
		addlist.add("tirupati-Ap");
		addlist.add("pakala-Ap");
		addlist.add("kurnool-Ap");
		System.out.println(addlist);
		//boolean b=addlist.contains("puttur-Ap");
		//if (b==true) {
			//System.out.println("duplicate address");
		//} else {
			//System.out.println("its a new address");
		//}
		
		
		Scanner in=new Scanner(System.in);
		while(in.hasNext()) {
			//addlist.add(in.next());
			//System.out.println(addlist);
			boolean b=addlist.contains(in.next());
			if (b==true) {
				throw new Exception("this address already exists");
				//System.out.println("duplicate address");
			} else {
				//addlist.add(in.next());
				System.out.println("its a new address");
				//addlist.add(in.next());
			}
			
		}
		
		
		
		
		
		
		
		
		//System.out.println("List of Address:");
		//while(in.hasNext()){
			//addlist.add(in.next());
		
		//System.out.println(addlist);
		//}
		
	    //ArrayList<String> addlist1=new ArrayList<String>();
		//ArrayList<String> addlist2=new ArrayList<String>();
		
		//addlist.add("victory block");
		//addlist.add("chennai");
		//addlist.add("TN");
		//addlist.add("india");
        //addlist1.add("west block");
		//addlist1.add("hyderabad");
		//addlist1.add("TS");
		//addlist1.add("india");
		//addlist2.add("east zone");
         //addlist2.add("chittoor");
		//addlist2.add("AP");
		//addlist2.add("india");
		//System.out.println(addlist);
		//System.out.println(addlist1);
		//System.out.println(addlist2);
		//ArrayList<String> addlist3=new ArrayList<String>();
		//addlist3.add("victory block");
		//addlist3.add("chennai");
		//addlist3.add("TN1");
		//addlist3.add("india");
		//System.out.println(addlist3);
		//boolean b=addlist.equals(addlist3);
		//System.out.println(b);
		
		
		
		
		
		
	}
}



package exercise.address;
public class AddressMain {

	public static void main(String[] args) {
		SingleAddress s1=new SingleAddress();
		SingleAddress s2=new SingleAddress();
		SingleAddress s3=new SingleAddress();
		s1.setFirstName("harry");
		s1.setLastName("s");
		s1.setStreetAddress("victory block");
		s1.setCity("chennai");
		s1.setState("TN");
		s1.setCountry("india");
		s1.setPostalCode(123456);
		System.out.print("1.");
		System.out.println(s1.getFirstName());
		System.out.println(s1.getLastName());
		System.out.println(s1.getStreetAddress());
		System.out.println(s1.getCity());
		System.out.println(s1.getState());
		System.out.println(s1.getCountry());
		System.out.println(s1.getPostalCode());
		s2.setFirstName("sai");
		s2.setLastName("s");
		s2.setStreetAddress("win block");
		s2.setCity("kurnool");
		s2.setState("AP");
		s2.setCountry("india");
		s2.setPostalCode(113456);
		System.out.print("2.");
		System.out.println(s2.getFirstName());
		System.out.println(s2.getLastName());
		System.out.println(s2.getStreetAddress());
		System.out.println(s2.getCity());
		System.out.println(s2.getState());
		System.out.println(s2.getCountry());
		System.out.println(s2.getPostalCode());
		s3.setFirstName("SREE");
		s3.setLastName("M");
		s3.setStreetAddress("HIGH block");
		s3.setCity("blr");
		s3.setState("karnataka");
		s3.setCountry("india");
		s3.setPostalCode(560056);
		System.out.print("3.");
		System.out.println(s3.getFirstName());
		System.out.println(s3.getLastName());
		System.out.println(s3.getStreetAddress());
		System.out.println(s3.getCity());
		System.out.println(s3.getState());
		System.out.println(s3.getCountry());
		System.out.println(s3.getPostalCode());
		
		
		
		
		
		
	
	
		
		
		
		
	}

	

	

}




	
	














