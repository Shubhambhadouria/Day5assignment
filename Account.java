package com.masai;

public class Account {

	int accountId; 
	String accountType; 
	int balance;
	
	public Account() {
		super();
	}

	public Account(int accountId, String accountType, int balance) {
		super();
		this.accountId = accountId;
		this.accountType = accountType;
		this.balance = balance;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public boolean withdraw(int amount) {
		
		if(this.balance>amount)
		{
			int currentbalanace = this.balance - amount;
			System.out.println("Balance amount after withdraw "+amount+" is: "+currentbalanace);
			return true;
		}
		else
		{
			System.out.println("Sorry!!! No enough balance");
			return false;
		}
		
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

public class AccountDetails{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1 = new Account(20089454,"Savings",5000);
		a1.withdraw(500);

	}
}
