package MainPackage;

public class Test {
	
	public static void main(String[] args){
		
		Account acct = new Account (1122, 20000,4.5);
		
		acct.setid(1122);
		acct.setbalance(20000);
		acct.setannualInterestRate(4.5);
		
		
		System.out.println("Account ID: " + +acct.getid());
		System.out.println("The account balance is: $" + +acct.getbalance());
		System.out.println("The annual interest rate is: " + acct.getannualInterestRate());
		acct.deposit(3000);
		System.out.println("After the deposit of $3000, the account balance is: $" +acct.getbalance());
		
		try {
			acct.withdraw(2500);
			System.out.println("After the withdraw of $2500, the account balance is: $" + +acct.getbalance());
			System.out.println("The monthly interest is: $" + +acct.getbalance() * acct.getMonthlyInterestRate());
			System.out.println("The account was created on: " + acct.getdateCreated());
				
			acct.withdraw(25000);

		} catch (InsufficientFundsException e) {
			System.out.println("Sorry you are unable to withdraw $25,000. You are short: $" + e.getAmount());
			e.printStackTrace();
		}
		
		
		
	
	}

}
