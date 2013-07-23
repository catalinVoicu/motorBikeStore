
public class HondaMotorbikeBuilder extends MotorbikeBuilder {
	
	HondaMotorBike honda;
	@Override
	public MotorbikeBuilder buildBike() {
		// TODO Auto-generated method stub
		this.honda = new HondaMotorBike();
		return this;
	}

	@Override
	public MotorbikeBuilder brand(String brand) {
		// TODO Auto-generated method stub
		honda.setBrand( brand );
		return this;
	}

	@Override
	public MotorbikeBuilder model(String model) {
		// TODO Auto-generated method stub
		honda.setModel( model );
		return this;
	}

	@Override
	public MotorbikeBuilder details(String theDetails) {
		// TODO Auto-generated method stub
		
		honda.setDetails( theDetails );
		return this;
	}

	@Override
	public Motorbike getBike() {
		// TODO Auto-generated method stub
		return honda;
	}

	@Override
	public MotorbikeBuilder price(int price) {
		// TODO Auto-generated method stub
		honda.setPrice(price);
		return this;
	}




}
