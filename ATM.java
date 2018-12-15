import java.util.*;
public class ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in = new Scanner (System.in);
BankAccount Alexis = new BankAccount(); // create a new object, empty parenthesis takes initialized balance of zero
int pin=0, NewPin=0, counter=0;
boolean terminate=false;
int choice=0, amount=0,choice2=0; // must be initialized to a non option

System.out.println("Welcome to SJU ATM service!");
System.out.println("Enter a new four digit pin number:");
NewPin=in.nextInt();
if(NewPin<0||NewPin>9999) {
	while(NewPin<0||NewPin>9999) {
System.out.println("You've entered an invalid pin. Please try again:");
NewPin=in.nextInt();
	}//end of while
	
}else if(NewPin>=0 && NewPin<9999) {
pin=NewPin;
System.out.println("Your Pin is:"+pin); 
}//end of else if
else {
System.out.println("Your Pin is:"+pin);
}//end of else

System.out.println("Please enter your pin to proceed");
pin=in.nextInt();

if(pin==NewPin) {
System.out.println("Please select from the following options:");
System.out.println("1 - View Balance:");
System.out.println("2 - Make a Deposit:");
System.out.println("3 - Withdraw Cash:");
System.out.println("4 - Exit:");
System.out.println("Enter Choice: ");
choice = in.nextInt();
}else if (pin !=NewPin) {

	for(int x=1; x<3;x++) {
	System.out.println("You've entered an incorrect pin. Please Re-enter pin");
	pin=in.nextInt();
	counter++;
	if(pin==NewPin) {
		break;
	}
	}
		if(pin!=NewPin) {
			System.out.println("You've entered an incorrect pin more than 3 times. Thank you for using our ATM. Have a good day.");
			return;		
		}else {
			System.out.println("Good");
		}//end else
		System.out.println("Please select from the following options:");
		System.out.println("1 - View Balance:");
		System.out.println("2 - Make a Deposit:");
		System.out.println("3 - Withdraw Cash:");
		System.out.println("4 - Exit:");
		System.out.println("Enter Choice: ");
		choice = in.nextInt();	
}//end else if
	do {		
switch(choice) {
case 1:
	System.out.println("Your balance:"+ Alexis.getBalance());
	break;
case 2:
	do {
	System.out.println("Enter amount for deposit:");
	amount =in.nextInt();
	}while(amount<0);
	Alexis.deposit(amount);//because it is void you would call it on its own line
	System.out.println("Your new balance is:"+ Alexis.getBalance());
	break;
case 3:
	do {
	System.out.println("Enter amount for withdrawal:");
	amount =in.nextInt();
	}while(amount>Alexis.getBalance());
	Alexis.withdraw(amount);
	System.out.println("Your new balance is:"+ Alexis.getBalance());
	break;
case 4:
	System.out.println("Thank you for using our ATM");
	break;
default: System.out.println("ERR, Please ReEnter Choice: ");
	break;
}
if(choice!=4) {
	System.out.println("Would you like to do another action?");
	System.out.println("1 - Yes");
	System.out.println("2 - No");
	choice2 = in.nextInt();
		if(choice2==2) {
		System.out.println("Thank you for using our ATM. Have a nice day!");
		break;
		}else {
			System.out.println("Please select from the following options:");
			System.out.println("1 - View Balance:");
			System.out.println("2 - Make a Deposit:");
			System.out.println("3 - Withdraw Cash:");
			System.out.println("4 - Exit:");
			System.out.println("Enter Choice: ");
			choice = in.nextInt();
		}
	}
		
}while(choice!=4);
	}//main
}//class


