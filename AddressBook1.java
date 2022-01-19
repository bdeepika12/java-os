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

	
	


