package parkingCacheLogic;

import java.util.*;

import ParkingPojoClass.*;

public class ParkingCache {
   
	//tokenNumber ,CustomerPojo in customMap
	Map<Integer,CustomerPojo> customMap=new HashMap<>();
	Map<String,VehiclePojo> vehicleMap=new HashMap<>(); //VehicleNumber,VehiclePojo in vehicle Map
	Map<Integer,Integer>  spaceMap=new HashMap<>(); //availablefloorspace,slotsNumber in spaceMap
	ParkingSpacePojo space=new ParkingSpacePojo();
	private int maxNumberOfFloors = 10;
	private int floor1=5;
	
	

	
	String[] amount=new String[3];
	int token=100,count=1;
	
    public int autoGenerateTokenNumber()
    {
    	token=token+1;
    	return token;
    }
   
  
    public int getFloorVehicleSpace(String vehicleType)
    {
		   floor1-=1;
		   return floor1;
    }
    
  	
	public String checkAvailableSpace() throws Exception
	{
		
		int slotSpace=floor1;
		space.setavailablespaceInFloor(slotSpace);
		if(slotSpace >= 1)
		{
			return "we have Available space";
		}
		
		if(floor1 == 0 && count > maxNumberOfFloors)
		{
			
			count++;
			floor1=5;
			spaceMap.put(count,floor1);
			return  "Go to floor" +count+"";
		}
		return "Sorry parking slots are full";
	}
	
	public int customerEntry(CustomerPojo customer,double amountCar) throws Exception
	{
		for(int i=0;i < amount.length;i+=2)
	     {
	    	 amount[0]="4.0";
	    	 amount[1]="7.5";
	    	 amount[2]="9.5";
	     }
		int tokenGen=0;
		VehiclePojo vehicle=new VehiclePojo();
	
		double amount1=customer.getAmount();
		String temp=""+amount1;
		vehicle.setAmountpay(amount1);
		if(amount1 == 0 || amount[0].equals(temp) || amount[1].equals(temp) || amount[2].equals(temp) )
		{
			tokenGen=autoGenerateTokenNumber();
			
			vehicle.setVehicleNumber(customer.getVehicleNumber());
			
			customer.setTokenNumber(tokenGen);
			vehicle.setTimeLimit(customer.getTime());
			
			String vehicleType=customer.getVehicleType();
			 String carCheck=vehicleType(customer,vehicle);
			 if(carCheck.equals("ElectricalCar"))
			 {
			   if(amountCar == 9)
				 vehicle.setChargeCarPayment(amountCar);
			   else
				   System.out.println("sorry money is less than we offer ");
			 }
	        int val1=getFloorVehicleSpace(vehicleType);
	        
	        space.setavailablespaceInFloor(val1);
	        
	        vehicle.setAvailableSpace(val1);
	        
	        vehicle.setEntryexit("entry");
	        
	        customer.setPaymentAtEntry(vehicleType);
	        
			customMap.put(token, customer);
			
			vehicleMap.put(customer.getVehicleNumber(), vehicle);
			
			System.out.println("the customer Map is "+ customMap);
			System.out.println("the vehicle map is "+vehicleMap);
		}
		return tokenGen;
	}
	
	public String vehicleType(CustomerPojo custom,VehiclePojo vehicle) throws Exception
	{
		String value=custom.getVehicleType();
	
		vehicle.setVehicleNumber(custom.getVehicleNumber());
		switch(value)
		{
		case "car":vehicle.setCar(true);
		          
		break;
		case "bike":vehicle.setBike(true);
		break;
		
		case "truck":vehicle.setTruck(true);
		break;
		
		case "minivan":vehicle.setMinivan(true);
		break;
		
		case "electricalCars":vehicle.setElectricalCar(true);
		break;
		}
		return value;
	}
	
	public CustomerPojo getCustomerEntry(int token) throws Exception
	{
		CustomerPojo custom=null;
		if(customMap != null)
		{
			 custom=customMap.get(token);
		}
		return custom;
	}
	

	public String  checkAmountPayabelOrNot(String vehicleNumber,int token , String val) throws Exception
    {
		CustomerPojo custom;
		VehiclePojo vehicle1=vehicleMap.get(vehicleNumber);
		
    	if(customMap == null)
    	{
    		return "details are not entered";
    	}
    	
    	custom=customMap.get(token);
    	if(token == custom.getTokenNumber())
    	{
    	float time=custom.getTime();
    	String timeValue=""+timeCalculate(time);
    	String amount=custom.getPaymentAtEntry();
    	if(amount.equals("No"))
    	{
    		switch(timeValue)
    		{
    		case "1": custom.setAmount(4);
    		          vehicle1.setAmountpay(4);
    		   break;
    		case "2":custom.setAmount(7.5);
    		         vehicle1.setAmountpay(7.5);
    		  break;
    		case "3":custom.setAmount(9.5);
    		         vehicle1.setAmountpay(9.5);
    		
    		 break;
    		 
    		default:
    			custom.setAmount(9.5);
    		}
    		return "vehicle Exits sucessfully";
    	
    	}}
    	return "vehicle Exits sucessfully";
    	
    }
	
	public int timeCalculate(double n) throws Exception
	{
		if(n > 1 && n < 2)
			return 2;
		if(n>2 && n< 3)
			return 3;
	    if(n > 3)
	    	return 4;
	    
	    
	    return (int)n;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
