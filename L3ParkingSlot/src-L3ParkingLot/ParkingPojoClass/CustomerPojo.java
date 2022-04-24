package ParkingPojoClass;

public class CustomerPojo {

	private String vehicleNumber;
	private String paymentAtEntry;
	private int  tokenNumber;
	private String vehicleType;
	private double amount;
	private String paymentType;
	private float time;
	
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getPaymentAtEntry() {
		return paymentAtEntry;
	}
	public void setPaymentAtEntry(String paymentAtEntry) {
		this.paymentAtEntry = paymentAtEntry;
	}
	public int getTokenNumber() {
		return tokenNumber;
	}
	public void setTokenNumber(int tokenNumber) {
		this.tokenNumber = tokenNumber;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	
	public float getTime() {
		return time;
	}
	public void setTime(float time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "vehicleNumber=" + vehicleNumber + ", paymentAtEntry=" + paymentAtEntry + ", tokenNumber="
				+ tokenNumber + ", vehicleType=" + vehicleType + ", amount=" + amount + ", paymentType=" + paymentType
				+ ", time=" + time + "";
	}
	
	
	
	
	
	
	
	
	
}
