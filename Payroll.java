import java.util.*;
public class Payroll{	
public static void main(String[] args) {
		// TODO Auto-generated method stub
String fName, lName, status="",choice="";
double hours=0, rate=0, totalGrossPay=0, averageGrossPay=0;
int employeeID = 0, count=0;
Employee a = new Employee ();
Scanner in = new Scanner(System.in);
System.out.println("Welcome to our student payroll!");
System.out.println("Please enter the following information:");
do{
	do {
		System.out.println("Employee id:");
	     employeeID = in.nextInt();// INPUT: get user input find out why not nextString
	     a.setId(employeeID);
	} while(employeeID<0);
	  System.out.println("First and last name:");
	  	fName = in.next();
	  	a.setFirstName(fName);
	  	lName = in.next();
	  	a.setLastName(lName);
		System.out.println("Marital Status- Married or Single:");
			status = in.next();
			a.setStatus(status);
	do {
	  System.out.println("Hours worked: ");
	     hours = in.nextDouble();// INPUT: get user input for hours worked
	     a.setHoursWorked(hours);
	}while(hours<0);
	do {
	  System.out.println("Hourly rate: ");
	     rate = in.nextDouble(); //INPUT: Hourly rate
	     a.setHourlyRate(rate);
	}while(rate<0);
	totalGrossPay += a.computeGrossPay();
	count++;
	averageGrossPay = totalGrossPay/count;
System.out.println("Do you want to continue? Press q to quit");
choice = in.next();
}while(!choice.equalsIgnoreCase("q")); 

a.displayEmployeeInfo();
System.out.println("Number of employees entered: "+ count);
System.out.printf("Average Gross Pay:%7.2f\n",averageGrossPay);
			  }// main method
			 }// Payroll class
