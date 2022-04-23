package l3Project;
import java.util.*;
import pojoClass.*;
import java.time.LocalDate;
import java.time.LocalTime;

public class BankCache {
	
	Map<Integer,CustomerDet> customMap=new HashMap<>();
	Map<Integer,AccountDet>  accountMap=new HashMap<>();
	Map<Integer,ArrayList<Integer>> listMap=new HashMap<>();
	Map<Integer,ArrayList<TransactionHistoryPojo>>  trans=new HashMap<>();

	
	private int accId=3000;
	private int cusId=1000;
	int initialAmount=1000;
	public int roleID=1;
	private String password1="admin@123";
	public int getAccountId()
	{
	   return accId++;
	}
	public int getCustomerId()
	{
		return cusId++;
	}
	
	public BankCache()
	{
		AccountDet account=new AccountDet();
		account.setRoleID(accId);
		account.setPassword(password1);
		accountMap.put(getCustomerId(), account);
	}

	
	
	
	
	public String  loginMethod(int userId,String pass) throws Exception
	{
		int id=userCredentials(userId,pass);
		if(id == 1)
		{
			return "Admin";
		}
		else if(id == 2)
		{
			return "Customer";
		} 
		
		return "Enter the correct username and password";
	}
	
	
	
	public void addCustomerDetails(CustomerDet custom) throws Exception
	{
		System.out.println(customMap);
		
		customMap.put(getCustomerId(), custom);
		System.out.println("Customer Added Successfully ");
	    
	}
	
	public int  userCredentials(int userId,String password) throws Exception
	{
	    CustomerDet custom=customMap.get(userId);
	    System.out.println(customMap);
		if(userId == roleID && password.equals(password1))
		{
			return 1;
		}
		else if(custom.getCusId() == userId && password.equals(custom.getPassword()))
		{
			return 2;
		}
		else {
			return 0;
		}
	}
	
	public CustomerDet getCustomerDetails(int customerId) throws Exception
	{
		if(customMap == null)
		{
			System.out.println("the customMap in get Customer details are empty ");
			return customMap.get(customerId);
		}
		CustomerDet res=customMap.get(customerId);
		return res;
	}
	
	public Map<Integer,CustomerDet> allCustomerDetails() throws Exception
	{
		if(customMap == null)
			{
			System.out.println("the customMap is empty");
			return customMap;
			}
		
		return customMap;
	}
	
	
	
	public void addAccountDetails(AccountDet acc)
	{
		if(accountMap == null)
		{
			System.out.println("the accountMap is empty");
			return;
		}
		ArrayList<Integer> list=new ArrayList<>();
		accountMap.put(getAccountId(), acc);
		list.add(acc.getAccId());
		listMap.put(acc.getCusId(), list);
		//System.out.println("Account Id added Successfully ");
	}
	public AccountDet getAccountDetails(int accId)
	{
		if(accountMap == null )
		{
			System.out.println("the the accountMap is empty");
			return accountMap.get(accId);
		}
		else if(listMap.containsValue(accId)) 
		{
		return accountMap.get(accId);
		}
		return accountMap.get(accId);
	}
	
