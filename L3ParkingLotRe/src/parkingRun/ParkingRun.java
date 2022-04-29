package parkingRun;

import java.util.Scanner;

import parkingcache.ParkingLogicalLayer;
import parkingpojo.CustomException;
import parkingpojo.CustomerPojo;
import parkingpojo.TokenPojo;

public class ParkingRun {
         static ParkingRun input=new ParkingRun();
	     static ParkingLogicalLayer layer=new ParkingLogicalLayer();
	     static Scanner buffer=new Scanner(System.in);
	
	
	     public void includeDummyValues() 
	     {
	    	 CustomerPojo custom=new CustomerPojo();
	    	 custom.setAmount(15);
	    	 custom.setMobileNumber(123459);
	    	 custom.setPaymentType("cash");
	    	 custom.setVehicleNumber("Tn 9000");
	    	 custom.setVehicleType("car");
	    	 try {
				System.out.println(layer.customerIdGenerate(custom));
			} catch (CustomException e) {
				
				e.printStackTrace();
			}
	    	 
	    	 CustomerPojo custom1=new CustomerPojo();
	    	 custom1.setAmount(20);
	    	 custom1.setMobileNumber(712345);
	    	 custom1.setPaymentType("cash");
	    	 custom1.setVehicleNumber("Tn 7070");
	    	 custom1.setVehicleType("bike");
	    	 try {
				System.out.println(layer.customerIdGenerate(custom1));
			} catch (CustomException e) {
				
				e.printStackTrace();
			}
	    	 
	    	 CustomerPojo custom3=new CustomerPojo();
	    	 custom3.setAmount(15);
	    	 custom3.setMobileNumber(912345);
	    	 custom3.setPaymentType("cash");
	    	 custom3.setVehicleNumber("Tn 5090");
	    	 custom3.setVehicleType("truck");
	    	 try {
				System.out.println(layer.customerIdGenerate(custom3));
			} catch (CustomException e) {
				
				e.printStackTrace();
			}
	    	 
	    	 CustomerPojo custom4=new CustomerPojo();
	    	 custom4.setAmount(15);
	    	 custom4.setMobileNumber(012345);
	    	 custom4.setPaymentType("cash");
	    	 custom4.setVehicleNumber("Tn 1705");
	    	 custom4.setVehicleType("car");
	    	 try {
				System.out.println(layer.customerIdGenerate(custom4));
			} catch (CustomException e) {
			
				e.printStackTrace();
			}
	     }
	
