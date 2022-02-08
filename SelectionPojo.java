package newDbupdated;

public class SelectionPojo {
    private  String firstName;
    private String cityinput;
    private long rollId;
   
    
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getCityinput() {
		return cityinput;
	}
	public void setCityinput(String cityinput) {
		this.cityinput = cityinput;
	}
	public long getRollId() {
		return rollId;
	}
	public void setRollId(long rollId) {
		this.rollId = rollId;
	}
	

	@Override
	public String toString() {
		return "firstName=" + firstName + ", cityinput=" + cityinput + ", rollId=" + rollId;
	}
	
	
	
	
}
