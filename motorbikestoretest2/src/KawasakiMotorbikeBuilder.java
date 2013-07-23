
public class KawasakiMotorbikeBuilder extends MotorbikeBuilder{
	
	KawasakiMotorBike kawa;
	@Override
	public MotorbikeBuilder buildBike() {
		// TODO Auto-generated method stub
		this.kawa = new KawasakiMotorBike();
		return this;
	}

	@Override
	public MotorbikeBuilder brand(String brand) {
		// TODO Auto-generated method stub
		kawa.setBrand(brand);
		return this;
	}

	@Override
	public MotorbikeBuilder model(String model) {
		// TODO Auto-generated method stub
		kawa.setModel(model);
		return this;
	}

	@Override
	public MotorbikeBuilder details(String details) {
		// TODO Auto-generated method stub
		kawa.setDetails(details);
		return this;
	}

	@Override
	public Motorbike getBike() {
		// TODO Auto-generated method stub
		return kawa;
	}

	@Override
	public MotorbikeBuilder price(int thePrice) {
		// TODO Auto-generated method stub
		kawa.setPrice(thePrice);
		return this;
	}


}
