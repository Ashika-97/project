package car;
import car.Car;
public class XUV extends Car{
	int seats;
	String model;
	String airbags;
	String color;
    static String input="XUV Type";
	
	
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getAirbags() {
		return airbags;
	}
	public void setAirbags(String airbags) {
		this.airbags = airbags;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}

	public XUV() {
		super(input);
	}
public String toString()
{
	return input;
}
}
