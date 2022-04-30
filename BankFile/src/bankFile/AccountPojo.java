package bankFile;

import java.util.Map;

public class AccountPojo implements java.io.Serializable{
      
	  
	//private static final long serialVersionUID = 1L;
	
	   private int customerId;
	   private long balance;
	   private String branch;
	   private boolean status=true;
	   private int accountId;
	   
	public int getCustomerId() {
		return customerId;
	}
	public void setCutomerId(int cutomerId) {
		this.customerId = cutomerId;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean statusId) {
		this.status = statusId;
	}
    

	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	@Override
	public String toString() {
		return "AccountPojo [customerId=" + customerId + ", balance=" + balance + ", branch=" + branch + ", status="
				+ status + "]";
	}
	
	
	
	   
}
