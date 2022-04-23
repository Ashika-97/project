package pojoClass;

public class LoanPojo {

	private int cusId;
	private int accId;
	private String status;
	private String Confirmation="not confirm";
	private double balance;
	private boolean historyOfTransaction;
	private int loanNumber;
	
	public int getCusId() {
		return cusId;
	}
	public void setCusId(int cusId) {
		this.cusId = cusId;
	}
	public int getAccId() {
		return accId;
	}
	public void setAccId(int accId) {
		this.accId = accId;
	}
	public String isStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getConfirmation() {
		return Confirmation;
	}
	public void setConfirmation(String confirmation) {
		Confirmation = confirmation;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public boolean isHistoryOfTransaction() {
		return historyOfTransaction;
	}
	public void setHistoryOfTransaction(boolean historyOfTransaction) {
		this.historyOfTransaction = historyOfTransaction;
	}
	
	public int getLoanNumber() {
		return loanNumber;
	}
	public void setLoanNumber(int loanNumber) {
		this.loanNumber = loanNumber;
	}
	
	

	@Override
	public String toString() {
		return "cusId=" + cusId + ", accId=" + accId + ", status=" + status + ", Confirmation=" + Confirmation
				+ ", balance=" + balance + ", historyOfTransaction=" + historyOfTransaction + ", loanNumber="
				+ loanNumber + "]";
	}
	
	
	
	
	
	
}
