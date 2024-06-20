class BankCustomer
{
	String Customer_name;
	long Account_no;
	double Balance;
	String Address;
	long Aadhar_no;
	long Pan_no;
	static String Bank_name;
	static long Bank_tollfree_no;
	static long Contact_no;
	static String Emailid_customersupport;
	void customerDetails(){
		System.out.println("customer name is:"+ Customer_name);
		System.out.println("Account number is:"+  Account_no);
		System.out.println("customer balance is:"+ Balance);
		System.out.println("customer Address is:"+ Address);
		System.out.println("customer Aadhar number is:"+  Aadhar_no);
        System.out.println("customer Pan number is:"+ Pan_no);
	}
	static void bank_details(){
		
		 System.out.println("your bank name is:"+Bank_name);
		System.out.println("Bank toll free number is:"+ Bank_tollfree_no);
		System.out.println("Bank contact number  is:"+ Contact_no);      
		


	  }
	  
	public static void main(String[] args) 
	{
		 BankCustomer.Bank_name="Punjab National Bank";
		BankCustomer.Bank_tollfree_no =  23224544;
		BankCustomer.Contact_no = 9987651;
		BankCustomer. Emailid_customersupport= "punjab@ gamil.com";

		 bank_details();

		BankCustomer c1 =  new BankCustomer();
		BankCustomer c2 =  new BankCustomer();
		c1.Customer_name = "Shreya Gupta";
		c1.Account_no =    123456;
		c1. Balance= 500000;
		c1.Address = "kanpur";
		c1.Aadhar_no= 98765;
		c1.Pan_no= 112244;
		c2.Customer_name = "Aditya Gupta";
		c2.Account_no =    99887766;
		c2. Balance= 100000;
		c2.Address = "Delhi";
		c2.Aadhar_no= 23435;
		c2.Pan_no= 23457;
		c1. customerDetails();
		c2. customerDetails();

	}
}
