package BankAccount;

public class RegularCustomer extends Customer {
	//class variables
		String customerID;
		String customerName;
		String customerType;
		double amount;
		
		//constructor
		RegularCustomer(String custId, String custName, String custType, double amt){
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
			
			if(this.customerType == "Domestic") {
				//for Domestic customer type we are discounting 500 rupees
				return amount - 500;
			}
			else if(this.customerType == "Business") {
				//for business customer no discount
				return amount;
			}
			return amount;
		}
}
