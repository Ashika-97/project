package hotelCache;
import java.util.Map;
import java.util.TreeMap;

import pojoClass.HotelPojo;
import pojoClass.UserPojo;

public class HotelLogicalLayer {

	 static HotelCache input=new HotelCache();
	 
	 
	 public void addDetails(HotelPojo hotel) throws Exception
	 {
		 input.addHotelDetails(hotel);
	 }
	
	 public Map<Integer,HotelPojo> getAllHotelDetails() throws Exception
	 {
		 return input.getHotelDetails();
	 }
	 public Map<Integer,HotelPojo> reverseOrder() throws Exception
	 {
		 return input.getReverseMap();
	 }
	 
	 public TreeMap<Integer,HotelPojo> ratingMap() throws Exception
	 {
		 return input.sortByRating();
	 }
	 
	 public HotelPojo locationFinding(String location) throws Exception
	 {
		return input.sortByLocation(location);
	 }
	 public TreeMap<Integer,HotelPojo> roomsAvailable() throws Exception
	 {
		  return  input.sortByRoomAvailable();
	 }
	 
	 public void addUserData(UserPojo user) throws Exception
	 {
		 input.userDataEntry(user);
	 }
	 public Map<Integer,UserPojo> getAllUserData() throws Exception
	 {
		return  input.getUserData();
	 }
	
} 
