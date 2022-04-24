package pojoClass;

public class HotelPojo {
   
	private String hotelName;
	private int roomAvailable;
	private String location;
	private int rating;
	private long pricePerRoom;
	
	public int getRoomAvailable() {
		return roomAvailable;
	}
	public void setRoomAvailable(int roomAvailable) {
		this.roomAvailable = roomAvailable;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public long getPricePerRoom() {
		return pricePerRoom;
	}
	public void setPricePerRoom(long pricePerRoom) {
		this.pricePerRoom = pricePerRoom;
	}
	
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	@Override
	public String toString() {
		return "" + hotelName + ", roomAvailable=" + roomAvailable + ", location=" + location
				+ ", rating=" + rating + ", pricePerRoom=" + pricePerRoom + "]";
	}
	
	
	
	
}
