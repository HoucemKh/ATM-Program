import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.io.IOException;

public class OptionMenu extends AccountCredentials {

	HashMap<Integer, Integer> hash = new HashMap<>();
	Scanner sc = new Scanner(System.in);
	AccountCredentials ac = new AccountCredentials();
	public void login() throws IOException {
	
		boolean log = false;
		do {
		try {
			
			hash.put(123456, 1234);
			hash.put(456789, 44567);
			
			System.out.println("Enter your customer number:");
			ac.setAccount(sc.nextInt());
			System.out.println("Enter your pin number:");
			ac.setPassword(sc.nextInt());
		
			}
			catch (Exception e) {
				System.out.println("Invalid Characters. Only numbers are allowed");
				log = true;
			}
			
			for(Map.Entry<Integer,Integer> entry :hash.entrySet()) {
				if(entry.getKey()==ac.getAccount() && entry.getValue()==ac.getPassword()) {
					System.out.println("Succes:");
					log = true;
					
				}
				
			}
		}while(log==false);
		}
	  
	public void getAccountType() {
		
		System.out.println("Select the account you want to access:");
		System.out.println("Type 1 - Checking-account");
		System.out.println("Type 2 - Saving-account");
		System.out.println("Type 3 - Exit");
		System.out.println("Choice:");
		int choice = sc.nextInt();
		boolean end = false;
		do {
		switch (choice) {
		
		case 1: 
			getchecking(choice);
			getAccountType();
			break;
		case 2:
			getchecking(choice);
			getAccountType();
			break;
		case 3:
			ac.exit();
			end =true;
		default:
			System.out.println("Incorrect choice:");
			System.exit(0);

		}
	}	while(end==false);
	}
	
	public void getchecking(int choice) {
		 System.out.println("Type 1 - View Balance");
		 System.out.println("Type 2 - Withdraw Funds");
		 System.out.println("Type 3 - Deposit Funds");
		 System.out.println("Type 4 - Exit");
		 System.out.println("Choice:");
		 int choice1 = sc.nextInt();
		 
		 switch (choice1) {
		 
		 case 1:
			 ac.viewBalance(choice);
			 break;
		 case 2:
			 ac.withdrawFunds(choice);
			 break;
		 case 3:
			 ac.depositFunds(choice);
			 break;
		 case 4:
			 ac.exit();
		 default:
			 System.out.println("Incorrect choice:");
			 System.exit(0);
		 }
		 
	}
	}

