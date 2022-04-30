package bankFile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


public class LogicBank {
   
	BankCacheFile cache=new BankCacheFile();
	Map<Integer,CustomerPojo>  custom=new HashMap<>();
	Map<Integer,Map<Integer, AccountPojo>> finalMap=new HashMap<>();
	BankFileLayer layer=new fileSerialize();
	
	 
	public LogicBank() 
		{
		
	  cache=layer.readObjectFile();
	  finalMap= cache.accountInfoMap;
	  custom=cache.map;
		
		}
	public void writeFile(Map<Integer,CustomerPojo> map,Map<Integer,Map<Integer,AccountPojo>> account)
	{
		layer.writeObjectToFile(custom,finalMap);
	}
	
	
    private  int id=1000;
    int initialAmount=1000;
    boolean status;
	public int getAccId()
	{
		return ++id;
	}
	 
	private int customId=1;
	 
	 public int getCustomId()
		{
			return ++customId;
			
		}
	
	public void addCustomerDetails(CustomerPojo customHash)
	{   
		
		custom.put(getCustomId(), customHash);
		
	}
	
    public CustomerPojo getCustomerDetails(int customerId)
    {
		return custom.get(customerId);
    }
	
    public void cacheAddCustomer(CustomerPojo custom1) throws Exception
    {
    	cache.putAddCustomer(custom1);
    }
    
    public void cacheAddAccount(AccountPojo account) throws Exception
    {
    	cache.insertAccountDetails(account);
    }
    
    public CustomerPojo getCacheCustomer(int id) throws Exception
    {
    	return cache.selectAllCustomers(id);
    }
    
    public Map<Integer,AccountPojo> getCacheAccount(int id) throws Exception
    {
    	return cache.allAccountDetails(id);
    }
    
    
	public void addAccount(int customerId,AccountPojo account) throws Exception {
		
		
		Map<Integer, AccountPojo> record=finalMap.get(customerId);
			
		if(record==null)
		{
			record=new HashMap<Integer,AccountPojo>();
			finalMap.put(customerId,record);	
		}
		record.put(getAccId(), account);
		writeFile(custom,finalMap);
	
	}
	
	public  Map<Integer, AccountPojo> getAccount(int customerId) {
	
		return finalMap.get(customerId);
	}
	
	
	public  AccountPojo getAccIdOnly(int cusId,int accId) throws Exception
	{      
		 
	    
		  
	      Map<Integer,AccountPojo> account= finalMap.get(cusId);
		  if(account!=null)
		   {
		      return  account.get(accId);
		  }
		
		
		return null;
	
	}
	
	public void depositMoney(int accId,long number,AccountPojo account) throws Exception
	{   
	 
		Map<Integer,AccountPojo> input=finalMap.get(accId);
		try {	
		  if(input!=null)
		    {
		
			AccountPojo account_1=input.get(accId);
			if(account_1!=null) {
			System.out.println("the account pojo balance is"+ account_1);
		    long balance=account_1.getBalance();
		    
			balance=balance+number;
			account_1.setBalance(balance);
			}
		    input.put(getAccId(), account);
		    }}
		  catch(Exception e)
		  {
			  e.printStackTrace();
			  System.out.println("exception in deposit money "+ e.getMessage());
		  
		  }
		
		finalMap.put(accId, input);
	}
	
	public Map<Integer, AccountPojo> getDepositMoney(int accId)
	{
		return finalMap.get(accId);
	}
	

	public void amountWithdrawal(int accId,long number,AccountPojo account) throws Exception
	{  
		
		Map<Integer,AccountPojo> input=finalMap.get(accId);
		if(input!=null) {
			AccountPojo info=input.get(accId);
			if(info!=null) {
		    long amount=info.getBalance();
		    amount=amount-initialAmount;
		  if(amount>number)
		   {
		  amount-=number;
		  info.setBalance(amount);
		  input.put(getAccId(), account);
		}
		
		finalMap.put(accId,input);
		}
	}
		}
	
	 public AccountPojo getAccountInfo(Map<Integer,AccountPojo> mapInput,int accountId)
	    {  
		 return mapInput.get(accountId);
	    }
	 
	public Map<Integer, AccountPojo> getWithdrawal(int accId1)
	{
		return finalMap.get(accId1);
	}
	 
	/*
	 * public void changeStatusCustomer(int customerId,int status) throws Exception
	 * { CustomerPojo customer=getCustomerDetails(customerId); try {
	 * if(customer!=null) {
	 * 
	 * if(status==1) { customer.setStatus(true); } else { customer.setStatus(false);
	 * } }} catch(Exception e) { e.printStackTrace();
	 * System.out.println("exception in change status for customer"); }
	 * 
	 * 
	 * }
	 */
    
    public void changeStatusAccount(int customerId,int accountId,int status) throws Exception
    {      
    	 
    	   Map<Integer,AccountPojo> accountInfo=getAccount(customerId);
    	  
    
    	   AccountPojo account =getAccountInfo(accountInfo, accountId);
    	   try {
    	   if(account!=null)
    	   {	   
    	   
    	       if(status==1)
    	       {
    	          account.setStatus(true);
    	       }
    	       else 
    	       {
    		       account.setStatus(false);
    	       }
    	   }}
    	   catch(Exception e)
    	   {
    		   e.printStackTrace();
    		   System.out.println("the exception in account status changing");
    	   }
    }
    
	
	  public List<AccountPojo> getActiveAccountList(int id)
      {
   	   Map<Integer,AccountPojo> account=getAccount(id);
   	   
   	   if(account!=null)
   	   {
   	         List<AccountPojo> listAccount=new ArrayList<>();
   	   
   	         for(Entry<Integer, AccountPojo> entry:account.entrySet())
   	         {
   	        	AccountPojo record=entry.getValue();
   		          
   		          if(record.getStatus())
   		          {
   			          listAccount.add(record);
   		           }
   	         }
		        return listAccount;   
   	   }
   	   
   	      return null;
      }
     	

     public void cacheMap(Map<Integer,CustomerPojo> customerMap,Map<Integer,Map<Integer,AccountPojo>> accountMap)
     {
        cache.getMap(customerMap,accountMap);
     }


}
