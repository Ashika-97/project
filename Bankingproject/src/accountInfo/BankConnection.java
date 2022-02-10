package accountInfo;
import java.util.*;
import java.util.Map.Entry;

public class BankConnection {

	Map<Integer,CustomerInformation>  custom=new HashMap<>();
	Map<Integer,Map<Integer, AccountInfo>> finalMap=new HashMap<>();
   
    private  int id=0;
    boolean status;
	public int getAutoIncreId()
	{
		return ++id;
	}
	 
	private int customId=0;
	 
	 public int getCustomId()
		{
			return ++customId;
			
		}
	 
	public void addCustomerDetails(CustomerInformation customHash)
	{   
		
		custom.put(getCustomId(), customHash);
		
	}
	
	
    public CustomerInformation getCustomerDetails(int customerId)
    {
		return custom.get(customerId);
    }
	
   
    
	public void addAccount(int customerId,AccountInfo account) {
		
		Map<Integer, AccountInfo> record= finalMap.get(customerId);
			
		if(record==null)
		{
			record=new HashMap<Integer,AccountInfo>();
			finalMap.put(customerId,record);	
		}
		record.put(getAutoIncreId(), account);	 
	
	}
	
	public  Map<Integer, AccountInfo> getAccount(int customerId) {
	
		return finalMap.get(customerId);
	}
	
	
	public  AccountInfo getAccIdOnly(int cusId,int accId)
	{
		return finalMap.get(cusId).get(accId);
	}
	
	
	
	
	public void depositMoney(int accId,long number,AccountInfo account)
	{   
		
		Map<Integer,AccountInfo> input=finalMap.get(accId);
		try {
		long balance=input.get(accId).getBalance();
		if(input!=null)
		{
			balance+= number;
			input.get(accId).setBalance(balance);
		  input.put(getAutoIncreId(), account);
		}
		}
		catch(Exception e)
		{
			System.out.println("the accId not presents");
		}
		finalMap.put(accId, input);
	}
	
	public Map<Integer, AccountInfo> getDepositMoney(int accId)
	{
		return finalMap.get(accId);
	}
	

	public void amountWithdrawal(int accId,long number,AccountInfo account)
	{  
		Map<Integer,AccountInfo> input=finalMap.get(accId);
		try {
			
		long amount=input.get(accId).getBalance();
		if(amount>500)
		{
		  amount-=number;
		  input.get(accId).setBalance(amount);
		  input.put(getAutoIncreId(), account);
		}}
		catch(Exception e)
		{
			System.out.println("the accId not presents");
		}
		
		
		finalMap.put(accId,input);
		
	}
	
	 public AccountInfo getAccountInfo(Map<Integer,AccountInfo> mapInput,int accountId)
	    {  
	    	return mapInput.get(accountId);
	    }
	 
	public Map<Integer, AccountInfo> getWithdrawal(int accId1)
	{
		return finalMap.get(accId1);
	}
	 
    public void changeStatusCustomer(int customerId,int status)
    {
 	   CustomerInformation customer=getCustomerDetails(customerId);
 	   
 	   if(customer!=null)
 	   {	   
 	   
 	       if(status==1)
 	        {
 	             customer.setStatus(true);
 	        }
 	        else 
 	        {
 		          customer.setStatus(false);
 	        }
 	   }
 	   
    }
    
    public void changeStatusAccount(int customerId,int accountId,int status)
    {
    	   Map<Integer,AccountInfo> accountInfo=getAccount(customerId);
    	   
    	   AccountInfo account =getAccountInfo(accountInfo, accountId);
    	   
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
    	   }
    }
    
	
	  public List<AccountInfo> getActiveAccountList(int id)
      {
   	   Map<Integer,AccountInfo> account=getAccount(id);
   	   
   	   if(account!=null)
   	   {
   	         List<AccountInfo> listAccount=new ArrayList<>();
   	   
   	         for(Entry<Integer, AccountInfo> entry:account.entrySet())
   	         {
   		          AccountInfo record=entry.getValue();
   		          
   		          if(record.getStatus()==true)
   		          {
   			          listAccount.add(record);
   		           }
   	         }
		        return listAccount;   
   	   }
   	   
   	      return null;
      }
      
     
     
	
}



































































/*CustomerInformation info=new CustomerInformation();
info.setAccountHolderName(AccountHolderName);
info.setAddress(address);
info.setMobileNumber(MobileNumber);
info.setCustomerId(customerId);
custom.put(customerId,info);*/
//Map<Integer,CustomerInformation> custom1 = null;
		//custom1.put(customerId, info);
//Map<Integer,CustomerInformation>  hash=new HashMap();
		//hash.put(customerId, customhash);
//data.put(account.getAccountId(),account);

/*  if(finalmap.containsKey(customerId)) {
  System.out.println("the already presented account key are :"); Map<Integer,
  AccountInfo> data= finalmap.get(customerId);
  data.put(account.getAccountId(),account);
  System.out.println("the all accounts are " + data.values());
  
  } else if(!finalmap.containsKey(customerId)) 
  { Map<Integer, AccountInfo>
  accountinfo=new HashMap<>(); accountinfo.put(getautoIncreId(),account);
  finalmap.put(customerId, accountinfo);
  
 }*/

/*  public void changeStatusAccount(int customerId,int accountId,int status)
  {
  	   Map<Integer,AccountInfo> accountInfo=getAccount(customerId);
  	   
  	   CustomerInformation account =getCustomerDetails(customerId);
  	   
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
  	   }
  }*/