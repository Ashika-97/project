package BankDbLayer;

import java.math.BigInteger;

public class CustomerInformation {

		 
	    private String customerName;
	    private long mobileNumber;
		private String address;
	   	private int customerId;
		public String getCustomerName() {
			return customerName;
		}
		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}
		public long getMobileNumber() {
			return mobileNumber;
		}
		public void setMobileNumber(long mobNum) {
			this.mobileNumber = mobNum;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public int getCustomerId() {
			return customerId;
		}
		public void setCustomerId(int customerId) {
			this.customerId = customerId;
		}
		@Override
		public String toString() {
			return "CustomerId [customerName=" + customerName + ", mobileNumber=" + mobileNumber + ", address="
					+ address +  "]";
		}
	   	  
		


	
}
