package BankDbLayer;

import java.sql.SQLException;
import java.util.*;

public class LogicalLayer {
	
   AccountDb account=new AccountDb();
   CustomerDb custom=new CustomerDb();
	
	public void getCustomerCreation()
	{
		custom.creationCustomer();
	}
	
	public void getInsertionCustomer(CustomerInformation custom1) throws Exception
	{
		custom.insertionCustomer(custom1);
	}
	
	public  Map<Integer,CustomerInformation> getSelectionCustomer() throws Exception
	{
		Map<Integer,CustomerInformation> map=custom.selectionCustomer();
		return map;
	}
	
	public void getUpdationCustomer(CustomerInformation custom1) throws Exception
	{
		custom.updateCustomer(custom1);
	}
	
	public void getCreationAccount()
	{
		account.creationAccount();
	}
	
	public void getInsertionAccount(AccountInformation acc1) throws Exception
	{
		account.insertionAccount(acc1);
	}
	
	public void getSelectionAccount() throws Exception
	{
		account.AllAccounts();
	}
	
	public  Map<Integer,AccountInformation>  getActiveAccount(boolean status) throws SQLException
	{
		return account.activeAccountList(status);
	}
	
	public void getDepositAmount(AccountInformation acc) throws Exception
	{
		account.amountdeposit(acc);
	}
	
	
	public void getWithdrawAmount(int acc,double balance)
	{
		
		try {
			account.amountWithdrawalAccount(acc,balance);
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}
	
	public void changeStatus(int accId,int cusId,int status)
	{

				account.changeStatusAccount(accId,cusId, status);
	}
	
	
	
	
	public void  getUpdate(AccountInformation acc)
	{   
		try {
		    account.updateAccount(acc);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
	public void getdelete(AccountInformation acc)
	{
		try {
			account.deletionAccount(acc);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	public void getDrop() throws Exception
	{
		account.dropAccountTable();
	}
	
	public void getCloseCall()
	{
		account.closeCall();
	}
	
	
	
	
	
	
	
	
}
