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
     public void amountTimeValidation(CustomerPojo custom ) throws Exception
     {
    	 cache.amountandTimechecking(custom);
     }
     public CustomerPojo  getCustomerDetails(int token) throws Exception
     {
    	 return cache.getCustomerEntry(token);
     }
     public void vehicleExits(String vehicleNumber,int token,String val) throws Exception
     {
    	  cache.checkAmountPayabelOrNotToExit(vehicleNumber, token , val);
     }
     public String exitsCheckAmount(float amount) throws Exception
     {
    	 return cache.paymentCheckExits(amount);
     }
     public String setLocalTime() throws Exception
     {
    	 return cache.automaticTime();
     }
     
     
}
