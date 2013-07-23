
public class YamahaMotorbike implements Motorbike {
	
	private String brand;
	private String model;
	private String details;
	private int price;
	
	@Override
	public String getBrand() {
		// TODO Auto-generated method stub
		return brand;
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return model;
	}

	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return details;
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

	public void setBrand( String theBrand ) {
		this.brand = theBrand;
	}
	
	public void setModel( String theModel ) {
		this.model = theModel;
	}
	
	public void setDetails( String theDetails ) {
		this.details = theDetails;
	}
	
	public void setPrice ( int price ) {
		this.price = price;
	}

	
}
