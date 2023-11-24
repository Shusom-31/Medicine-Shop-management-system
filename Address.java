package Shop;


public class Address {

	private String city;
	
	private int postcode;
	public Address(String city,int postcode) {
		this.city = city;
		
		this.postcode = postcode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
    public int getPostcode() {
		return postcode;
	}
	public void setPostcode(int postcode) {
		this.postcode = postcode;
	}

}

