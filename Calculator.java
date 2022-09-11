/* */

package school;
import java.util.Scanner;
public class Calculator {
	
	int average = 0;
	
	public static int averagecalculator() {
		
		Scanner sc = new Scanner(System.in);
		
		int totalstudents = 0;
		int age,age2,age3;
		int sumofages;
		int averageage;
		
		System.out.print("This student's age is : ");
		 age = sc.nextInt();
		totalstudents++;
		System.out.print("This student's age is : ");
		age2 = sc.nextInt();
		totalstudents++;
		System.out.print("This student's age is : ");
		age3 = sc.nextInt();
		totalstudents++;
		
		 sumofages = age + age2 + age3;
		averageage = sumofages/totalstudents;
		
		return averageage;
	}
	/*	do {
			int totalstudents++;
		}while(sc.hasNext());
		int averageage = sumofages/totalstudents;
	}*/
	
	public static void main(String[] args) {
		
		int returnedaverage;
		returnedaverage = Calculator.averagecalculator();
		System.out.print(returnedaverage);
	}
	
}
