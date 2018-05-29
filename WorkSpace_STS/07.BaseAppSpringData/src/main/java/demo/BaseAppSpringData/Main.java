package demo.BaseAppSpringData;


import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.support.GenericXmlApplicationContext;

import demo.beans.Customer;
import demo.beans.Wallet;
import demo.repo.WalletRepo;

import demo.service.WalletService;
import demo.service.WalletServiceIMPL;

public class Main {

	public static void main(String[] args) {


	/*	AnnotationConfigApplicationContext acx=new AnnotationConfigApplicationContext(Config.class);
		

		WalletService walletService= acx.getBean("service",WalletServiceIMPL.class);*/
		
		
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("beanconfig.xml");
	    WalletService service = ctx.getBean("service",WalletService.class);
	    
	    
		Customer c = new Customer(1, "Meenal","9649658180");
		Wallet w = new Wallet(1,5000F);
		c.setWallet(w);
		service.createAccount(c);
		System.out.println(c);
	
	}
}
