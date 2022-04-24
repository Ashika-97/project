package parkingCacheLogic;

import ParkingPojoClass.*;

public class ParkingLogicalLayer {
    
	static ParkingCache cache=new ParkingCache();
     
     public String availableSpaceDisplay() throws Exception
     {
    	 return cache.checkAvailableSpace();
     }
     
     public  int customerTokenGenerate(CustomerPojo custom,double amountCar) throws Exception
     {
    	 return cache.customerEntry(custom,amountCar);
     }
     
     public CustomerPojo  getCustomerDetails(int token) throws Exception
     {
    	 return cache.getCustomerEntry(token);
     }
     public String vehicleExits(String vehicleNumber,int token,String val) throws Exception
     {
    	 return cache.checkAmountPayabelOrNot(vehicleNumber, token , val);
     }
     
}
