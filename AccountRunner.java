package logicBank;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import newBank.AccountInfo;
import newBank.BankConnection;
import newBank.CustomerInformation;

public class AccountRunner {
	     Scanner scan=new Scanner(System.in);
		 BankConnection logic=new BankConnection();
		 Map<Integer,Map<Integer, AccountInfo>> object=new HashMap<>();

	     public void  newValues()
	     { 
	    	 //1
	    	 CustomerInformation custom1=new CustomerInformation();
	    	 custom1.setAccountHolderName("annie");
	    	 custom1.setAddress("chennai");
	    	 custom1.setMobileNumber(900780980);
	         logic.addCustomerDetails(custom1);
	         
	         
	         //2
	         CustomerInformation custom2=new CustomerInformation();
	         custom2.setAccountHolderName("ashika");
	    	 custom2.setAddress("kkdi");
	    	 
	    	 custom2.setMobileNumber(909780098);
	         logic.addCustomerDetails(custom2);
	         
	        
	         //3
	         CustomerInformation custom3=new CustomerInformation();
	         custom3.setAccountHolderName("lili");
	    	 custom3.setAddress("guindy");
	    	 custom3.setMobileNumber(908978098);
	         logic.addCustomerDetails(custom3);
	         
	         //4
	         CustomerInformation custom4=new CustomerInformation();
	         custom4.setAccountHolderName("annie");
	    	 custom4.setAddress("trichy");
	    	 
	    	 custom4.setMobileNumber(908908098);
	         logic.addCustomerDetails(custom4);
	         
	         //5
	         CustomerInformation custom5=new CustomerInformation();
	         custom5.setAccountHolderName("elaveni");
	    	 custom5.setAddress("karur");
	    	
	    	 custom5.setMobileNumber(908908198);
	         logic.addCustomerDetails(custom5);
	         
	         //6
	         CustomerInformation custom6=new CustomerInformation();
	         custom6.setAccountHolderName("veni");
	    	 custom6.setAddress("lalkudi");
	    	 custom6.setMobileNumber(908508198);
	         logic.addCustomerDetails(custom6);
	         
	         //7
	         CustomerInformation custom7=new CustomerInformation();
	         custom7.setAccountHolderName("priya");
	    	 custom7.setAddress("porur");
	    	 custom7.setMobileNumber(908508498);
	         logic.addCustomerDetails(custom7);
	         
	         //8
	         CustomerInformation custom8=new CustomerInformation();
	         custom8.setAccountHolderName("priya");
	    	 custom8.setAddress("porur");
	    	 custom8.setMobileNumber(908508498);
	         logic.addCustomerDetails(custom8);
	         
	     }
	     
