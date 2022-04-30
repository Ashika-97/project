package bankFile;

import java.util.HashMap;
import java.util.Map;


public class BankCacheFile {
   
    public Map<Integer,CustomerPojo> map;
	
	public Map<Integer,Map<Integer,AccountPojo>> accountInfoMap;
	
	//Map<Integer,AccountPojo> account;
	
	
	
	public void  getMap(Map<Integer,CustomerPojo> customMap,Map<Integer,Map<Integer,AccountPojo>> account)
	{
		this.map=customMap;
		this.accountInfoMap=account;
	}
	
	
	public  void  putAddCustomer(CustomerPojo custom1) throws Exception
	{
	  map.put(custom1.getCustomerId(), custom1)	;
	  
	}
	
	public CustomerPojo selectAllCustomers(int id)
	{
	   CustomerPojo customer=map.get(id);
	   return customer;
	}
	
	public void insertAccountDetails(AccountPojo account)
	{  
		Map<Integer,AccountPojo> info=new HashMap<>();
		
		if(account!=null)
		{
			info.put(account.getAccountId(), account);
			accountInfoMap.put(account.getCustomerId(),info);
			
			
		}
				
	}
	
	public Map<Integer,AccountPojo> allAccountDetails(int id)
	{
		Map<Integer, AccountPojo> acc=accountInfoMap.get(id);
		return acc;	
		
	}
}
