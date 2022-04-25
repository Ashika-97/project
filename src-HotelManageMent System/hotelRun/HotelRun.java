package hotelRun;


import java.util.*;

import hotelPojo.HotelPojo;
import hotelPojo.UserPojo;
import hotelcache.HotelLogicalLayer;

public class HotelRun {
     
	static HotelLogicalLayer input=new HotelLogicalLayer();
	static Scanner validInput=new Scanner(System.in);
	
	
	public void hotelDummyValues() throws Exception
    {
    	HotelPojo dummy=new HotelPojo();
    	dummy.setHotelName("H1");
    	dummy.setRoomsAvailable(4);
    	dummy.setLocation("Bangalore");
    	dummy.setRating(3);
    	dummy.setPrice(100);
    	input.addHotelDetails(dummy);
    	
    	HotelPojo dummy1=new HotelPojo();
    	dummy1.setHotelName("H2");
    	dummy1.setRoomsAvailable(3);
    	dummy1.setLocation("Mumbai");
    	dummy1.setRating(5);
    	dummy1.setPrice(200);
    	input.addHotelDetails(dummy1);
    	
    	HotelPojo dummy2=new HotelPojo();
    	dummy2.setHotelName("H3");
    	dummy2.setRoomsAvailable(5);
    	dummy2.setLocation("chennai");
    	dummy2.setRating(4);
    	dummy2.setPrice(300);
    	input.addHotelDetails(dummy2);
    	
    	
    	HotelPojo dummy3=new HotelPojo();
    	dummy3.setHotelName("H4");
    	dummy3.setRoomsAvailable(6);
    	dummy3.setLocation("Bangalore");
    	dummy3.setRating(2);
    	dummy3.setPrice(300);
    	input.addHotelDetails(dummy3);
    	
    	UserPojo user=new UserPojo();
    	user.setUsername("U3");
    	user.setHotelName("H1");
    	user.setUserId(3);
    	user.setBookingCost(1300);
    	input.addUserDetails(user);
    	

    	UserPojo user1=new UserPojo();
    	user1.setUsername("U3");
    	user1.setHotelName("H2");
    	user1.setUserId(4);
    	user1.setBookingCost(900);
    	input.addUserDetails(user1);
    	

    	UserPojo user2=new UserPojo();
    	user2.setUsername("U3");
    	user2.setHotelName("H3");
    	user2.setUserId(5);
    	user2.setBookingCost(2000);
    	input.addUserDetails(user2);
    	

    	UserPojo user3=new UserPojo();
    	user3.setUsername("U3");
    	user3.setHotelName("H4");
    	user3.setUserId(6);
    	user3.setBookingCost(1000);
    	input.addUserDetails(user3);
    	
    }
	
	   public void addNewHotelDetails()
       {
       	HotelPojo pojo=new HotelPojo();
       	System.out.println("Enter your hotel Name");
       	String name=validInput.nextLine();
       	pojo.setHotelName(name);
       	System.out.println("Enter the room available in you hotel ");
       	int roomavailable=validInput.nextInt();
       	pojo.setRoomsAvailable(roomavailable);
       	validInput.nextLine();
       	System.out.println("Enter the Location ");
       	String location=validInput.nextLine();
       	pojo.setLocation(location);
       	System.out.println("Enter the customers Rating given to you ");
       	int rating=validInput.nextInt();
       	pojo.setRating(rating);
       	System.out.println("Enter the price for your rooms ");
       	int price=validInput.nextInt();
       	validInput.nextLine();
       	pojo.setPrice(price);
       	try {
       		input.addHotelDetails(pojo);
       		System.out.println("Hotel Details are updated");
       	}
       	catch(Exception exception) {
       		System.out.println("Exception in hotel adding details "+ exception.getMessage());
       	}
       	
       }
	
	   public void userDataEntry()
       {
       	UserPojo user=new UserPojo();
       	System.out.println("Enter the userName ");
       	String name=validInput.nextLine();
       	user.setUsername(name);
       	System.out.println("Enter the hotelName ");
       	String hotelName=validInput.nextLine();
       	user.setHotelName(hotelName);
       	System.out.println("Enter your userId ");
       	int userId=validInput.nextInt();
       	user.setUserId(userId);
       	System.out.println("Enter the booking cost ");
       	int cost=validInput.nextInt();
       	user.setBookingCost(cost);
       	try {
       		System.out.println();
       		input.addUserDetails(user);
       		System.out.println("User Details are updated");
       	}
       	catch(Exception exception)
       	{
       		System.out.println("The Exception in adding user data "+ exception.getMessage());
       	}
       	
       }
	
	
	public void getHotelListDetails()
	{
		System.out.println("The hotel details are ");
		try {
			List<HotelPojo>  list=input.getHotelDetails();
			for(int i=1;i<list.size();i++)
			{
				System.out.println(list.get(i));
				System.out.println();
			}
		}
		catch(Exception e)
		{
			System.out.println("The Exception in getHoteldetails "+ e.getMessage());
		}
	}
	
	public void getUserDetails()
	{
		System.out.println("the User Details are ");
		try{
			List<UserPojo> list=input.getUserDetails();
			for(int i=1;i<list.size();i++)
			{
				System.out.println(list.get(i));
				System.out.println();
			}
		}
		catch(Exception e)
		{
			System.out.println("The Exception in get userDetails "+ e.getMessage());
		}
	}
	
	public void getSortByName()
	{
		System.out.println("The sort by name are ");
		try {
			System.out.println(input.sortName());
		}
		catch(Exception e)
		{
			System.out.println("The Exception in get sorting by name ");
		}
	}
	
	public void sortByRatingInRun()
	{
		System.out.println("The sort by ratins are ");
		try {
			System.out.println(input.sortRating());
		}
		catch(Exception e)
		{
			System.out.println("The Exception in get sort by rating "+ e.getMessage());
		}
	}
	
	
	public void sortByRooms()
	{
		System.out.println("The sort by rooms are ");
		try {
			System.out.println(input.sortRooms());
		}
		catch(Exception e)
		{
			System.out.println("The Exception in get sort by rooms "+ e.getMessage());
		}
	}
	
	public void getLocation()
	{
		System.out.println("Enter the name to get the Details ");
        String value=validInput.nextLine();
        try {
        	System.out.println(input.specificCaptureLocation(value));
        }
        catch(Exception e)
		{
			System.out.println("The Exception in get location "+ e.getMessage());
		}
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args)
	{
		HotelRun output=new HotelRun();
		try {
			output.hotelDummyValues();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		System.out.println("Enter the number to get the sortings ");
		int n=validInput.nextInt();
	    validInput.nextLine();
		
		switch(n)
		{
		case 1:output.addNewHotelDetails();
		
		case 2:output.getHotelListDetails();
			
		case 3:output.getSortByName();
			
		case 4:output.sortByRatingInRun();
			
		case 5:output.sortByRooms();
			
		case 6:output.getLocation();
			
		case 7:output.userDataEntry();
		
		case 8:output.getUserDetails();
		}
	}
	
	
	
	
	
	
	
	
	
    
}
