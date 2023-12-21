package Bank;
import java.io.Serializable;

import Exceptions.MaxBalance;
import Exceptions.MaxWithdraw;
/*
 * In Java, the Serializable interface is a marker interface that indicates that the objects of a class can be serialized. 
 * Serialization is the process of converting the state of an object into a byte stream, which can be easily saved to a file or sent over a network, 
 * and later deserialized to recreate the original object.
 */
public class BankAccount implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L; // Used for versioning during deserialization
	String name;
	private double balance;
	double min_balance;
	String acc_num;
	//String type;
	
	
	public BankAccount(String name, double balance, double min_balance) {
		this.name = name;
		this.balance = balance;
		this.min_balance = min_balance;
		acc_num = 10000 + (int)(Math.random()*89999) + "";
	}

	public void deposit(double amount)
	{
		balance+=amount;
	}
	
	public void withdraw(double amount) throws MaxWithdraw, MaxBalance
	{
		if((balance-amount)>=min_balance && amount<balance)
		{
			balance-=amount;
			
		}
		
		else
		{
			throw new MaxBalance("Insufficient Balance");
		}
	}
	
	public double getbalance()
	{
		return balance;
	}
	
	@Override
	public String toString() {
		return " Name: " + name + "\n Id: " + acc_num + "\n Balance: " + balance +" \nType: "+this.getClass();
	}
}
