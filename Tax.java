package week4;

public class Tax {

	public int TaxCalculator(int employeenumber)
	{
		int tax = 0;
		if (employeenumber == 116)
		{
			tax = 5000;
		}
		else if(employeenumber != 116)
		{
			System.out.println("not found");
		}
		
		return tax;
	}
}
