package hotelCache;

import java.util.*;

import pojoClass.HotelPojo;
import pojoClass.UserPojo;

public class HotelCache {
     
	Map<Integer,HotelPojo> map=new HashMap<>();
	static Map<Integer,UserPojo> userMap=new HashMap<>();
	TreeMap<Integer,HotelPojo> tree=new TreeMap<>();
	TreeMap<Integer,HotelPojo> treeMap=new TreeMap<>();
    int serialNumber=0;
	int serialNumberUser=0;
	
    
    public int autoIncrement()
    {
    	return ++serialNumber;
    }
    public int autoIncrementUser()
    {
    	return ++serialNumberUser;
    }
    public void emptyCheck(String values) throws Exception
    {
    	if(values == null && values.isEmpty())
    		throw new Exception("String cant be Empty");
        
    }
    //add hotels 
	public void addHotelDetails(HotelPojo hotel) throws Exception
	{
		emptyCheck(hotel.getHotelName());
		emptyCheck(hotel.getLocation());
	
		if(hotel.getRating() <=5)
		 map.put(autoIncrement(),hotel);
	
	}
	//sorted order prints
	public Map<Integer,HotelPojo> getHotelDetails() throws Exception
	{
		Map<Integer,HotelPojo> localMap=new HashMap<>();
		for(int i=1;i<=map.size();i++)
		{
			HotelPojo pojo=map.get(i);
		  localMap.put(i, pojo);
		}
		return localMap;
	}
	//reverse by name
	public Map<Integer,HotelPojo>  getReverseMap() throws Exception
	{
		Map<Integer,HotelPojo> localMap=new HashMap<>();
		int j=0;
	 for(int i=map.size();i>0;i--)
	 {
		 HotelPojo hotel=map.get(i);
		 localMap.put(j++, hotel);
	 }
	 return localMap;
	}
	//sort by rooms avialble
	
	public TreeMap<Integer,HotelPojo> sortByRating() throws Exception
	{
		HotelPojo hotelValues=null;
		for(HotelPojo pojo:map.values())
		{
			
			tree.put(pojo.getRating(), pojo);
		}
		TreeMap<Integer,HotelPojo> tree1=new TreeMap<>(Collections.reverseOrder());
		tree1.putAll(tree);
			
	return tree1;	
	}
	
	public HotelPojo sortByLocation(String location) throws Exception
	{
		emptyCheck(location);
		HotelPojo hotelValues=null;
		location=location.toLowerCase();
		for(HotelPojo pojo:map.values())
		{
			if(pojo.getLocation().equals(location))
			{
			
				hotelValues=pojo;
				
			}
			
		}
		if(hotelValues == null)
			System.out.println("sorry the location is unavailable ");
		
		
		return hotelValues;
	}
	
	
	
	public TreeMap<Integer,HotelPojo> sortByRoomAvailable() throws Exception
	{
	
		for(HotelPojo hotelpojo:map.values())
		{
			treeMap.put(hotelpojo.getRoomAvailable(), hotelpojo);
		}
		TreeMap<Integer,HotelPojo> treeMap1=new TreeMap<>(Collections.reverseOrder());
		treeMap1.putAll(treeMap);
	
		return treeMap1;
		
	}
	
	
	public void userDataEntry(UserPojo user) throws Exception
	{
		    emptyCheck(user.getHotelName());
		    emptyCheck(user.getUserName());
			userMap.put(autoIncrementUser(), user);
	}
	
	public Map<Integer,UserPojo> getUserData() throws Exception
	{ 
		
		return userMap;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
