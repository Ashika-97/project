package hotelRun;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import hotelCache.HotelLogicalLayer;
import pojoClass.HotelPojo;
import pojoClass.UserPojo;

public class HotelRun {
        static HotelLogicalLayer hotel=new HotelLogicalLayer();
        static Scanner input=new Scanner(System.in);
        
        public void hotelDummyValues() throws Exception
        {
        	HotelPojo dummy=new HotelPojo();
        	dummy.setHotelName("H1");
        	dummy.setRoomAvailable(4);
        	dummy.setLocation("Bangalore");
        	dummy.setRating(3);
        	dummy.setPricePerRoom(100);
        	hotel.addDetails(dummy);
        	
        	HotelPojo dummy1=new HotelPojo();
        	dummy1.setHotelName("H2");
        	dummy1.setRoomAvailable(3);
        	dummy1.setLocation("Mumbai");
        	dummy1.setRating(5);
        	dummy1.setPricePerRoom(200);
        	hotel.addDetails(dummy1);
        	
        	HotelPojo dummy2=new HotelPojo();
        	dummy2.setHotelName("H3");
        	dummy2.setRoomAvailable(5);
        	dummy2.setLocation("chennai");
        	dummy2.setRating(4);
        	dummy2.setPricePerRoom(300);
        	hotel.addDetails(dummy2);
        	
        	
        	HotelPojo dummy3=new HotelPojo();
        	dummy3.setHotelName("H4");
        	dummy3.setRoomAvailable(6);
        	dummy3.setLocation("Bangalore");
        	dummy3.setRating(2);
        	dummy3.setPricePerRoom(100);
        	hotel.addDetails(dummy3);
        	
        	UserPojo user=new UserPojo();
        	user.setUserName("U1");
        	user.setHotelName("H1");
        	user.setUserId(3);
        	user.setBookingCost(1300);
        	hotel.addUserData(user);
        	

        	UserPojo user1=new UserPojo();
        	user1.setUserName("U2");
        	user1.setHotelName("H2");
        	user1.setUserId(4);
        	user1.setBookingCost(900);
        	hotel.addUserData(user1);
        	

        	UserPojo user2=new UserPojo();
        	user2.setUserName("U3");
        	user2.setHotelName("H3");
        	user2.setUserId(5);
        	user2.setBookingCost(2000);
        	hotel.addUserData(user2);
        	

        	UserPojo user3=new UserPojo();
        	user3.setUserName("U4");
        	user3.setHotelName("H4");
        	user3.setUserId(6);
        	user3.setBookingCost(1000);
        	hotel.addUserData(user3);
        	
        }
        
        public void addNewHotelDetails()
        {
        	HotelPojo pojo=new HotelPojo();
        	System.out.println("Enter your hotel Name");
        	String name=input.nextLine();
        	pojo.setHotelName(name);
        	System.out.println("Enter the room available in you hotel ");
        	int roomavailable=input.nextInt();
        	pojo.setRoomAvailable(roomavailable);
        	input.nextLine();
        	System.out.println("Enter the Location ");
        	String location=input.nextLine();
        	pojo.setLocation(location);
        	System.out.println("Enter the customers Rating given to you ");
        	int rating=input.nextInt();
        	pojo.setRating(rating);
        	System.out.println("Enter the price for your rooms ");
        	int price=input.nextInt();
        	input.nextLine();
        	pojo.setPricePerRoom(price);
        	try {
        		hotel.addDetails(pojo);
        		System.out.println("Hotel Details are updated");
        	}
        	catch(Exception exception) {
        		System.out.println("Exception in hotel adding details "+ exception.getMessage());
        	}
        	
        }
        public void getAllDetails()
        {
        	System.out.println("check all details here ");
        	System.out.println();
        	try {
        		
        		Map<Integer,HotelPojo> map=hotel.getAllHotelDetails();
         	
        			System.out.println(map.values());
        		
        	}
        	catch(Exception exception)
        	{
        		System.out.println("Exception in get All Hotel  Details "+ exception.getMessage());
        	}
        }
        
