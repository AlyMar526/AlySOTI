/**
 * Employee Class allows for gross pay, tax amount and net pay computations
 * @author alexis
 *
 */
public class Employee {
private int id;
private String firstName;
private String lastName;
private double hoursWorked;
private double hourlyRate;
private String status;
public Employee() {
	id=0;
	firstName= "";
	lastName= "";
	hoursWorked=0;
	hourlyRate=0;
	status="";
}
public Employee (int id, String firstName, String lastName, double hoursWorked, double hourlyRate, String status) {
	this.id=id;
	this.firstName= firstName;
	this.lastName= lastName;
	this.hoursWorked=hoursWorked;
	this.hourlyRate=hourlyRate;
	this.status=status;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
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
public double getHoursWorked() {
	return hoursWorked;
}
public void setHoursWorked(double hoursWorked) {
	this.hoursWorked = hoursWorked;
}
public double getHourlyRate() {
	return hourlyRate;
}
public void setHourlyRate(double hourlyRate) {
	this.hourlyRate = hourlyRate;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
/**
 * Computes Gross Pay
 * @param hours
 * @param rate
 * @return
 */
public double computeGrossPay() {
	double grossPay=0, regularPay=0;
	
	if(hoursWorked>40) {
		grossPay=((hourlyRate*.5)*(hoursWorked-40))+(hoursWorked*hourlyRate);
		//or grossPay=((rate*1.5)*(hours-40))+(40*rate);
	}//including overtime
	else {
		grossPay=hoursWorked*hourlyRate;
	}//only regular pay 
	return grossPay;
}
/**
 * computes netpay 
 * to be called at the end of program
 * @param grossPay
 * @param taxAmount
 * @return
 */
public double computeNetPay() {
	double netPay=0;
	netPay = computeGrossPay() - computeTaxAmount();
	return netPay;
}
/**
 * Method for computing tax amount
 */
public double computeTaxAmount() {
	double taxAmount=0;
	double grossPay = computeGrossPay();
  if(status.equalsIgnoreCase("single")|| status.equalsIgnoreCase("s")){
  		 	if(grossPay <= 71){
  	 		taxAmount = 0;
  			}
  			else if (grossPay<= 254){
  				taxAmount = .1 * (grossPay-71); //tax pay of excess over given amount
  			}
  			else if (grossPay <= 815){
  				taxAmount = 18.30 + .12 * (grossPay - 254);
  			}
  			else if (grossPay <= 1658){
  			  taxAmount = (grossPay-815)*.22+85.62;
  			}
  			else if (grossPay<=3100){
  			  taxAmount = (grossPay-1658)*.24+271.08;

  			}
  			else if (grossPay <=3917){
  			  taxAmount = (grossPay-3100)*.32+617.16;
  			}
  			else if (grossPay <=9687){
  			  taxAmount = (grossPay-3917)*.35+878.60;
  			}
  			else {
  			  taxAmount = (grossPay-9687)*.37+2898.10;
  			}
  	 }
  	 	if (status.equalsIgnoreCase("married")||status.equalsIgnoreCase("m")) {
  				if(grossPay <= 222){
  			 		taxAmount = 0;
  					}
  					else if (grossPay<= 588){
  						taxAmount = .1 * (grossPay-222);
  					}
  					else if (grossPay <= 1711){
  					/*	taxAmount = 36.60 + .12 * (grossPay - 588);*/
  						taxAmount = .12 * (grossPay - 588)+36.60;
  					}
  					else if (grossPay <= 3395){
  					  taxAmount = (grossPay-1711)*.22+171.36;
  					}
  					else if (grossPay<=6280){
  					  taxAmount = (grossPay-3395)*.24+541.84;

  					}
  					else if (grossPay <=7914){
  					  taxAmount = (grossPay-6280)*.32+1234.24;
  					}
  					else if (grossPay <=11761){
  					  taxAmount = (grossPay-7914)*.35+1757.12;
  					}
  					else {
  					  taxAmount = (grossPay-11761)*.37+3103.57;
  					}
  	 	}
  		return taxAmount;
  }
/**
 * Displays Employee Info
 */
public void displayEmployeeInfo() {
	//grossPay calls for hours and rate
	System.out.printf("%-20s$%.2f\n", "Gross Pay:",computeGrossPay());

	//taxAmount calls for status and gross pay
	System.out.printf("%-20s$%.2f\n", "Tax Amount:", computeTaxAmount());

	//netPay
	System.out.printf("%-20s$%.2f\n", "Net pay:",computeNetPay());
	}
}