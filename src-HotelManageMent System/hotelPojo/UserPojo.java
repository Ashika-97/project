package hotelPojo;

public class UserPojo {
	
	private int userId;
	private String username;
	private int bookingCost;
	private String hotelName;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getBookingCost() {
		return bookingCost;
	}
	public void setBookingCost(int bookingCost) {
		this.bookingCost = bookingCost;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	@Override
	public String toString() {
		return "userId=" + userId + ", username=" + username + ", bookingCost=" + bookingCost + ", hotelName="
				+ hotelName + "";
	}
	
    
}
