package demo.repo;
import demo.beans.*;


public interface WalletRepo {

	boolean save(Customer c);
	Customer findOne(String mobileNumber);
}
