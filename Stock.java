import java.util.*;
/**
A bank account has a balance that can be changed by 
deposits and withdrawals.
*/
//1. implement variables 
public class Stock { 
	private String stockSymbol;
	private String companyName;
	private double stockPrice;
	
	//2. create default value for variables; initializes variables; does not take parameters; public and always has the same name as class
	public Stock() {
		stockPrice = 0;
		companyName="";
		stockSymbol="";
	}//default constructor
	
	//3. create another constructor that allows user to send values to initialize
	public Stock(String stockSymbol, String companyName, double stockPrice) {
		this.stockSymbol = stockSymbol;
		this.companyName = companyName;
		this.stockPrice = stockPrice;
	}//overloaded constructor
	
	//monitor
	public void displayStock() {
		System.out.println("Symbol:"+stockSymbol);
		System.out.println("Company:" +companyName);
		System.out.println("Price:"+ stockPrice);
	}

	//4. generate getters and setters for certain variables  that do not require a computation
	public String getStockSymbol() {
		return stockSymbol;
	}

	public void setStockSymbol(String stockSymbol) {
		this.stockSymbol = stockSymbol;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public double getStockPrice() {
		return stockPrice;
	}

	public void setStockPrice(double stockPrice) {
		this.stockPrice = stockPrice;
	}
	public double totalCost(int shares) {
		double totalCost=stockPrice*shares;
		return totalCost;
	}


	
}
