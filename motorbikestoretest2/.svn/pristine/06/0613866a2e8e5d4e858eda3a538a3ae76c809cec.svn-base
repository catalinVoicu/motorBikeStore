import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.concurrent.Semaphore;




public class Client extends Thread{

	private ArrayList<String> clientCatalog;
	private MotorBikeDatabase db = MotorBikeDatabase.getDatabase();
	private static String search;
	private Semaphore s = new Semaphore(1);


	
	@Override
	public void run() {
		// TODO Auto-generated method stub

		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in)); 
		System.out.println("Welcome to our motorbike shop please search for a moto :)");
		System.err.print("\nSearch: ");
		String read = null;
		
		try {
			read = scan.readLine();
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
	
		search( read );
		
		System.out.println("If you you want to order the motorbike please insert 'order' else 'cancel'" );
		System.err.print("Command: ");
		try {
			read = scan.readLine();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			orderCheck( read );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	private ArrayList<String> initializeCatalog() {
		clientCatalog = new ArrayList<String>();
		clientCatalog.add("honda");
		clientCatalog.add("yamaha");
		clientCatalog.add("kawasaki");
		return clientCatalog;
	}
	
	private void search ( String searchText ) {
		boolean flag = false;
		searchText = searchText.toLowerCase();
		for ( int i = 0; i < initializeCatalog().size(); i++ ) {
			if (initializeCatalog().get(i).contains(searchText)) {
				System.out.println (
						"Here is the motorbike are you looking for: " + db.get(searchText).getBrand() +
						" \nModel: " + db.get(searchText).getModel() +
						" \nDetails: " + db.get(searchText).getDetails() + 
						" \nWith the price: " + db.get(searchText).getPrice() + " euro"
				);
				flag = true;
				search = searchText;
			} 
		}
		if ( flag == false ) {
			System.out.println("Sorry we couldn't find what you desire :'( ");
		}

	}
	
	private void orderCheck ( String order ) throws IOException {

		boolean orderFlag = false;
		
		if ("order".equals( order )) {
			orderFlag = true;
		} else if( "cancel".equals( order )) {
			orderFlag = false;
		}
		
		if ( orderFlag == true ) {
			FileWriter file = new FileWriter("ticket.txt");
			
			for ( int i = 0; i < initializeCatalog().size(); i++ ) {
				if (initializeCatalog().get(i).contains(search)) {
					file.write(
							"Motorbike " + db.get(initializeCatalog().get(i)).getBrand() +
							" model: " + db.get(initializeCatalog().get(i)).getModel() +
							" details: " + db.get(initializeCatalog().get(i)).getDetails() +
							" price : " + db.get(initializeCatalog().get(i)).getPrice() + " euro\n"
								);
					file.flush();
					file.close();
					System.out.println("Please check file 'ticket.txt'");
				}
			}
		} else {
			System.out.println("Please search for another :)!");
		}

		
	}
	
}
