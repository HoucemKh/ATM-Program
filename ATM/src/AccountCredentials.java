import java.util.Scanner;

 class AccountCredentials {
	int account;
	int password;
	double checkingbalance=0.0;
	double savingbalance=0.0;
	double totalchecking=0.0;
	double totalsaving=0.0;
	Scanner sc = new Scanner(System.in);
	public int getAccount() {
		return account;
	}
	
	public int getPassword() {
		return password;
	}
	
	public void setAccount(int account) {
		this.account=account;
	}
	
	public void setPassword(int password) {
		this.password= password;
	}
	
	public void viewBalance(int accountType) {
		switch(accountType) {
		case 1: 
			System.out.println("Your Checking balance is:" + totalchecking);
			break;
		case 2: 
			System.out.println("Your Saving balance is:" + totalsaving);
			break;
		}
	}
	
	public void depositFunds(int accountType) {
		System.out.println("Deposit amount is:");
		double deposit = sc.nextDouble();
		
		if(accountType ==1) {
			 totalchecking = deposit+ checkingbalance;
			 System.out.println("New Checking Balance:" + totalchecking );
		}
		else {
		 totalsaving = deposit+ savingbalance;
		 System.out.println("New Saving Balance:" + totalsaving );
		}
	}
	
	
	public void withdrawFunds(int accountType) {
		System.out.println("Withdrawal amount is:");
		double withdrawal = sc.nextDouble();
		
		if(accountType == 1) {
			if(checkingbalance-withdrawal>0) {
				checkingbalance =  totalchecking - withdrawal ;
			System.out.println("New Checking Balance:" + checkingbalance );
			
			}
			else {
				System.out.println("Insufficient Checking Balance" );
			}
		}
		
		else {
			if(savingbalance- withdrawal>0) {
				savingbalance =  totalsaving - withdrawal ;
				System.out.println("New Saving Balance:" + savingbalance );
				
				}
				else {
					System.out.println("Insufficient Saving Balance" );
				}
		}
		
	}
	
	public void exit() {
		System.exit(0);
	}
	
}
