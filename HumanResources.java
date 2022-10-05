package week4;

public class HumanResources {

	public int SalaryCalculator(int employeenumber)
	{
		int salary = 50000;
		
		Tax t = new Tax();
			
		int tax = t.TaxCalculator(employeenumber);
		
		int grosssalary = salary - tax;
		
		return grosssalary;
	}
	
}
