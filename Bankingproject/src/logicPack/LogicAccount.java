package logicPack;
import java.util.List;
import java.util.Map;
import accountInfo.AccountInfo;
import accountInfo.BankConnection;
import accountInfo.CustomerInformation;

public class LogicAccount {
	
	BankConnection obj=new BankConnection();

		
public  void detailsOfCustomer(CustomerInformation custom)
{
	
	obj.addCustomerDetails(custom);
}

public CustomerInformation getdetailsOfCustomer(int customerId)
{
	
	return obj.getCustomerDetails(customerId);
	
}

public void detailsOfAccount(int id,AccountInfo account)
{
	obj.addAccount( id,account);
		
}

public  Map<Integer, AccountInfo>  getDetailsOfAccount(int customerId)
{
	 Map<Integer, AccountInfo> getMap=obj.getAccount(customerId);
	 
	 return getMap;
}
public AccountInfo getAccList(int cusId,int accId)
{
	return obj.getAccIdOnly(cusId,accId);
}

public void putAmount(int id,long Number,AccountInfo account)
{
	obj.depositMoney(id, Number, account);
}
public Map<Integer,AccountInfo> getDeposit(int id)
{
	return obj.getDepositMoney(id);
}

public void takeAmount(int id,long number,AccountInfo account)
{
	obj.amountWithdrawal(id, number, account);
}
public Map<Integer, AccountInfo> getTakeAmount(int id)
{
	return obj.getWithdrawal(id);
}

public List<AccountInfo> getActive(int id)
{
	return obj.getActiveAccountList(id);
}

public void getChangesOfStatusCustomer(int id,int status)
{
	obj.changeStatusCustomer(id, status);
}

public void getChangesOfStatusAccount(int id,int accId,int status)
{
	obj.changeStatusAccount(id, id, status);
}


}
	
	
	
	
	
	
	
	
	












	
	
	
	
	
	
	
	
	

/*public void NullCheck(String myInput) throws Exception
{
if(myInput==null||myInput.isEmpty() )
{
	System.out.println("the String details cant be empty");
}
}*/