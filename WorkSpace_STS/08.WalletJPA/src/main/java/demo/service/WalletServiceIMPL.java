package demo.service;

import demo.beans.Customer;
import demo.beans.Wallet;
import demo.repo.WalletRepo;

public class WalletServiceIMPL implements WalletService
{
	private WalletRepo repo;
	public WalletServiceIMPL(WalletRepo repo){
		this.repo = repo;
	}

	@Override
	public Customer createAccount(String name, String mobileNumber, float amount) {
		Wallet w = new Wallet(amount);
		Customer c = new Customer(name, mobileNumber, w);
		repo.save(c);
		return c;
	}

	@Override
	public Customer showBalance(String mobileNumber) {
		Customer c = repo.findOne(mobileNumber);
		return c;
	}

	@Override
	public boolean deposit(String mobileNumber, float amount) {
		// TODO Auto-generated method stub
		Customer c = repo.findOne(mobileNumber);
		Wallet w= c.getWallet();
		float currentBalance=w.getBalance();
		float updatedBalance = currentBalance + amount;
		
		 repo.update(mobileNumber,updatedBalance);
		
		c.setWallet(w);
		w.setBalance(updatedBalance);
		
		return true;
	}

	@Override
	public boolean withdraw(String mobileNumber, float amount) {
		Customer c = repo.findOne(mobileNumber);
		Wallet w= c.getWallet();

		float currentBalance=w.getBalance();

		if(currentBalance > amount)
		{
			float updatedBalance = currentBalance - amount;
			
			 repo.update(mobileNumber,updatedBalance);
			 
			 c.setWallet(w);
			w.setBalance(updatedBalance);
			
			return true;
		}
		return false;
	}

}
