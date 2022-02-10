package accountInfo;

public class AccountInfo {
  
    
   private int cutomerId;
   private long balance;
   private String branch;
   private boolean status=true;
   
public int getCutomerId() {
	return cutomerId;
}
public void setCutomerId(int cutomerId) {
	this.cutomerId = cutomerId;
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


@Override
public String toString() {
	return "AccountInfo [cutomerId=" + cutomerId + ", balance=" + balance + ", branch=" + branch + ", status=" + status
			+ "]";
}
   
   
    



















}
  
   


