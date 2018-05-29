package demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import demo.beans.Customer;
import demo.beans.Wallet;
import demo.repo.WalletRepo;
@Service(value="service")
public class WalletServiceIMPL implements WalletService
{
	@Autowired
	private WalletRepo repo;
	public WalletServiceIMPL(WalletRepo repo){
		this.repo = repo;
	}
	@Transactional
	public Customer createAccount(Customer c) {
		repo.save(c);
		return c;
	}

	public Customer showBalance(int id) {
		Customer c= repo.findById(id);
		return c;
	}
	@Transactional
	public boolean deposit(int id, float amount) {
		Customer c= repo.findById(id);
		Wallet w= c.getWallet();
		w.setBalance(w.getBalance()+amount);
		return true;
	}
	@Transactional
	public boolean withdraw(int id, float amount) {
		Customer c= repo.findById(id);
		Wallet w= c.getWallet();
		if(w.getBalance()>amount)
		{
			w.setBalance(w.getBalance()-amount);

		}
		return false;
	}


}
