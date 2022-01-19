package technical;

public class Employee {
	
	public int empno;
	public String empname;
	public int salcal;
	
	public void display() {
		System.out.println("display the empno");
	}
	
	public void salcal() {
		System.out.println("calculate the salary");
	}

}

package technical;

public class Developer extends Manager {
	
	public String empname;
	public int calsal;
	
	public void display() {
		System.out.println("Salary calculation of emp");
		

}
	
}


package technical;

public class Manager extends Employee {
	
	public String empname;
	public int calsal;
	
	public void display() {
		System.out.println("Calculate the salary");
		
	}

}

package technical;

public class Tester extends Developer {
	
	public String empname;
	public int calsal;
	
	public void display() {
		System.out.println("Cal Emp Salary");
		

}

}
package technical;

public class EmpMain {

	public static void main(String[] args) {
		
		Manager m1 = new Manager();
		m1.display();
		
		Developer d1 = new Developer();
		d1.display();
		
		Tester t1 = new Tester();
		t1.display();
		
		
	}

}


