
import java.util.HashMap;



@SuppressWarnings("serial")
public class MotorBikeDatabase extends HashMap<String, Motorbike> {
	
	private static KawasakiMotorbikeBuilder kawa;
	private static YamahaMotorbikeBuilder yamaha;
	private static HondaMotorbikeBuilder honda ;
	private static Motorbike moto;
	private static MotorBikeDatabase db;

	
	private MotorBikeDatabase() {}
	
	public static MotorBikeDatabase getDatabase() {
		
		if ( db == null ) {
			
			db = new MotorBikeDatabase();
			honda= new HondaMotorbikeBuilder();
			honda.buildBike();
			honda.brand("Honda");
			honda.model("CBR");
			honda.details("Top speed 200 km/h");
			honda.price(2000);
			moto = honda.getBike();
			
			db.put("honda", moto);
			
			yamaha = new YamahaMotorbikeBuilder();
			yamaha.buildBike();
			yamaha.brand("Yamaha");
			yamaha.model("R1");
			yamaha.details("Top speed 250 km/h");
			yamaha.price(2500);
			moto = yamaha.getBike();
			
			db.put("yamaha", moto);
			
			kawa = new KawasakiMotorbikeBuilder();
			kawa.buildBike();
			kawa.brand("Kawasaki");
			kawa.model("Ninja 636");
			kawa.details("Top speed 300 km/h");
			kawa.price(3000);
			moto = kawa.getBike();
			
			db.put("kawasaki", moto);
		}

		return db;
	}

}
