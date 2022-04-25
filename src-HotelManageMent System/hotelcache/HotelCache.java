package hotelcache;

import java.util.*;

import hotelPojo.CustomException;
import hotelPojo.HotelPojo;
import hotelPojo.UserPojo;

public class HotelCache {
	
   List<UserPojo> listUser=new ArrayList<>();
   List<HotelPojo> listHotel=new ArrayList<>();
   
   public void addHotelListDetails(HotelPojo pojo) throws CustomException
   {
	   listHotel.add(pojo);
	   
   }
   public void addUserDetails(UserPojo user) throws CustomException
   {
	   listUser.add(user);
   }
   public List<HotelPojo> getHotelDetails() throws CustomException
   {
	   if(listHotel != null)
	   {
	   return listHotel;
	   }
	   return listHotel;
   }
   public List<UserPojo> getUserDetails() throws CustomException
   {
	   if(listUser != null)
	   {
		   return listUser;
	   }
	   return listUser;
   }
   
   public String  sortingByName()
   { 
	   String val="";
       Collections.sort(listHotel,new sortByName());
       for(int i=listHotel.size()-1;i>0;i--)
       {
    	   val+=" "+listHotel.get(i);
    	   val+="\n";
       }
       return val;
   }
   public String sortingByRating()
   {
   Collections.sort(listHotel,new sortByRating());
   String val="";
   for(int i=listHotel.size()-1;i>0;i--)
   {
	   val+=" "+listHotel.get(i);
	   val+="\n";
   }
   return val;
   }
   
   public String sortByRoomsAvailable()
   {
	   String res="";
	   Collections.sort(listHotel,new sortByRooms());
	   for(int i=listHotel.size()-1;i>0;i--)
	   {
		   res+=" "+listHotel.get(i);
		   res+="\n";
	   }
	   return res;
   }
   
   public String sortingByUser()
   {
	   String res="";
	   Collections.sort(listUser,new sortByUser());
	   for(int i=listUser.size()-1;i> 0;i--)
	   {
		   res+=" "+ listUser.get(i);
		   res+="\n";
	   }
	   return res;
   }
   
   public String  getSpecificLocation(String search) throws CustomException
   {
	   String res="";
	   for(int i=1;i<= listHotel.size()-1;i++)
	   {
		   HotelPojo hotelInput=listHotel.get(i);
		   if(hotelInput.getLocation().equals(search))
		   {
			   res+= " "+ hotelInput;
			   res+="\n";
		   }
	   }
	   return res;
   }
   
   
}
   
   
   
   
   
   
   
   
   
   
   
   
   
   class sortByName implements Comparator<HotelPojo>
   {
	   public int compare(HotelPojo a,HotelPojo b)
	   {
		   return a.getHotelName().compareTo(b.getHotelName());
	   }
   }
   class sortByRating implements Comparator<HotelPojo>
   {
	   public int compare(HotelPojo a,HotelPojo b)
	   {
		   return a.getRating()-(b.getRating());
	   }
   }
   
   class sortByRooms implements Comparator<HotelPojo>
   {
	   public int compare(HotelPojo a,HotelPojo b)
	   {
		   return a.getRoomsAvailable()-b.getRoomsAvailable();
	   }
   }
   
   class sortByUser implements Comparator<UserPojo>
   {
	   public int compare(UserPojo a,UserPojo b)
	   {
		   return a.getHotelName().compareTo(b.getHotelName());
	   }
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   

