package bankFile;

import java.util.Map;

public class CustomerPojo implements java.io.Serializable {
     
	
	    //private static final long serialVersionUID = 1L;
		 
	    private String AccountHolderName;
	    private long MobileNumber;
	    private String address;
	    private boolean status=true;
		private int customerId;
		 
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
		
			
		public int getCustomerId() {
			return customerId;
		}
	
		public void setCustomerId(int customerId) {
			this.customerId = customerId;
		}
	
		@Override
		public String toString() {
			return "CustomerPojo [AccountHolderName=" + AccountHolderName + ", MobileNumber=" + MobileNumber + ", address="
					+ address + ", status=" + status +"]";
		}

	

	
}
