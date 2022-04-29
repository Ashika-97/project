package parkingcache;

import java.util.Map;

import parkingpojo.CustomException;
import parkingpojo.CustomerPojo;
import parkingpojo.TokenPojo;

public class ParkingLogicalLayer {
   
	       static ParkingCache imp=new ParkingCache();
	

	
	public String getAvailableSpaces(int floor,String vehicleType) throws CustomException
	{
		return imp.messageShown(floor, vehicleType);
	}
	
	public void floorGenerate(int floor,int space) throws CustomException
	{
		imp.floorSize(floor, space);
	}
	
	public String carTokenGenerate(TokenPojo custom,int floor,int amountCar,String checkChargeConfirm) throws CustomException
	{
		return imp.addCustomerEntry(custom, floor, amountCar, checkChargeConfirm);
	}
	
	public String customVehicleSpot(int ticket) throws CustomException
	{
		return imp.vehicleSpots(ticket);
	}
	public String vehicleExits(int ticket,long mobileNumber) throws CustomException
	{
		return  imp.vehicleExits(ticket,mobileNumber);
	}
	public String callExits(int ticket,double amount,long customerId,double returnMoney) throws CustomException
	{
		return imp.callExits(ticket,amount,customerId,returnMoney);
	}
	public String customerIdGenerate(CustomerPojo custom) throws CustomException
	{
		return imp.generateCustomerId(custom);
	}
	public String balanceAdded(long mobileNumber,double amount) throws CustomException
	{
		return imp.addAmountInCustomerAccount(mobileNumber, amount);
	}
	public Map<Long,CustomerPojo> allCustomerId() throws CustomException
	{
		return imp.customerDetails();
	}
	public int amountReturned(long mobileNumber) throws CustomException
	{
		return imp.amountReturnedInCache(mobileNumber);
	}
	
	public boolean statusMoney(long mobileNumber) throws CustomException
	{
		return imp.statusOfMoney(mobileNumber);
	}
	
	public String portalAmountAdded(long mobileNumber,String paymentType,double amount) throws CustomException
	{
		return imp.amountAddedInWallet(mobileNumber,paymentType,amount);
	}
	
	public String portalRegisteredCheck(long mobileNumber) throws CustomException
	{
		return imp.customerPortalChecking(mobileNumber);
	}
	
	public void checkFloorSize(int floor) throws CustomException
	{
		imp.checkFloor(floor);
	}
	
	public void checkFloorType(int floor,String type) throws CustomException
	{
		imp.checkFloorAndSpot(floor);
	}
	
	
	public void ticketCheck(int ticket) throws CustomException
	{
		imp.tokenCheck(ticket);
	}
	
	public void insideFloor(int floor) throws CustomException
	{
		imp.floorInside(floor);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
