package demo.BaseAppAnotation;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import demo.beans.Customer;
import demo.repo.WalletRepoImp;
import demo.service.WalletServiceImp;


public class App 
{
	public static void main( String[] args )
	{
		//	Map<String,Customer> data= new HashMap<String, Customer>();
		// WalletRepoImp repo = new WalletRepoImp(data);
		//	WalletServiceImp service= new WalletServiceImp(repo);
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("demo/BaseAppAnotation/beanconfig.xml");
		WalletServiceImp service = ctx.getBean("service", WalletServiceImp.class);
		service.createAccount("Meenal", "9649658180", 9000);
		System.out.println(service.showBalance("9649658180"));
		service.createAccount("harisai ", "7702508656", 1000);
		System.out.println(service.showBalance("7702508656"));
		service.createAccount("ramteja", "1234567890", 6000);
		System.out.println(service.showBalance("1234567890"));
		service.withdrawal("7702508656",700);
		System.out.println(service.showBalance("7702508656"));
		service.depositBalance("7702508656",900);
		System.out.println(service.showBalance("7702508656"));

	}
}
