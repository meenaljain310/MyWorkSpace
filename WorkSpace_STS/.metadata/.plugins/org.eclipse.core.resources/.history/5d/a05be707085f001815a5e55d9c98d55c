package demo.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import demo.beans.Customer;
import demo.repo.WalletRepo;
import demo.repo.WalletRepoIMPL;
import demo.service.WalletService;
import demo.service.WalletServiceIMPL;

public class Main {

	public static void main(String[] args) {


	/*	AnnotationConfigApplicationContext acx=new AnnotationConfigApplicationContext(Config.class);


		WalletService walletService= acx.getBean("service",WalletServiceIMPL.class);*/
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("h");
		
		EntityManager em=emf.createEntityManager();
		
		WalletRepo repo= new WalletRepoIMPL(em);
		
		WalletService walletService= new WalletServiceIMPL(repo);
		

		//creating 1st account
		
		Customer c1=walletService.createAccount("Teeena","888888888",5000.0f);
		System.out.println("persisted"+c1);
		
		//creating 2nd account
		
		Customer c2=walletService.createAccount("Meeena","788888888",6000.0f);
		System.out.println("persisted"+c2);
		
		//creating 3rd account
		
		Customer c3=walletService.createAccount("Reeena","688888888",7000.0f);
		System.out.println("persisted"+c3);

		
		
	/*	System.out.println( walletService.showBalance("888888888"));
		System.out.println();
		
		
		System.out.println(walletService.showBalance("788888888"));
		System.out.println();
		System.out.println(walletService.showBalance("688888888"));
		System.out.println();
		*/
	

		//depositing to one account and showing balance
		System.out.println(walletService.deposit("888888888", 5000.00f));
		
		System.out.println( walletService.showBalance("888888888"));
	
		System.out.println(walletService.withdraw("888888888", 1000.00f));
		System.out.println( walletService.showBalance("888888888"));

	}
}
