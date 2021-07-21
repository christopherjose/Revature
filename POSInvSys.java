import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Map;
import java.util.LinkedHashMap;


public class POSInvSys {
	
	public static void main(String[] args) {
		
		boolean loginSuccess = false;
		boolean storeOne = false;
		
		List<Map<String,String>> store001 = new ArrayList<Map<String,String>>();
		Map<String,String> store001P1 = new LinkedHashMap<String,String>();
		store001P1.put("Product Name","World's Best Mattress");
		store001P1.put("Size","Queen");
		store001P1.put("Disposition","New");
		store001P1.put("Price","1100");
		store001P1.put("Stock","34");
		store001P1.put("ATP Date","08/01/2021");
		store001.add(store001P1);
		
		//More products and stores can go here
		
		System.out.println("POS Inventory System - Store Login");
		System.out.println("----------------------------------");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Store Number: ");
		String storeNumber = scanner.nextLine();
		System.out.println("Enter Store Password: ");
		String storePassword = scanner.nextLine();
		scanner.close();
		
		if (storeNumber.equals("001")) {	
			if(storePassword.equals("Bay2015")) {
				loginSuccess = true;
				storeOne = true;
				System.out.println("");
			}	
		}
		//More store password checks can go here
		if (loginSuccess == false) {
			System.out.println("Username / Password Combination is incorrect.");
		}
		
		if (storeOne == true) {
			System.out.println("----------------------------------");
			System.out.println("Store 001 Inventory");
			System.out.println("----------------------------------");
			System.out.println(store001.get(0));
		}
		
		
		
		
		
		
	}
	
}
