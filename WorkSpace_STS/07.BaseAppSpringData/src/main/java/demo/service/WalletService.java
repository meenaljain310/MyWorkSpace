package demo.service;

import demo.beans.Customer;

public interface WalletService {

	public Customer createAccount(Customer c);
	public Customer showBalance(int id);
	public boolean deposit(int id ,float amount);
	public boolean withdraw(int id,float amount);
	
}
