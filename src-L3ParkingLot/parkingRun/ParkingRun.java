package parkingRun;

import java.util.Scanner;

import ParkingPojoClass.CustomerPojo;
import parkingCacheLogic.ParkingLogicalLayer;

public class ParkingRun {

        static ParkingLogicalLayer park=new ParkingLogicalLayer();
        static Scanner input=new Scanner(System.in);
        
        public void dummyValues() throws Exception
        {
        	CustomerPojo custom=new CustomerPojo();
        	custom.setTokenNumber(101);
        	custom.setVehicleNumber("Tn 9010");
        	custom.setVehicleType("car");
        	custom.setPaymentAtEntry("yes");
        	String value=park.setLocalTime();
        	System.out.println(value+ " value is ");
        	custom.setTime(Integer.parseInt(value));
        	custom.setAmount(7.5);
        	custom.setPaymentType("cash");
        	try {
				park.customerTokenGenerate(custom, 0);
			} 
        	catch (Exception e) 
        	{
				e.printStackTrace();
			}
        	
        	CustomerPojo custom1=new CustomerPojo();
        	custom1.setTokenNumber(102);
        	custom1.setVehicleNumber("Tn 7310");
        	custom1.setVehicleType("bike");
        	custom1.setPaymentAtEntry("yes");
        	String val3=park.setLocalTime();
        	custom1.setTime(Integer.parseInt(val3));
        	custom1.setAmount(4);
        	custom1.setPaymentType("cash");
        	try {
				park.customerTokenGenerate(custom1, 0);
			} 
        	catch (Exception e) 
        	{
				e.printStackTrace();
			}
        	
        	CustomerPojo custom3=new CustomerPojo();
        	custom3.setTokenNumber(103);
        	custom3.setVehicleNumber("Tn 3214");
        	custom3.setVehicleType("electriccar");
        	custom3.setPaymentAtEntry("yes");
        	String val2=park.setLocalTime();
        	custom3.setTime(Integer.parseInt(val2));
        	custom3.setAmount(7.5);
        	custom3.setPaymentType("cash");
        	try {
				park.customerTokenGenerate(custom3, 9);
			} 
        	catch (Exception e) 
        	{
				e.printStackTrace();
			}
        	
        	CustomerPojo custom4=new CustomerPojo();
        	custom4.setTokenNumber(102);
        	custom4.setVehicleNumber("Tn 1210");
        	custom4.setVehicleType("minivan");
        	custom4.setPaymentAtEntry("yes");
        	String val1=park.setLocalTime();
        	custom4.setTime(Integer.parseInt(val1));
        	
        	custom4.setAmount(4);
        	custom4.setPaymentType("cash");
        	try {
				park.customerTokenGenerate(custom4, 0);
			} 
        	catch (Exception e) 
        	{
				e.printStackTrace();
			}
        	CustomerPojo custom5=new CustomerPojo();
        	custom5.setTokenNumber(102);
        	custom5.setVehicleNumber("Tn 5262");
        	custom5.setVehicleType("truck");
        	custom5.setPaymentAtEntry("yes");
        	String val=park.setLocalTime();
        	custom5.setTime(Integer.parseInt(val));
        	custom5.setAmount(9.5);
        	custom5.setPaymentType("cash");
        	try {
				park.customerTokenGenerate(custom5, 0);
			} 
        	catch (Exception e) 
        	{
				e.printStackTrace();
			}
        }
        
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
        	type.toLowerCase();
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
        	System.out.println("Enter if you want to pay at entry  ");
        	String payment=input.nextLine();
        	custom.setPaymentAtEntry(payment);
        	System.out.println("Enter if you want to cash or card");
        	String paymentType=input.nextLine();
        	custom.setPaymentType(paymentType);      	
       		
        	
        	
        
            try {
            	String val=park.setLocalTime();
            	custom.setTime(Integer.parseInt(val));
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
        	
        	System.out.println("Do you want to go ");
        	String val=input.nextLine();
        	if(val.equals("yes"))
        	{
           	System.out.println("Enter the respective token number to exit");
        	int tokenNumber=input.nextInt();
        	System.out.println("Enter the vehicle number ");
        	String vehicleNumber=input.nextLine();
        	input.nextLine();
        	try {
        		
        		park.vehicleExits(vehicleNumber, tokenNumber,val);
        		float amount=input.nextFloat();
        		System.out.println(park.exitsCheckAmount(amount));
                
        	}
        	catch(Exception e)
        	{
        		System.out.println("The Exception in vehicle exits ");
        	}}
        	else {
        		System.out.println("Vehicle not Exits ");
        	}
        }
	   
        
        
        
        
        
        
        
        
        
        
        
        public static void main(String[] args)
        {
        	ParkingRun run=new ParkingRun();
        	try {
				run.dummyValues();
			} catch (Exception e) {
				
				e.printStackTrace();
			}
        	
        	boolean flag=true;
        	while(flag)
        	{
        		System.out.println("Enter the number to run the loop ");
            	int n=input.nextInt();
            	input.nextLine();
        	switch(n)
        	{
        	case 1:run.displayAvailableSpace();
        	
        	case 2:run.customerEntry();
        	
        	case 3:run.getCustomerEntryDetails();
        	
        	case 4:run.getvehicleExit();
        	
        	case 5:flag=false;
        	}
        	
        }
        
        
        
        
        }    
        
}
