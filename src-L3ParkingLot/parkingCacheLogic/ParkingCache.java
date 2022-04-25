package parkingCacheLogic;

import java.util.*;

import ParkingPojoClass.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class ParkingCache {
   
	//tokenNumber ,CustomerPojo in customMap
	Map<Integer,CustomerPojo> customMap=new HashMap<>();
	Map<String,VehiclePojo> vehicleMap=new HashMap<>(); //VehicleNumber,VehiclePojo in vehicle Map
	Map<Integer,Integer>  spaceMap=new HashMap<>(); //availablefloorumber,space in respective floor in spaceMap
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
		
		if(slotSpace <=0 || floor1 == 0 && count <= maxNumberOfFloors)
		{
			
			count++;
			floor1=5;
			spaceMap.put(count,floor1);
			return  "Go to floor " + count +" there,We have a space there ";
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
			
//			System.out.println("the customer Map is "+ customMap);
//			System.out.println("the vehicle map is "+vehicleMap);
		}
		return tokenGen;
	}
	
	
	public String automaticTime() throws Exception
	{
		  LocalTime myObj = LocalTime.now();
		  DateTimeFormatter timeFormat=DateTimeFormatter.ofPattern("HH:mm:ss");
		  String val=timeFormat.format(myObj);
		  System.out.println("the val is "+ val);
		  String var=val.replace(":", "");
		  System.out.println("the var is "+ var);
		  return var;
	}
	////check this method 
	public void amountandTimechecking(CustomerPojo customer) throws Exception
	{
		float time=0;
		
	
			if(time == 1 && time < 1 )
			{
				System.out.println("Pay $4");
			}
			else if(time == 2 && time <=2 )
			{
				System.out.println("pay $4+$3.5 totally $7.5 ");
			}
		
			else {
				System.out.println("pay $4+$3.5+$2 totally $9.5");
			}
		
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
	

	public void  checkAmountPayabelOrNotToExit(String vehicleNumber,int token , String val) throws Exception
    {
		CustomerPojo custom;
		VehiclePojo vehicle1=vehicleMap.get(vehicleNumber);
		
    	if(customMap == null)
    	{
    		return ;
    	}
    	
    	custom=customMap.get(token);
    	if(token == custom.getTokenNumber())
    	{
    	int time=custom.getTime();
    	int exitTime=Integer.parseInt(automaticTime());
    	int timeValue=timeCalculate(time,exitTime);
    	vehicle1.setTimeLimit(timeValue);
    	vehicle1.setVehicleNumber(vehicleNumber);
    	if(timeValue < 10000)
    	{
    		System.out.println("kindly pay $4");
    		
    	}
    	else if(timeValue > 10000 && timeValue < 30000) 
    	{
    		System.out.println(" Kindly pay $7.5");
    	}
    	else {
    		System.out.println("Pay $9.5");
    	}
    	}
    		
    }
	public String paymentCheckExits(float amount) throws Exception
	{
		if(amount == 4 || amount == 7.5 || amount == 9.5)
		{
			return "Vehicle Exits Successfully";
		}
		return "vehicle not exits";
	}
	
	public int timeCalculate(int enterTime,int exitTime) throws Exception
	{
		String var=""+enterTime;
		String var1=""+exitTime;
		var =var.replace(":", "");
		var1=var1.replace(":","");
		int calculate=Integer.parseInt(var1) - Integer.parseInt(var);
		return calculate;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
