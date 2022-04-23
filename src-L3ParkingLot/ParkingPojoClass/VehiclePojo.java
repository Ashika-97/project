package ParkingPojoClass;

public class VehiclePojo {
    

	private String vehicleNumber;
	private String car;
	private String bike;
	private String minivan;
	private String truck;
	private String electricalCar;
	private int timeLimit;
	private int availableSpace;
	private String entryexit;
	private double amountpay;
	private double chargeCarPayment;

	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
    
	public double getChargeCarPayment() {
		return chargeCarPayment;
	}
	public void setChargeCarPayment(double chargeCarPayment) {
		this.chargeCarPayment = chargeCarPayment;
	}
	public String getCar() {
		return car;
	}
	public void setCar(String car) {
		this.car = car;
	}
	public String getBike() {
		return bike;
	}
	public void setBike(String bike) {
		this.bike = bike;
	}
	public String getMinivan() {
		return minivan;
	}
	public void setMinivan(String minivan) {
		this.minivan = minivan;
	}
	public String getTruck() {
		return truck;
	}
	public void setTruck(String truck) {
		this.truck = truck;
	}
	public String getElectricalVehicle() {
		return electricalCar;
	}
	public void setElectricalVehicle(String electricalCar) {
		this.electricalCar = electricalCar;
	}
	public int getTimeLimit() {
		return timeLimit;
	}
	public void setTimeLimit(int timeLimit) {
		this.timeLimit = timeLimit;
	}
	public int getAvailableSpace() {
		return availableSpace;
	}
	public void setAvailableSpace(int availableSpace) {
		this.availableSpace = availableSpace;
	}
	public String getentryexit() {
		return entryexit;
	}
	public void setentryexit(String entryPaymentexit) {
		this.entryexit = entryPaymentexit;
	}
	public double getAmountpay() {
		return amountpay;
	}
	public void setAmountpay(double d) {
		this.amountpay = d;
	}
	
	@Override
	public String toString() {
		return "vehicleNumber=" + vehicleNumber + ", car=" + car + ", bike=" + bike + ", minivan="
				+ minivan + ", truck=" + truck + ", electricalCar=" + electricalCar + ", timeLimit=" + timeLimit
				+ ", availableSpace=" + availableSpace + ", entryexit=" + entryexit + ", amountpay=" + amountpay
				+ ", chargeCarPayment=" + chargeCarPayment + "]";
	}
    
	

	
}
