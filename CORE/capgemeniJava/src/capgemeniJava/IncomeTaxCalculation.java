package capgemeniJava;

import java.util.Scanner;

public class IncomeTaxCalculation {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		double tax=0.0;
		System.out.println("enter your salary:");
		double salary=sc.nextDouble();
		System.out.println("you salary per annum is"+salary);
		if(salary<180000.0) {
		tax=0.0;
		}
		else if((salary > 180000.0 && salary < 300000.0)) {
			tax=0.0*180000.0 + (salary-180000)*0.1;
		}
		else if(salary > 300000.0 && salary <= 500000.0) {
			tax = 0.0 * 180000.0 + 0.1 * 120000.0 + (salary-300000) * 0.2 ;
		}
		else if(salary > 500000) {
			tax = 0.0 * 180000.0 + 0.1 * 120000.0 + 0.2 * 200000.0 + (salary-500000)*0.3;
					
			
			}
		System.out.println("the income tax amount need to be paid is"+tax);
		}

}

