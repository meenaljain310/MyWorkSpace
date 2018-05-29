package demo.beans;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Customer
{
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String mobileNumber;
	@OneToOne(cascade= CascadeType.ALL)
	private Wallet wallet;

	public Customer(String name, String mobileNumber, Wallet wallet) {
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.wallet = wallet;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getMobileNumber() 
	{
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber)
	{
		this.mobileNumber = mobileNumber;
	}
	public Wallet getWallet() {
		return wallet;
	}
	public void setWallet(Wallet wallet) {
		this.wallet = wallet;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", mobileNumber=" + mobileNumber + "," + wallet + "]";
	}



}
