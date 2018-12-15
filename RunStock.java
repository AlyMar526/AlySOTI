import java.util.*;
public class RunStock {

	public static void main(String[] args) {
	String stockSymbol="",companyName="";
	double stockPrice=0;
	int choice=0, shares=0;
		Scanner in = new Scanner (System.in);
		Stock a = new Stock("AAPL","Apple Inc",176.98); //vs Stock s = new Stock() runs default constructor 
		a.displayStock();
		do {
		System.out.println("How many shares do you want to purchase?");
		shares = in.nextInt();
		}while (shares<0);
		System.out.printf("Total cost:"+"%10.2f\n", a.totalCost(shares));
		/*in.nextLine();
		System.out.println("Do you want to proceed?");
		System.out.println("1 - Yes");
		System.out.println("2 - No");
		choice = in.nextInt();
		if(choice == 1) {
		//2nd Object; had to either create new variables in main or declare a new object to override default constructor ie. s.setName; get retrieves and displays, set requires user input and initialize
		
		System.out.println("Please enter stock symbol:");
		stockSymbol=in.nextLine();
		in.nextLine();
		System.out.println("Please enter stock name:");
		companyName=in.nextLine();
		do {
		System.out.println("Please enter stock price:");
		stockPrice=in.nextDouble();
		}while(stockPrice<0);
		Stock a = new Stock(stockSymbol,companyName,stockPrice);
		do {
		System.out.println("How many shares do you want to purchase?");
		shares = in.nextInt();
		}while(shares<0);
		System.out.printf("Total cost:"+ "%10.2f\n", a.totalCost(shares)); // does not compute properly
	}else {
		System.out.println("Thank you");
		return;
	}//else*/
	}//main
}//class