	     public void nullCall(String val)
	     {
	    	 try {
	    		 nullCheck(val);
	    	 }
	    	 catch(CustomException exception)
	    	 {
	    		 System.out.println(" Space check,String cant be empty ");
	    	 }
	     }
	public void customerEntry() 
	{
		TokenPojo token=new TokenPojo();
		System.out.println("Enter the floor number ");
		int floor=buffer.nextInt();
		try {
			layer.insideFloor(floor);
		} catch (CustomException e1) {
		
			System.out.println(e1.getMessage());
			return;
		}
		buffer.nextLine();
		System.out.println("Enter the vehicle number ");
		String number=buffer.nextLine();
		trimSpace(number);
	
		token.setVehicleNumber(number);
		System.out.println("Enter the vehicle type ");
		String vehicleType=buffer.nextLine();
		vehicleType=trimSpace(vehicleType);
		token.setVehicleType(vehicleType);
		try {
			
			layer.checkFloorType(floor, vehicleType);
		} catch (CustomException e) {
			System.out.println(e.getMessage());
			
		}
		nullCall(number);
		nullCall(vehicleType);
		String checkelectric="";
		int electric=0;
		
	   	if(vehicleType.equals("electriccar"))
    	{
    		System.out.println("If you want to charge your car put yes/pay/no and the charge is about to pay $9 ");
    		vehicleType=buffer.nextLine();
    		if(vehicleType.equals("pay") || vehicleType.equals("yes"))
    		{
    		 System.out.println("If you want to charge you car pay money about $9 ");
    		 electric=buffer.nextInt();
    		 if(electric < 9)
    	     {
    			 checkelectric="yes";
    	    	 System.out.println("you are giving less than $9  give the correct amount ");
    	    	
    	     }
    		 else {
    			 checkelectric="no";
    		 }
    	     }        		       	     
    	}
	   	System.out.println("Do you want to pay for your token  at entry ");
		String paymentSugg=buffer.nextLine();
		trimSpace(paymentSugg);
		nullCall(paymentSugg);
		token.setPaymentAtEntry(paymentSugg);
		
		if(paymentSugg.equals("yes"))
		{
		System.out.println("Cash / card  to pay the amount ");
		String paymentType=buffer.nextLine();
			//nullCall(paymentType);
		token.setPaymentType(paymentType);
		System.out.println("Pay $4 initially for 1 hour if time exceeded further we collect extra amount ");
		double amount=buffer.nextDouble();
		token.setAmount(amount);
		}
		System.out.println("Enter Your mobile number ");
		long mobileNumber=buffer.nextLong();
		buffer.nextLine();
	
	
	
		try {
			System.out.println(layer.carTokenGenerate(token, floor, electric, checkelectric));
			String val=layer.portalRegisteredCheck(mobileNumber);
			if(val.equals("yes"))
			{
				token.setMobileNumber(mobileNumber);
			}
			else if(mobileNumber!=0)
			{
				input.createFromEntry(number, vehicleType,mobileNumber);
			}
		
		}
		catch(CustomException exception)
		{
			System.out.println(" "+exception.getMessage());
		}
		
	}
	public String trimSpace(String input)
	{
		if(input == null)
		{
			return ("Given input is null");
		}
		input.trim();
		input.toLowerCase();
		return input;
	}
	public void exitsVehicle()
	{
		System.out.println("Enter the token number ");
		int token=buffer.nextInt();
		try {
			layer.ticketCheck(token);
		} catch (CustomException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Enter your mobile number if you have customerId ");
		long customerId=0;
		customerId=	buffer.nextInt();
		double amount=0;
		int returnMoney=0;
		try {
			String exit=layer.portalRegisteredCheck(customerId);
			
			if(customerId > 0 && !exit.equals("sorry your mobile Number is not registered"))
				{
				returnMoney=layer.amountReturned(customerId);
				}
			
			String val=layer.vehicleExits(token,customerId);
			if(returnMoney < 10.0 && returnMoney != 0)
			{
				System.out.println("Enter the shown message amount");
				returnMoney=(int) buffer.nextDouble();
			}
			
			if(!val.equals("Amount already paid"))
			{
				if(val.equals("Amount debited from your Id"))
				{
					System.out.println(val);
					System.out.println("vehicle Exits successfully ");
					return;
				}
			System.out.println(val);
			System.out.println("Enter the amount");
			amount=buffer.nextDouble();
			
			if(amount > 0)
			{
			String res=layer.callExits(token,amount,customerId,returnMoney);
			
			if(res.equals("please pay the amount") && customerId == 0)
			{

				System.out.println(layer.callExits(token, amount,customerId,returnMoney));
			}
			else if(res.equals("please add money in your customer id account") && customerId != 0)
			{
				System.out.println("kindly add money in your wallet ");
				double amountSum=buffer.nextDouble();
				System.out.println(layer.balanceAdded(customerId, amountSum));
			}
			else
				nullCall(res);
				System.out.println(res);}
			
			
			}
			else {
			System.out.println(val);
			System.out.println("Vehicle exits successfully");
			}
		}
		catch(CustomException exception)
		{
			System.out.println(" Vehicle not exits "+ exception.getMessage());
		}
	}
	
	public void messageSpaces()
	{
		System.out.println("Enter the floor to check empty spaces ");
		int floor=buffer.nextInt();
		
		try {
			layer.checkFloorSize(floor);
		} catch (CustomException e) {
		
			System.out.println(e.getMessage());
			return;
		}
		buffer.nextLine();
		System.out.println("Enter the vehicle type ");
		String vehicleType=buffer.nextLine();
		vehicleType=trimSpace(vehicleType);
		nullCall(vehicleType);
		try {
			System.out.println(layer.getAvailableSpaces(floor,vehicleType));
		}
		catch(CustomException message)
		{
			System.out.println("The message display "+ message.getMessage());
		}
	}
	public void nullCheck(String value) throws CustomException
	{
		if(value.isEmpty() || value == null)
		{
			throw new CustomException("String value cant be empty ");
		}
	}
	
	public void customerVehicleSpot()
	{
		System.out.println("Enter the ticket number ");
		int ticket=buffer.nextInt();
		buffer.nextLine();
		try {
			System.out.println(layer.customVehicleSpot(ticket));
		}
		catch(CustomException exception)
		{
			System.out.println("  "+ exception.getMessage());
		}
	}
	
	public void createFromEntry(String vehicleNumber,String vehicleType,long mobileNumber)
	{
		CustomerPojo custom=new CustomerPojo();
	//	System.out.println("Provide the details to create customerId ");
		custom.setMobileNumber(mobileNumber);
		//System.out.println("Enter the amount to put in wallet ");
		double amount=0;
		//buffer.nextLine();
		custom.setAmount(amount);
		custom.setVehicleNumber(vehicleNumber);
		custom.setVehicleType(vehicleType);
		//System.out.println("Enter the payment type cash/card ");
		String paymentType="cash";
		custom.setPaymentType(paymentType);
		try {
			System.out.println(layer.customerIdGenerate(custom));
		}
		catch(CustomException exception)
		{
			System.out.println(" Customer id generate "+ exception.getMessage());
		}
	}
	public void customerIdCreating()
	{
		CustomerPojo custom=new CustomerPojo();
		System.out.println("provide the details to create customerId ");
		System.out.println("Enter your vehicle number ");
		String vehicleNumber=buffer.nextLine();
		trimSpace(vehicleNumber);
		nullCall(vehicleNumber);
		custom.setVehicleNumber(vehicleNumber);
		System.out.println("Enter your mobile number ");
		long mobileNumber=buffer.nextLong();
		custom.setMobileNumber(mobileNumber);
		System.out.println("Enter the amount to put in wallet ");
		double amount=buffer.nextDouble();
		buffer.nextLine();
		custom.setAmount(amount);
		System.out.println("Enter the vehicle type ");
		String type=buffer.nextLine();
		trimSpace(type);
		nullCall(type);
		custom.setVehicleType(type);
		System.out.println("Enter the payment type cash / card ");
		String typePayment=buffer.nextLine();
		trimSpace(typePayment);
		nullCall(typePayment);
		custom.setPaymentType(typePayment);
		try {
			System.out.println(layer.customerIdGenerate(custom));
		}
		catch(CustomException exception)
		{
			System.out.println("Customer id generate "+ exception.getMessage());
		}
		
	}
	
	
	public void getAllCustomerDetails()
	{
		System.out.println("Customer all details are ");
		try {
			System.out.println(layer.allCustomerId());
		}
		catch(CustomException exception)
		{
			System.out.println("All  customer id generate "+ exception.getMessage());
		}
	}
	
	
	
	public void customerWalletAdded()
	{
		System.out.println("Enter your mobile number to adding amount ");
		long mobileNumber=buffer.nextLong();
		buffer.nextLine();
		
		try {
			System.out.println(layer.portalRegisteredCheck(mobileNumber));
			return;
		} catch (CustomException e) {
			
			System.out.println("Adding wallet amount "+ e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Do you want to pay in cash/card");
		String paymentType=buffer.nextLine();
		System.out.println("Enter the respective amount to add ");
		double amount=buffer.nextDouble();
		try {
			System.out.println(layer.portalAmountAdded(mobileNumber, paymentType ,amount));
		}
		catch(CustomException exception)
		{
			System.out.println("Causes are "+exception.getMessage() );
		}
	}
	
	public void optionCheck()
	{
		System.out.println();
		System.out.println("1-Check options");
		System.out.println();
		System.out.println("2-Get the availabel spaces");
		System.out.println();
		System.out.println("3-Entry");
		System.out.println();
		System.out.println("4-Get token number details");
		System.out.println();
		System.out.println("5-Exit");
		System.out.println();
		System.out.println("6-Customer id portal info creation ");
		System.out.println();
		System.out.println("7-Customer wallet amount added ");
		System.out.println();
		System.out.println("8-To get all customer id portals details ");
		System.out.println();
		System.out.println("9-Break");
	}
	
	
	public static void main(String[] args)
	{
		input.includeDummyValues();
		System.out.println("Giving floors and space");
		System.out.println("Enter the number to run the floor ");
		int floor=buffer.nextInt();
	
		System.out.println("Enter the number to get the slots ");
		int slot=buffer.nextInt();
		try {
			layer.floorGenerate(floor, slot);
		}
		catch(CustomException custom)
		{
			System.out.println("Adding floor and spots "+ custom.getMessage());
		}
		input.optionCheck();
    	
    	
    	
    	boolean flag=true;
    	
    	while(flag)
    	{
    		System.out.println("Enter the choice");
    		int n=buffer.nextInt();
    		
    		buffer.nextLine();
    	switch(n)
    	{
   	
    	case 1:input.optionCheck();
    	break;
    	case 2:input.messageSpaces();
    	break;
    	
    	case 3:input.customerEntry();
    	break;
    	
    	case 4:input.customerVehicleSpot();
    	break;
    
    	case 5:input.exitsVehicle(); 	       
    	break;
    	
    	case 6:input.customerIdCreating();
    	break;
    	
    	case 7:input.customerWalletAdded();
    	break;
    	case 8:input.getAllCustomerDetails();
    	break;
    	case 9:flag=false;
    	break;
    	}
    	
    }
	}


}















/*   	int idCustom=0;
System.out.println("Do you have customer portal Id Enter if you have yes/no ");
String customerId=buffer.nextLine();
trimSpace(customerId);
nullCall(customerId);
if(customerId.equals("yes"))
{
System.out.println(" if yes type your customer Id mobileNumber  ");
idCustom=buffer.nextInt();
buffer.nextLine();
try {
	layer.portalRegisteredCheck(idCustom);
} catch (CustomException e) {

	System.out.println("The checking Customer Entries given mobileNumber "+ e.getMessage());
	e.printStackTrace();
}
}
else if(customerId.equals("no"))
{
	System.out.println("Do you want to create CustomerId for parking yes/no ");
	String confirmation=buffer.nextLine();
	trimSpace(confirmation);
	nullCall(confirmation);
	if(confirmation.equals("yes"))
	{
		input.createFromEntry(number,vehicleType);
	}
}
token.setCustomerId(idCustom);*/
