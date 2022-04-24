package pojoClass;

public class UserPojo {
   
	private String userName;
	private int userId;
	private String hotelName;
	private int bookingCost;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public int getBookingCost() {
		return bookingCost;
	}
	public void setBookingCost(int bookingCost) {
		this.bookingCost = bookingCost;
	}
	@Override
	public String toString() {
		return "userName=" + userName + ", userId=" + userId + ", hotelName=" + hotelName + ", bookingCost="
				+ bookingCost + "";
	}
	
	
	
	
   
}
