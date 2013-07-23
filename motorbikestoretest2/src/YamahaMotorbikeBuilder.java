
public class YamahaMotorbikeBuilder extends MotorbikeBuilder {

	private YamahaMotorbike yamaha;
	
	@Override
	public MotorbikeBuilder buildBike() {
		// TODO Auto-generated method stub
		this.yamaha = new YamahaMotorbike(); 
		return this;
	}

	@Override
	public MotorbikeBuilder brand(String brand) {
		// TODO Auto-generated method stub
		yamaha.setBrand( brand );
		return this;
	}

	@Override
	public MotorbikeBuilder model(String model) {
		// TODO Auto-generated method stub
		yamaha.setModel( model );
		return this;
	}

	@Override
	public MotorbikeBuilder details(String details) {
		// TODO Auto-generated method stub
		yamaha.setDetails( details );
		return this;
	}
	
	@Override
	public MotorbikeBuilder price(int thePrice) {
		// TODO Auto-generated method stub
		yamaha.setPrice(thePrice);
		return this;
	}

	@Override
	public Motorbike getBike() {
		// TODO Auto-generated method stub
		return yamaha;
	}

}
