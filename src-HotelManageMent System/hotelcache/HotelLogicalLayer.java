package hotelcache;

import java.util.List;

import hotelPojo.CustomException;
import hotelPojo.HotelPojo;
import hotelPojo.UserPojo;

public class HotelLogicalLayer {
	
     HotelCache cache=new HotelCache();
     
     public void  addHotelDetails(HotelPojo hotel) throws CustomException
     {
    	  cache.addHotelListDetails(hotel);
     }
     public void addUserDetails(UserPojo user) throws CustomException
     {
    	 cache.addUserDetails(user);
     }
     public List<HotelPojo> getHotelDetails() throws CustomException
     {
    	 return cache.getHotelDetails();
     }
     public List<UserPojo> getUserDetails() throws CustomException
     {
    	 return cache.getUserDetails();
     }
     public String  sortName() throws CustomException
     {
    	 return cache.sortingByName();
     }
     
     public String sortRating() throws CustomException
     {
    	 return cache.sortingByRating();
     }
     
     public String sortRooms() throws CustomException
     {
    	 return cache.sortByRoomsAvailable();
     }
     
     public String  specificCaptureLocation(String value) throws CustomException
     {
    	 return cache.getSpecificLocation(value);
     }
     
     public String uservalues() throws CustomException
     {
    	 return cache.sortingByUser();
     }
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
}
