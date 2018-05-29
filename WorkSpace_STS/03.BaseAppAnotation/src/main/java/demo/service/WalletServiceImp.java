package demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import demo.beans.Customer;
import demo.beans.Wallet;
import demo.repo.*;
@Service (value="service")
public class WalletServiceImp implements WalletService{
	@Autowired
	WalletRepo repo;
/*@Autowired
	public WalletServiceImp(WalletRepoImp repo) {
		super();
		this.repo = repo;
	}*/

	public Customer createAccount(String name, String mobileNumber, float balance) 
	{
		Customer customer=new Customer();
		Wallet w1 = new Wallet();
		w1.setBalance(balance);
		customer.setName(name);
		customer.setMobileNumber(mobileNumber);
		customer.setWallet(w1);
		repo.save(customer);
		System.out.println("Customer is created");
		return customer;
	}

	public Customer showBalance(String mobileNumber)
	{
		return  repo.findOne(mobileNumber);
		
		
	}
	public boolean withdrawal(String mobileNumber, float amount)
	{
		Customer c = repo.findOne( mobileNumber);
		Wallet w1 = c.getWallet();
		if(w1.getBalance()> amount)
			w1.setBalance(w1.getBalance()-amount);
		else
		System.out.println("Withdrawal is not done");
		return false;
	}

	public boolean depositBalance(String mobileNumber, float amount) 
	{
		Customer c = repo.findOne( mobileNumber);
		Wallet w1 = c.getWallet();
		w1.setBalance(w1.getBalance()+amount);
		return true;
	}

	
	


}
