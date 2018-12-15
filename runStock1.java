import java.util.*;
public class runStock1 {

	public static void main(String[] args) {

		// Phase 1

		
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
	System.out.println(a.getStockSymbol());

		// Phase 2
/*
	Scanner in = new Scanner (System.in);
	Stock a = new Stock (); //new object, instance of class
	int shares = 0, choice=0;
	double stockPrice=0;

	System.out.println("Please enter stock symbol:");
	String stockSymbol=in.nextLine();
	a.setStockSymbol(stockSymbol);
	System.out.println("Please enter stock name:");
	String companyName=in.nextLine();
	a.setCompanyName(companyName);
	do {
	System.out.println("Please enter stock price:");
	stockPrice=in.nextDouble();
	a.setStockPrice(stockPrice);
	}while(stockPrice<0);
	do {
	System.out.println("How many shares do you want to purchase?");
	shares = in.nextInt();
	}while(shares<0);
	System.out.printf("Total cost:"+ "%10.2f\n", a.totalCost(shares)); // does not compute properly
	System.out.println("Do you want to proceed?");
	System.out.println("1 - Yes");
	System.out.println("2 - No");
	choice = in.nextInt();
	if(choice == 1) {
	System.out.println("Please enter stock symbol:");
	stockSymbol=in.nextLine();
	a.setStockSymbol(stockSymbol);
	in.nextLine();
	System.out.println("Please enter stock name:");
	companyName=in.nextLine();
	a.setCompanyName(companyName);
	do {
	System.out.println("Please enter stock price:");
	stockPrice=in.nextDouble();
	a.setStockPrice(stockPrice);
	}while(stockPrice<0);
	do {
	System.out.println("How many shares do you want to purchase?");
	shares = in.nextInt();
	}while(shares<0);
	System.out.printf("Total cost:"+ "%10.2f\n", a.totalCost(shares)); // does not compute properly
	System.out.println("Thank you");
	}else {
		System.out.println("Thank you");
		return;
	}//else*/
	}//main
}//class
