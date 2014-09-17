package MainPackage;

import java.util.Date;
import java.io.*;

public class Account {

	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated = new Date();

	// no-arg constructor
	public Account() {

	}

	// constructor
	public Account(int id, double balance, double annualInterestRate) {
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;

	}

	// accessors
	public int getid() {
		return id;
	}

	public double getbalance() {
		return balance;
	}

	public double getannualInterestRate() {
		return annualInterestRate;
	}

	// mutators
	public void setid(int id) {
		this.id = id;
	}

	public void setbalance(double balance) {
		this.balance = balance;
	}

	public void setannualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate / 100;
	}

	// accessor for dateCreated
	public Date getdateCreated() {
		return dateCreated;
	}

	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) throws InsufficientFundsException {
		if (amount <= balance) {
			balance -= amount;
		}

		else {
			double amountneeded = amount - balance;
			throw new InsufficientFundsException(amountneeded);
		}

	}

}
