package BankAccount;

public abstract class Customer {
	String customerID;
	String customerName;
	String customerType;
	
	Customer(String custId,String custName,String custType){
		this.customerID = custId;
		this.customerName = custName;
		this.customerType = custType;
	}
	
	void showCustomerDetails() {
		System.out.println("Customer ID: "+ this.customerID);
		System.out.println("Customer Name: "+ this.customerName);
		System.out.println("Customer Type: "+ this.customerType);
	}
	
	abstract double get_final_amount(double interest, int year);
}
