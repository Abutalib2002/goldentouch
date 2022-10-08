package Assignment1;
import java.util.Scanner ;

public class PensionContributionCalculatorWithSentinel {
public static void main(String[] args) {
	final int SALARY_CEILING = 6000; 
	 final double EMPLOYEE_RATE_55_AND_BELOW = 0.2; 
	 final double EMPLOYER_RATE_55_AND_BELOW = 0.17; 
	 final double EMPLOYEE_RATE_55_TO_60 = 0.13; 
	 final double EMPLOYER_RATE_55_TO_60 = 0.13; 
	 final double EMPLOYEE_RATE_60_TO_65 = 0.075; 
	 final double EMPLOYER_RATE_60_TO_65 = 0.09; 
	 final double EMPLOYEE_RATE_65_ABOVE = 0.05; 
	 final double EMPLOYER_RATE_65_ABOVE = 0.075;
	 
	 int SENTINEL = -1,salary, age; // to be input
	 int contributableSalary; 
	 double employeeContribution, employerContribution, 
	totalContribution; 
	 Scanner scan= new Scanner (System.in);
	 
	 System.out.println("Enter the Monthly Salary:  ");
	salary = scan.nextInt();
	System.out.println("Enter the your age :" );
	age = scan.nextInt();
	
	contributableSalary = 800;
	while(age != SENTINEL) { 
	if (age <= 55) { // 55 and below
		 employeeContribution = salary * EMPLOYEE_RATE_55_AND_BELOW;
		 employerContribution = salary *EMPLOYER_RATE_55_AND_BELOW;
		 
		 } else if (age <= 60) { // (60, 65]
		 employeeContribution  = salary * EMPLOYEE_RATE_55_TO_60;
		 employerContribution = EMPLOYER_RATE_55_TO_60;
		
		 } else if (age <= 65) { // (55, 60]
		employeeContribution = salary * EMPLOYEE_RATE_60_TO_65;
		employerContribution =  salary * EMPLOYER_RATE_60_TO_65;
		
		 } else { // above 65
		employeeContribution = salary * EMPLOYEE_RATE_65_ABOVE ;
		employerContribution  =   EMPLOYER_RATE_65_ABOVE;
		 } 
		 
	
	totalContribution = employeeContribution + employerContribution;
	System.out.println("THE EMPLOYEE CONTRIBUTION IS : "+ employeeContribution);
	System.out.println("THE EMPLOYER CONTRIBUTION IS: "+employerContribution);
	System.out.println("THE TOTAL CONTRIBUTION IS : "  + totalContribution);

	}
	System.out.println("THIS IS NOT VALID AGE.....");
}
}
