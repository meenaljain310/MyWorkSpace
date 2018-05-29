package demo.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Wallet {

	@Id
	@GeneratedValue
	private int id;
	private float balance;

	
	public Wallet(float balance) {
		this.balance = balance;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "balance=" + balance;
	}
}