	public void amountDeposit(int accountId,double bal,int customerId) throws Exception
	{
		if(accountMap== null)
		{
			System.out.println("the account Map is empty");
			return ;
		}
		LocalDate myObj = LocalDate.now(); 
		LocalTime myObj1 = LocalTime.now();
		TransactionHistoryPojo hist=new TransactionHistoryPojo();
		ArrayList<TransactionHistoryPojo> list=new ArrayList<>();
		if(accountMap.containsKey(accountId))
		{
		AccountDet account=accountMap.get(accountId);
		double bal1=0;
		if(account != null)
		{
		bal1=account.getBalance();
		bal1+=bal;
		account.setBalance(bal1);
		hist.setDeposit(bal);
		hist.setAccId(accountId);
		hist.setBal(bal1);
		hist.setDate(myObj);
		hist.setTime(myObj1);
		String val="money has been deposited"+ accountId+"at "+ myObj +" cuurent balance is "+ bal1;
		hist.setComments(val);
		list.add(hist);
		
		trans.put(customerId,list);
		accountMap.put(accountId, account);
		//System.out.println("the trans is "+ trans);
		System.out.println("Amount Deposited Successfully"); 
		}}
		
	}
		

		
	
	
	public void withdrawlAmount(int accountId,double bal,int customerId) throws Exception
	{
		if(accountMap== null)
		{
			System.out.println("the account Map is empty");
			return ;
		}
		LocalDate myObj = LocalDate.now(); 
		LocalTime myObj1 = LocalTime.now();
		TransactionHistoryPojo hist=new TransactionHistoryPojo();
		ArrayList<TransactionHistoryPojo> list=new ArrayList<>();
		if(accountMap.containsKey(accountId))
		{
		AccountDet account=accountMap.get(accountId);
		double balance=account.getBalance();
		
		if(balance != 0 && balance > initialAmount && bal > initialAmount )
		{
			balance -=bal;
			hist.setBal(balance);
			hist.setWithdrawn(bal);
			hist.setAccId(accountId);
			hist.setCusId(customerId);
			hist.setDate(myObj);
			hist.setTime(myObj1);
			String val="your money has been withdrawn "+ accountId + " at "+ myObj +  " currentBalance is "+balance;
			hist.setComments(val);
			list.add(hist);
			
			account.setBalance(balance);
			trans.put(customerId, list);
		//	System.out.println("the trans is "+ trans);
		}
		
		accountMap.put(accountId, account);
		System.out.println("Amount withdrawn in your acount successfully ");
		}
	}
	
	public void balanceEnquiry(int accountId) throws CustomException
	{
		if(accountMap== null)
		{
			System.out.println("the account Map is empty");
			return ;
		}
		
			AccountDet accountdet=accountMap.get(accountId);
			
			double bal=accountdet.getBalance();
			System.out.println("the cuurent balance in your accountId "+ accountId + "Account is "+ bal);
	}
	
	
	public void customerAccountDetails(int cusId) throws CustomException
	{
		if(listMap== null)
		{
			System.out.println("the account Map is empty");
			return ;
		}
		ArrayList<Integer> listInteger=listMap.get(cusId);
		AccountDet accountDetails=new AccountDet();
		for(int i=0;i<listInteger.size();i++)
		{
			accountDetails=accountMap.get(listInteger.get(i));
			System.out.println("the customer Account details are "+ cusId+ "accounts are"+accountDetails);
		}
		
		
	}
	public void allAccountsBalance(int cusId) throws Exception
	{
		if(accountMap== null)
		{
			System.out.println("the account Map is empty");
			return ;
		}
		double bal=0;
		ArrayList<Integer> list1=listMap.get(cusId);
		for(int i=0;i<list1.size();i++)
		{
		 AccountDet acc =accountMap.get(list1.get(i));
		 bal+=acc.getBalance();
		}
		System.out.println("The total amount in your all accounts is "+ bal);
		
		
	}
	
	public void openAccountInBank(CustomerDet customDet,AccountDet accountDet)  throws CustomException
	{
		if(accountMap== null || customMap == null)
		{
			System.out.println("the account Map or customMap is empty");
			return ;
		}
		int id=getCustomerId();
		customMap.put(id, customDet);
		accountDet.setCusId(id);
		accountMap.put(getAccountId(), accountDet);
		System.out.println("Account opened successfully ");
	}
	
	public CustomerDet loanAmount(int customerId,int accountId,String type,LoanPojo loan) throws Exception
	{
		String val=type;
		CustomerDet custom=customMap.get(customerId);
		if(val == "yes" && customMap.containsKey(customerId) || accountMap.containsKey(accountId))
		{
		  int n=loan.getLoanNumber();	
		 
		  switch(n)
			{
			case 1: loan.setConfirmation("Confirm");
			custom.setLoanApproval("confirm");
			break;
			case 2: loan.setConfirmation("Confirm");
			custom.setLoanApproval("confirm");
			break;
			case 3: loan.setConfirmation("Confirm");
			custom.setLoanApproval("confirm");
			break;
			case 4: loan.setConfirmation("Confirm");
			custom.setLoanApproval("confirm");
			break;
			case 5: loan.setConfirmation("Confirm");
			custom.setLoanApproval("confirm");
			break;
			}
		  loan.setLoanNumber(n);
	      
     
		    
			  System.out.println("your  loan has been sent to bank for approval");
		  }
		return custom;
		
	}
	
