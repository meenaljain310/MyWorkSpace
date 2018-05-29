package demo.service;
import demo.beans.*;


public interface WalletService 
{
		public Customer createAccount(String name,String mobileNumber,float balance);
		public Customer showBalance(String mobileNumber);
		public boolean depositBalance(String mobileNumber,float amount);
		public boolean withdrawal(String mobileNumber,float amount);
}
