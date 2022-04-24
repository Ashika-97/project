package ParkingPojoClass;

public class VehiclePojo {
    

	private String vehicleNumber;
	private boolean car;
	private boolean bike;
	private boolean minivan;
	private boolean truck;
	private boolean electricalCar;
	private float timeLimit;
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
	public boolean isCar() {
		return car;
	}
	public void setCar(boolean car) {
		this.car = car;
	}
	public boolean isBike() {
		return bike;
	}
	public void setBike(boolean bike) {
		this.bike = bike;
	}
	public boolean isMinivan() {
		return minivan;
	}
	public void setMinivan(boolean minivan) {
		this.minivan = minivan;
	}
	public boolean isTruck() {
		return truck;
	}
	public void setTruck(boolean truck) {
		this.truck = truck;
	}
	public boolean isElectricalCar() {
		return electricalCar;
	}
	public void setElectricalCar(boolean electricalCar) {
		this.electricalCar = electricalCar;
	}
	public float getTimeLimit() {
		return timeLimit;
	}
	public void setTimeLimit(float f) {
		this.timeLimit = f;
	}
	public int getAvailableSpace() {
		return availableSpace;
	}
	public void setAvailableSpace(int availableSpace) {
		this.availableSpace = availableSpace;
	}
	public String getEntryexit() {
		return entryexit;
	}
	public void setEntryexit(String entryexit) {
		this.entryexit = entryexit;
	}
	public double getAmountpay() {
		return amountpay;
	}
	public void setAmountpay(double amountpay) {
		this.amountpay = amountpay;
	}
	public double getChargeCarPayment() {
		return chargeCarPayment;
	}
	public void setChargeCarPayment(double chargeCarPayment) {
		this.chargeCarPayment = chargeCarPayment;
	}
	@Override
	public String toString() {
		return "vehicleNumber=" + vehicleNumber + ", car=" + car + ", bike=" + bike + ", minivan="
				+ minivan + ", truck=" + truck + ", electricalCar=" + electricalCar + ", timeLimit=" + timeLimit
				+ ", availableSpace=" + availableSpace + ", entryexit=" + entryexit + ", amountpay=" + amountpay
				+ ", chargeCarPayment=" + chargeCarPayment + "";
	}

    

	
}
