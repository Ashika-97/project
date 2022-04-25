package hotelPojo;

public class HotelPojo {
	
	private String hotelName;
	private int rating;
	private int roomsAvailable;
	private String location;
	private int price;
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public int getRoomsAvailable() {
		return roomsAvailable;
	}
	public void setRoomsAvailable(int roomsAvailable) {
		this.roomsAvailable = roomsAvailable;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "hotelName=" + hotelName + ", rating=" + rating + ", roomsAvailable=" + roomsAvailable
				+ ", location=" + location + ", price=" + price + "";
	}
	
	

}
