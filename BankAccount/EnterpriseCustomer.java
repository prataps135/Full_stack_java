package BankAccount;

public class EnterpriseCustomer extends Customer {
	//class variables
	String customerID;
	String customerName;
	String customerType;
	double amount;
	
	//constructor
	EnterpriseCustomer(String custId, String custName, String custType, double amt){
		super(custId,custName,custType);
		
		this.customerID = custId;
		this.customerName = custName;
		this.customerType = custType;
		this.amount = amt;
	}
	
	//method 
	double get_final_amount(double interest, int year) {
		double simple_interest = this.amount * interest * year;
		double amount = this.amount + simple_interest;
		
		//flat 500 discount for all enterprise customer
		amount = amount - 500;
		if(this.customerType == "Small Scale") {
			//for regular customer type we are discounting 100 rupees more
			return amount - 100;
		}
		else if(this.customerType == "Big Scale") {
			//for big scale no discount
			return amount;
		}
		return amount;
	}

}
