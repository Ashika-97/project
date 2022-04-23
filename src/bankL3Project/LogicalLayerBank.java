package l3Project;

import java.util.ArrayList;
import java.util.Map;

import pojoClass.*;

public class LogicalLayerBank {

	static BankCache cache=new  BankCache();
	
	  
	public String loginPasswords(int userId,String pass) throws Exception  
	{
		return  cache.loginMethod(userId, pass);
	}
	  
	 
	public void addCustomerDetails(CustomerDet custom) throws Exception
	{
		cache.addCustomerDetails(custom);
	}
	
	public CustomerDet getCustomerDetails(int cusId) throws Exception
	{
		return cache.getCustomerDetails(cusId);
	}
	
	public void addAccountDetails(AccountDet acc) throws Exception
	{
		cache.addAccountDetails(acc);
	}
	public AccountDet getAccountDetails(int accId) throws CustomException
	{
		return cache.getAccountDetails(accId);
	}
	public void openAccountsCustomer(CustomerDet customDet,AccountDet accountDet) throws CustomException
	{
		cache.openAccountInBank(customDet,accountDet);
	}
	public void allAccountsSumMoney(int cusId) throws Exception
	{
		cache.allAccountsBalance(cusId);
	}
	
	
	
	public void transferMoney(int accId,double balance,int accId1,int cusId,int cusId1) throws Exception
	{
		cache.withdrawlAmount(accId, balance,cusId);
		cache.amountDeposit(accId1, balance,cusId1);
	}
	public void balanceEnquiryDetails(int accId) throws CustomException
	{
		cache.balanceEnquiry(accId);
	}
	public void getCustomerAllAccounts(int cusId) throws CustomException
	{
		cache.customerAccountDetails(cusId);
	}
	
	public CustomerDet loanForCustomers(int cusid,int accId,String type,LoanPojo loan) throws Exception
	{
		return cache.loanAmount(cusid, accId, type, loan);
	}
	
	public   ArrayList<TransactionHistoryPojo> transactionListDetails(int customerId) throws Exception
	{
		return cache.getTransactionDetails(customerId);
	}
	
	
	public Map<Integer,AccountDet> adminHandlesAllaccount() throws Exception
	{
		return cache.adminHandleAllAccounts();
	}
	
    public AccountDet adminLoanApprooved(int accId,String val) throws Exception
    {
    	return cache.adminLoanHandle(accId,val);
    }
	
	public AccountDet adminTransferDeposit(int accountId,double balance) throws Exception
	{
		return cache.amountDepositForAdmin(accountId, balance);
				
	}
	
	public AccountDet adminTransferWithdrawn(int accountId,double balance) throws Exception
	{
		return cache.amountWithdrawnbyAdmin(accountId, balance);
	}
	
	public Map<Integer,ArrayList<TransactionHistoryPojo>> adminHistoryCheck() throws Exception
	{
		return cache.adminTransactionHistory();
	}
	
	public Map<Integer,CustomerDet> allCustomerDetails() throws Exception
	{
		return cache.allCustomerDetails();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	









































}









