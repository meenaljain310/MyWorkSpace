package demo.service;

import demo.beans.Customer;

public interface WalletService {

	public Customer createAccount(String name,String mobileNumber,float amount);
	public Customer showBalance(String mobileNumber);
	public boolean deposit(String mobileNumber,float amount);
	public boolean withdraw(String mobileNumber,float amount);
	
}
