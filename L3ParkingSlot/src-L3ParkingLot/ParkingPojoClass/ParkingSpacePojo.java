package ParkingPojoClass;

public class ParkingSpacePojo {
  
	private String vehicleNumber;
	private int numberOfFloos;
	private int timeLimit;
	private int availablespaceInFloor;
	private boolean vehicleentryorexit;
	
	
	
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public int getNumberOfFloos() {
		return numberOfFloos;
	}
	public void setNumberOfFloos(int numberOfFloos) {
		this.numberOfFloos = numberOfFloos;
	}
	public int getTimeLimit() {
		return timeLimit;
	}
	public void setTimeLimit(int timeLimit) {
		this.timeLimit = timeLimit;
	}
	public int getavailablespaceInFloor() {
		return availablespaceInFloor;
	}
	public void setavailablespaceInFloor(int availableFloor) {
		this.availablespaceInFloor = availableFloor;
	}
	
	
	public boolean isVehicleentryorexit() {
		return vehicleentryorexit;
	}
	public void setVehicleentryorexit(boolean vehicleentryorexit) {
		this.vehicleentryorexit = vehicleentryorexit;
	}
	@Override
	public String toString() {
		return "vehicleNumber=" + vehicleNumber + ", numberOfFloos=" + numberOfFloos + ", timeLimit="
				+ timeLimit + ", availablespaceInFloor=" + availablespaceInFloor + ", vehicleentryorexit=" + vehicleentryorexit + "";
	}
	
    
	
}