        public void getReverseOrder() 
        {
        	System.out.println("see the reverse order details ");
        	System.out.println();
        	try {
        		Map<Integer,HotelPojo> map=hotel.reverseOrder();
        		
        			System.out.println(map.values());
        		
        	}
        	catch(Exception exception) {
        		System.out.println("Exception in reverseOrder "+ exception.getMessage());
        	}
        }
        
        public void getRatingsSorted()
        {
        	System.out.println("TreeMap is ");
        	System.out.println();
        	try {
        		TreeMap<Integer,HotelPojo> map=hotel.ratingMap();
        		for(HotelPojo hotelpojo:map.values())
        		{
        			System.out.println(hotelpojo);
        		}
        	}
        	catch(Exception exception)
        	{
        		System.out.println("Exception in ratings get "+ exception.getMessage());
        	}
        }
        
        public void roomsSorting()
        {
        	System.out.println("The Rooms Available are ");
        	System.out.println();
        	try {
        		TreeMap<Integer,HotelPojo> map=hotel.roomsAvailable();
        		for(HotelPojo hotelpojo:map.values())
        		{
        			System.out.println(hotelpojo);
        		}
        	}
        	catch(Exception exception)
        	{
        		System.out.println("Exception in rooms available "+ exception.getMessage());
        	}
        	
        }
        
        
        public void findLocation()
        {
        	System.out.println();
        	System.out.println("Enter the location to findout ");
        	String location=input.nextLine();
        	try {
        		System.out.println(hotel.locationFinding(location));
        		System.out.println();
        	}
        	catch(Exception exception)
        	{
        		System.out.println("The Exception in location Finding "+ exception.getMessage());
        	}
        }
        
        public void userDataEntry()
        {
        	UserPojo user=new UserPojo();
        	System.out.println("Enter the userName ");
        	String name=input.nextLine();
        	user.setUserName(name);
        	System.out.println("Enter the hotelName ");
        	String hotelName=input.nextLine();
        	user.setHotelName(hotelName);
        	System.out.println("Enter your userId ");
        	int userId=input.nextInt();
        	user.setUserId(userId);
        	System.out.println("Enter the booking cost ");
        	int cost=input.nextInt();
        	user.setBookingCost(cost);
        	try {
        		System.out.println();
        		hotel.addUserData(user);
        		System.out.println("User Details are updated");
        	}
        	catch(Exception exception)
        	{
        		System.out.println("The Exception in adding user data "+ exception.getMessage());
        	}
        	
        }
        
        public void getUserData()
        {
        	System.out.println("The user Datas are ");
        	System.out.println();
        	try{
        	  Map<Integer,UserPojo> map=hotel.getAllUserData();
        	  System.out.println(map.values());
        	}
        	catch(Exception exception)
        	{
        		System.out.println("The Exception in get user Data "+ exception.getMessage());
        	}
        }
        
        
        
        
        
        
        
        
        
        
        public static void main(String[] args) throws Exception
        {
        	HotelRun run=new HotelRun();
        	run.hotelDummyValues();
        	System.out.println("Enter the number to get the details");
        	int n=input.nextInt();
        	input.nextLine();
        	boolean flag=true;
        	while(flag)
        	switch(n)
        	{
        	case 1:run.addNewHotelDetails();
        	//break;
        	case 2:run.getAllDetails();
        	//break;
        	case 3:run.getReverseOrder();
        	//break;
        	case 4:run.getRatingsSorted();
        //	break;
        	case 5:run.findLocation();
        	//break;
        	case 6:run.roomsSorting();
        //	break;
        	case 7:run.userDataEntry();
        
        	case 8:run.getUserData();
        	//break;
        	
        	case 9:flag=false;
        	
        	
        	}
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        }
}
