package demo.repo;

import java.util.Map;

import demo.beans.Customer;
//@Repository

public class WalletRepoImp implements WalletRepo 
{
	//@Resource (name="map")
	private Map<String,Customer> data;
	
	
	
	
	
	
	public WalletRepoImp(Map<String, Customer> data) 
	{
		this.data = data;
	}

	public boolean save(Customer c)
	{
		data.put(c.getMobileNumber(),c);
		return true;
	}

	public Customer findOne(String mobileNumber)
	{
		return( data.get(mobileNumber));
	}
	

}
