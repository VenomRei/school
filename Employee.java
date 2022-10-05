package week4;

public class Employee {

	int employeenumber;
	String firstname = " Jaden";
	String lastname = " Veazia";
	String firstlineofaddress;
	String secondlineofaddress;
	
	public static void main(String[] args) {
		HumanResources h = new HumanResources();
		Employee Jaden = new Employee();

		Jaden.employeenumber = 116;
		Jaden.firstname = " Jaden";

		int big = h.SalaryCalculator(Jaden.employeenumber);

		System.out.print(" The Salary of Employee" + Jaden.firstname + " is $ " + big);
	}
}
