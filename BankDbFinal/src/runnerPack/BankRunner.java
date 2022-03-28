package runnerPack;

import java.math.BigInteger;
import java.util.*;

import BankDbLayer.*;


public class BankRunner {

	Scanner input = new Scanner(System.in);
	static LogicalLayer logic = new LogicalLayer();
	


	public void insertionUpdate() {

		try {
			CustomerInformation custom=new CustomerInformation();

			System.out.println("Enter no of rows to insert:");
			int num = input.nextInt();
			input.nextLine();
			for (int i = 0; i < num; i++) {
				System.out.println("enter details of customer " + (i + 1));
				System.out.println("Enter customerName:");
				String inpName = input.nextLine();
				custom.setCustomerName(inpName);
				System.out.println("Enter address:");
				String caddressName = input.nextLine();
				custom.setAddress(caddressName);
				System.out.println("Enter mobilenumber:");
				long mobNum = input.nextLong();
				custom.setMobileNumber(mobNum);
				input.nextLine();
				logic.getInsertionCustomer(custom);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Exception occurs in insertion method in main " + e.getMessage());
		}

	}

	public void selectionUpdate() 
	{
		try {
			
			System.out.println(logic.getSelectionCustomer());
		    } 
		catch (Exception e) 
		{
			System.out.println("exception in main method: " + e.getMessage());
		}
	}

	public void updationCustomer() 
	{
		try {
			CustomerInformation custom=new CustomerInformation();
			System.out.println("Enter the customer id to update : ");
			int number = input.nextInt();
			input.nextLine();
			custom.setCustomerId(number);
			System.out.println("Enter the name to update : ");
			String name = input.nextLine();
			custom.setCustomerName(name);
			logic.getUpdationCustomer(custom);
		}

		catch (Exception e) {
			System.out.println("exception in update" + e.getMessage());
		}

	}

	public void insertionAccount()
	{
		try {
            AccountInformation acc=new AccountInformation();
			System.out.println("Enter the branch: ");
			String branch = input.nextLine();
			acc.setBranch(branch);
			System.out.println("Enter the balance: ");
			double balance = input.nextDouble();
			input.nextLine();
			acc.setBalance(balance);
			System.out.println("Enter the customerId");
			int cusId = input.nextInt();
			input.nextLine();
			acc.setCustomerId(cusId);
			logic.getInsertionAccount(acc);

		} catch (Exception e) {
			System.out.println("Exception in insertion of account " + e.getMessage());
		}
	}

	public void selectionAccount() 
	{
		try {
			logic.getSelectionAccount();
		    } catch (Exception e) 
		     {
			    System.out.println("Exception in selection " + e.getMessage());
		      }

	}

	public void updationAmountAccount() 
	{
		try {
			AccountInformation act1=new AccountInformation();
			System.out.println("Enter the accountId to update : ");
			int accId = input.nextInt();
			act1.setAccountId(accId);
			System.out.println("Enter the customerId to update:");
			int cusId = input.nextInt();
			act1.setCustomerId(cusId);
			System.out.println("Enter the amount to deposit ");
			double amount = input.nextDouble();
			act1.setBalance(amount);
			logic.getDepositAmount(act1);

		}

		catch (Exception e) {
			System.out.println("Exception in updation Of account! ");
		}
	}

	public void updationWithdrawAccount() 
	 {
		try 
		  {
			AccountInformation acc1=new AccountInformation();
			System.out.println("Enter the AccountId: ");
			int accId = input.nextInt();
			acc1.setAccountId(accId);
			input.nextLine();
			System.out.println("Enter the amount to takeit");
			double balance = input.nextDouble();
			acc1.setBalance(accId);
			logic.getWithdrawAmount(accId,balance);
		  } 
		 catch (Exception e) 
		  {
			System.out.println("Exception in withdraw account" + e.getMessage());
		  }
	}

	public void updateInAccount() 
	 {
		try 
		  {
			AccountInformation act=new AccountInformation();
			System.out.println("Enter the accId to update: ");
			int accId = input.nextInt();
			act.setAccountId(accId);
			System.out.println("Enter the cusId to update: ");
			int cusId = input.nextInt();
			act.setCustomerId(cusId);
			input.nextLine();
			System.out.println("Enter the branch name to update: ");
			String name = input.nextLine();
			act.setBranch(name);
			logic.getUpdate(act);
			
		 }
		catch (Exception e) 
		  {
			System.out.println("Exception in updation in normal account " + e.getMessage());
		  }
	}

	public void getActiveAccount() 
	  {
		try 
		 {
			System.out.println("Enter the account id: "); 
			boolean status = true;
			System.out.println(logic.getActiveAccount(status));
		 }
		catch (Exception e) 
		 {
			System.out.println("Exception in activelist " + e.getMessage());
		 }

	}

	public void changeStatus() 
	   {
		System.out.println("Enter the accId to change status: ");
		int accId = input.nextInt();
		System.out.println("Ener the customerId to change status");
		int cusId=input.nextInt();
		System.out.println("Enter the number to change status 1 or 0: ");
		int status = input.nextInt();
		logic.changeStatus(accId,cusId,status);
	}

	public void deletionAccount() 
	  {
		AccountInformation account1=new AccountInformation();
		System.out.println("Enter the accId To delete ");
		int accId = input.nextInt();
		account1.setAccountId(accId);
		System.out.println("Enter the cusId to delete ");
		int cusId = input.nextInt();
		account1.setCustomerId(cusId);
		 
		try 
		{
			logic.getdelete(account1);
		}
		catch (Exception e) 
		{
		
			e.printStackTrace();
		}
		
	  }

	public static void main(String[] args) 
	  {
		 BankRunner run = new BankRunner();
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter a integer ");
		 int cases = scan.nextInt();
		 boolean bool=true;
          while(bool) 
            {
	        	try
	        	  {
			    switch (cases) 
			        {
			        case 1:
				        logic.getCustomerCreation();

			        case 2:
				          run.insertionUpdate();

			        case 3:
				          run.selectionUpdate();

			        case 4:
				          run.updationCustomer();
 
			        case 5:
				          logic.getCreationAccount();

		        	case 6:
				         run.insertionAccount();

			        case 7:
				         run.selectionAccount();

			        case 8:
				         run.updationAmountAccount();

			        case 9:
			           	run.updationWithdrawAccount();

			        case 10:
				        run.updateInAccount();

			        case 11:
				       run.getActiveAccount();

			        case 12:
				      run.changeStatus();

			        case 13:
				      run.deletionAccount();

			        case 14:
				      logic.getDrop();

			       case 15:
				      logic.getCloseCall();
			
			       case 16:bool=false;
			       }
		    }
	      catch (Exception e) 
	        	{
		         	e.printStackTrace();
			        System.out.println("Exception in main method " + e.getMessage());
		       }
		}
	}
}
