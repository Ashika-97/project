package newBank;

public class CustomerInformation {
	
	  
		  private String AccountHolderName;
		 private long MobileNumber;
		 private String address;
		 private boolean status=true;
		
		public void setAccountHolderName(String accountHolderName) {
			AccountHolderName = accountHolderName;
		}
		
		public String getAccountHolderName() {
			return AccountHolderName;
		}
		
		public void setMobileNumber(long mobileNumber) {
			MobileNumber = mobileNumber;
		}
		public long getMobileNumber() {
			return MobileNumber;
		}
		
		public void setAddress(String address) {
			this.address = address;
		}
		public String getAddress() {
			return address;
		}
		public boolean getStatus() {
			return status;
		}
		public void setStatus(boolean status) {
			this.status = status;
		}
		@Override
		public String toString() {
			return "CustomerInformation [AccountHolderName=" + AccountHolderName + ", MobileNumber=" + MobileNumber
					+ ", address=" + address + ", status=" + status + "]";
		}
		 
		

		 
	}



