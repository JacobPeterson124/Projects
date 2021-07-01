package phonebook;

public class Address  {
	
	private String streetName;
	private String city;
	private String state;
	private int zip;
	
	

	public Address(String streetName, String city, String state, int zip) {
		super();
		this.streetName = streetName;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}


	public String getStreetName() {
		return streetName;
	}


	public int getZip() {
		return zip;
	}


	public void setZip(int zip) {
		this.zip = zip;
	}


	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	@Override
	public String toString() {
		return  streetName + " " + city + ", " + state + " " + zip;
	}
	
	
	


}