	public   ArrayList<TransactionHistoryPojo>  getTransactionDetails(int customerId) throws Exception
	{
		ArrayList<TransactionHistoryPojo>  list=null;
	
		if(trans.containsKey(customerId))
		{
		  list=trans.get(customerId);
		  System.out.println(list);
		}
		return list;
	}
	
	
	public Map<Integer, AccountDet> adminHandleAllAccounts() throws Exception
	{
		if(accountMap==null)
		{
			System.out.println("the map is empty");
		   return accountMap;
		}
		return accountMap;
		
	}
	
	public AccountDet adminLoanHandle(int accountId,String val) throws Exception
	{
		if(accountMap==null)
		{
			System.out.println("The map is empty");
			return accountMap.get(accountId);
		}
		AccountDet account=accountMap.get(accountId);
		account.setLoanstatus(val);
		
		
		return account;
	}
	
	public AccountDet amountDepositForAdmin(int accountId,double bal) throws Exception
	{
		if(accountMap== null)
		{
			System.out.println("the account Map is empty");
			return accountMap.get(accountId);
		}
			LocalDate myObj = LocalDate.now(); 
			LocalTime myObj1 = LocalTime.now();
			TransactionHistoryPojo hist=new TransactionHistoryPojo();
			ArrayList<TransactionHistoryPojo> list=new ArrayList<>();
			if(accountMap.containsKey(accountId))
			{
			AccountDet account=accountMap.get(accountId);
			double bal1=0;
			if(account != null)
			{
			bal1=account.getBalance();
			bal1+=bal;
			account.setBalance(bal1);
			hist.setDeposit(bal);
			hist.setAccId(accountId);
			hist.setBal(bal1);
			hist.setDate(myObj);
			hist.setTime(myObj1);
			String val="money has been deposited"+ accountId+"at "+ myObj +" cuurent balance is "+ bal1;
			hist.setComments(val);
			list.add(hist);
			}
			trans.put(account.getCusId(),list);
			accountMap.put(accountId, account);
			
			System.out.println("Amount Deposited in this account Successfully by admin "); }
			return accountMap.get(accountId);
	}
	
	public AccountDet amountWithdrawnbyAdmin(int accountId,double bal) throws Exception
	{
		
		if(accountMap== null)
		{
			System.out.println("the account Map is empty");
			return accountMap.get(accountId);
		}
		    LocalDate myObj = LocalDate.now(); 
		    LocalTime myObj1 = LocalTime.now();
			TransactionHistoryPojo hist=new TransactionHistoryPojo();
			ArrayList<TransactionHistoryPojo> list=new ArrayList<>();
			if(accountMap.containsKey(accountId))
			{
			AccountDet account=accountMap.get(accountId);
			double balance=account.getBalance();
			
			if(balance != 0 && balance > initialAmount && bal > initialAmount )
			{
				balance -=bal;
				hist.setBal(balance);
				hist.setWithdrawn(bal);
				hist.setAccId(accountId);
				hist.setCusId(account.getCusId());
				hist.setDate(myObj);
				hist.setTime(myObj1);
				String val="your money has been withdrawn "+ accountId + " at "+ myObj +  " currentBalance is "+balance;
				hist.setComments(val);
				list.add(hist);
				
				account.setBalance(balance);
				trans.put(account.getCusId(), list);
			}
			
			accountMap.put(accountId, account);
			System.out.println("Amount withdrawn in this account  successfully by admin ");
			}
		
		return accountMap.get(accountId);
	}
	
	
	
	public Map<Integer,ArrayList<TransactionHistoryPojo>> adminTransactionHistory() throws Exception
	{
		if(trans == null)
		{
			System.out.println("the trans Map is empty");
			return trans;
		}
		return trans;
	}
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

