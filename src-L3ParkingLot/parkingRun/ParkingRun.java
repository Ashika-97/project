package parkingRun;

import java.util.Scanner;

import ParkingPojoClass.CustomerPojo;
import parkingCacheLogic.ParkingLogicalLayer;

public class ParkingRun {

        static ParkingLogicalLayer park=new ParkingLogicalLayer();
        static Scanner input=new Scanner(System.in);
        
        
        public void displayAvailableSpace()
        {
        	try {
				System.out.println(park.availableSpaceDisplay());
			} 
        	catch (Exception e)
        	{				
				e.printStackTrace();
			}
        	
        }
        
        public void customerEntry()
        {
        	CustomerPojo custom=new CustomerPojo();
        	System.out.println("Enter the vehicle Type");
        	String type=input.nextLine();
        	custom.setVehicleType(type);
        	double amountCar=0;
        	if(type.equals("electricCar"))
        	{
        		System.out.println("If you want to charge you car pay money about $9 ");
        	     amountCar=input.nextDouble();
        	     input.nextLine();
        	     if(amountCar < 9)
        	     {
        	    	 
        	    	 System.out.println("you are giving less than $9  give th correct amount ");
        	    	
        	     }
        	     
        	}
        	System.out.println("Enter the vehicleNumber ");
        	String number=input.nextLine();
        	custom.setVehicleNumber(number);
        	System.out.println("Enter if you want to cash or card");
        	String paymentType=input.nextLine();
        	custom.setPaymentType(paymentType);
        	System.out.println("Enter if you want to pay at entry  ");
        	String payment=input.nextLine();
        	custom.setPaymentAtEntry(payment);
        	if(payment.equals("pay")|| payment.equals("yes"))
        	{
        		System.out.println("Enter the time ");
        		float timeHours=input.nextFloat();
        		custom.setTime(timeHours);
        		System.out.println("kindly pay $4 for (1 hour),"
					+ "$7.5 for totally (2 hour),"
					+ "$9.5 for (3 hour) according to you convenience");
        		float amount=input.nextFloat();
        		custom.setAmount(amount);
        		
        	}
        	else
        	{
        		System.out.println("Enter how many hours to park in parking lot");
        		int time=input.nextInt();
        		custom.setTime(time);
        	}
        
            try {
        
        		int token=park.customerTokenGenerate(custom,amountCar);
        		input.nextLine();
        		custom.setTokenNumber(token);
        		System.out.println("the token number for your vehicle is "+ token);
        	}
        	catch(Exception e)
        	{
        		System.out.println("The exception in customer getting token "+ e.getMessage());
        	}
        }
        
        
        public void getCustomerEntryDetails()
        {
        	System.out.println("Enter the token number ");
        	int num=input.nextInt();
        	input.nextLine();
        	try {
        		System.out.println(park.getCustomerDetails(num));
        	}
        	catch(Exception e)
        	{
        		System.out.println("The Exception in get Customer Details "+ e.getMessage());
        	}
        }
	
        
        public void getvehicleExit()
        {
        	System.out.println("Enter the respective token number ");
        	int tokenNumber=input.nextInt();
        	System.out.println("Enter the vehicle number ");
        	String vehicleNumber=input.nextLine();
        	input.nextLine();
        	try {
        		park.vehicleExits(vehicleNumber, tokenNumber);
        	}
        	catch(Exception e)
        	{
        		System.out.println("The Exception in vehicle exits ");
        	}
        }
	   
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        public static void main(String[] args)
        {
        	ParkingRun run=new ParkingRun();
        	System.out.println("Enter the number to run the loop ");
        	int n=input.nextInt();
        	input.nextLine();
        	boolean flag=true;
        	while(flag)
        	{
        	switch(n)
        	{
        	case 1:run.displayAvailableSpace();
        	
        	case 2:run.customerEntry();
        	
        	case 3:run.getCustomerEntryDetails();
        	
        	case 4:run.getvehicleExit();
        	}
        	
        }
        
        
        
        
        }    
        
}