	     public void  dummyValues() throws Exception
	     {
	    	
	       	 //1
	    	 AccountInfo acc1=new AccountInfo();
	    	 acc1.setBalance(9800);
	    	 acc1.setBranch("kkdi");
	    	 acc1.setCutomerId(1);
	    	 acc1.setStatus(true);
	    	 logic.addAccount(acc1.getCutomerId(), acc1);
	    	 
	    	 //2
	    	 AccountInfo acc2=new AccountInfo();
	    	 acc2.setBalance(99000);
	    	 acc2.setBranch("porur");
	    	 acc2.setCutomerId(2);
	    	 acc2.setStatus(true);
	    	 logic.addAccount(acc2.getCutomerId(), acc2);
	    	 
	    	 //3
	    	 AccountInfo acc3=new AccountInfo();
	    	 acc3.setBalance(98090);
	    	 acc3.setBranch("coimbatore");
	    	 acc3.setCutomerId(3);
	    	 acc3.setStatus(false);
	    	 logic.addAccount(acc3.getCutomerId(), acc3);
	    	 
	    	 //4
	    	 AccountInfo acc4=new AccountInfo();
	    	 acc4.setBalance(99900);
	    	 acc4.setBranch("kkdi");
	    	 acc4.setCutomerId(4);
	    	 acc4.setStatus(true);
	    	 logic.addAccount(acc4.getCutomerId(), acc4);
	    	 
	    	 AccountInfo acc10=new AccountInfo();
	    	 acc10.setBranch("karnataka");
	    	 acc10.setBalance(700000000);
	    	 acc10.setCutomerId(4);
	    	 acc10.setStatus(true);
	    	 logic.addAccount(acc10.getCutomerId(), acc10);
	    	 
	    	 //5
	    	 AccountInfo acc5=new AccountInfo();
	    	 acc5.setBalance(9800);
	    	 acc5.setBranch("chennai");
	    	 acc5.setCutomerId(5);
	    	 acc5.setStatus(false);
	    	// acc5.setStatus(1);
	    	 logic.addAccount(acc5.getCutomerId(), acc5);
	    	 
	    	 //6
	    	 AccountInfo acc6=new AccountInfo();
	    	 acc6.setBalance(9800);
	    	 acc6.setBranch("trichy");
	    	 acc6.setCutomerId(6);
	    	 acc6.setStatus(true);
	    	 logic.addAccount(acc6.getCutomerId(), acc6);
	    	 
	    	 //7
	    	 AccountInfo acc7=new AccountInfo();
	    	 acc7.setBalance(9800);
	    	 acc7.setBranch("madurai");
	    	 acc7.setCutomerId(7);
	    	 acc7.setStatus(false);
	    	 logic.addAccount(acc7.getCutomerId(), acc7);
	    	 
	    	 AccountInfo acc9=new AccountInfo();
	    	 acc9.setBranch("karnataka");
	    	 acc9.setBalance(700000000);
	    	 acc9.setCutomerId(7);
	    	 acc9.setStatus(true);
	    	 logic.addAccount(acc9.getCutomerId(), acc9);
	    	 
	    	 //8
	    	 AccountInfo acc8=new AccountInfo();
	    	 //acc8.setAccountId(3);
	    	 acc8.setBalance(9800);
	    	 acc8.setBranch("karur");
	    	 acc8.setCutomerId(8);
	    	 acc8.setStatus(true);
	    	 logic.addAccount(acc8.getCutomerId(), acc8);
	    	 
	     }
	     
	     
	     public void  addCustomerDetails()
	     {
	    	 CustomerInformation custom=new CustomerInformation();
	    	 System.out.println("Enter the name: ");
	    	 String name=scan.nextLine();
	    	 custom.setAccountHolderName(name);
	    	 System.out.println("Enter the address");
	    	 String address=scan.nextLine();
	    	 custom.setAddress(address);
	    	 System.out.println("enter the mobileNumber: ");
	    	 long mobileNumber=scan.nextLong();
	    	 custom.setMobileNumber(mobileNumber);
	    	 logic.addCustomerDetails(custom);
	    	 System.out.println("Enter the number to get the details of Customer:");
	    	 int num=scan.nextInt();
	    	 System.out.println(logic.getCustomerDetails(num));
	    	 
	     }
	     
	     public void addAccountDetails()
	     {
	    	 AccountInfo acc=new AccountInfo();
	    	 System.out.println("Enter the balance:");
	    	 long balance=scan.nextLong();
	    	 acc.setBalance(balance);
	    	 scan.nextLine();
	    	 System.out.println("Enter the branch :");
	    	 String branch=scan.nextLine();
	    	 acc.setBranch(branch);
	    	 acc.setStatus(true);
	    	 System.out.println("Enter the AccountId:");
	    	 int customId=scan.nextInt();
	    	 try {
				logic.addAccount(customId, acc);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
	    	 System.out.println(logic.getAccount(customId));
	    	 
	     }
	     
	     
	     
	     
	     
	  
		public void getcustomerDetails()
		{
			System.out.print("Enter the customerid: ");  
		    int id = scan.nextInt(); 
		    System.out.println(logic.getCustomerDetails(id));
		     
		}
		public void getAccountDetails()
		{
			System.out.println("Enter the Account id");
			int numberId=scan.nextInt();
			System.out.println("the account details "+logic.getAccount(numberId));
		}
		
		
		public void getAccountDetailsOnly() throws Exception
		{
			System.out.print("Enter the customerid: ");  
		    int cusId = scan.nextInt(); 
			System.out.print("Enter the accountid: ");  
		    int accId = scan.nextInt(); 
		    System.out.println(logic.getAccIdOnly(cusId, accId));
		     
		}
		
		
		
		
		   public void amountDeposit()
		   
		   {
			   AccountInfo account=new AccountInfo();
			   System.out.println("Enter the id to deposit: ");
			   int id=scan.nextInt();
			   System.out.println("Enter the amount to Deposit: ");
			   long num=scan.nextLong();
			   try {
				logic.depositMoney(id, num, account);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			   System.out.println("the depost amount is: " + logic.getDepositMoney(id));
			   
		   }
		   
		   public void amountWithdrawal()
		   {
			   AccountInfo acc=new AccountInfo();
			   System.out.println("Enter the id to withdrawal: ");
			   int id=scan.nextInt();
			   scan.nextLine();
			   System.out.println("Enter a amount to withdrawal :");
			   long amount=scan.nextLong();
			   try {
				logic.amountWithdrawal(id, amount, acc);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			   System.out.println("the withdrawal amount is: "+ logic.getWithdrawal(id));
		   }
		   
		
		public void setStatusChange()
		{   
			System.out.println("enter the accId to change status: ");
			int accId=scan.nextInt();
			scan.nextLine();
			System.out.println("Enter the number 1 to set status true and 0 to set Status false: ");
			int num=scan.nextInt();
			scan.nextLine();
			try {
				logic.changeStatusCustomer(accId, num);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			System.out.println("Status changed successfully!");	
			System.out.println("Account details:"+logic.getCustomerDetails(num));
		}
		
		public void setStatusAccount()

		{
			
			System.out.println("Enter the customerId to change status: ");
		    int cusId=scan.nextInt();
			System.out.println("enter the accId to change status: ");
			int accId=scan.nextInt();
			System.out.println("Enter the number 1 to set status true and 0 to set Status false: ");
			int num=scan.nextInt();
			try {
				logic.changeStatusAccount(cusId, accId, num);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			System.out.println("Account details:"+logic.getAccount(cusId));

		}
			

		public void passIdToFindActive()
		{
			System.out.println("Enter the number to check active account List: ");
			int number=scan.nextInt();
			System.out.println(logic.getActiveAccountList(number));
		}
		
		
		
		//Main method
		
		public static void main(String[] args) throws Exception {
	        AccountRunner runner=new AccountRunner();
	        System.out.println("enter a number to  get the bank details: 1-addcustomer details,"
	        		+ "2-addAccount details,"
	        		+ "3-getcustomer details if already presents,"
	        		+ "4-getAccountDetails if already presents,"
	        		+ "5-amount Deposit,"
	        		+ "6-withdrawal amount,"
	        		+ "7-getAccountDetails only,"
	        		+ "8-status change for account,"
	        		+ "9-active accountList: ");
	        try(Scanner data=new Scanner(System.in))
	        {
	        int numbers_Case=data.nextInt();
	        data.nextLine();
	        runner.newValues();
	        runner.dummyValues();
	       
	        boolean flag=true;
	        while(flag)
	        {
	        switch(numbers_Case)
	        {
	          case 1:runner.addCustomerDetails();
	         
	          case 2:runner.addAccountDetails();
	        
	          case 3:runner.getcustomerDetails();
	             
	          case 4:runner.getAccountDetails();
	  
	          case 5:runner.amountDeposit();
	          
	          case 6:runner.amountWithdrawal();
	          
	          case 7:runner.getAccountDetailsOnly();
	          
	          case 8:runner.setStatusAccount();
	          
	          case 9:runner.passIdToFindActive();
	          
	          case 10: flag=false;
	               break;
	        }
	        
	        
	        }
				
			
		}
	        catch(Exception e)
	        {
	        	e.printStackTrace();
	        }

		}
}
