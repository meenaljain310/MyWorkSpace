package example.jpa;


import javax.persistence.*;

import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class EmployeeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		/*EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
		
		EntityManager em = emf.createEntityManager();
		EmployeeService service = new EmployeeService(em);*/
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("beanconfig.xml");
	    EmployeeService service = ctx.getBean("service", EmployeeService.class);
	   // ctx.refresh();
	   // EntityManager em =ctx.getBean("")
	//	em.getTransaction().begin();
	    Address address = new Address();
	    address.setId(123);
	    address.setLine("talwade");	
	    Address address1 = new Address();
	    address.setId(234);
	    address.setLine("Nigdi");	
	    Address address2 = new Address();
	    address.setId(345);
	    address.setLine("Pimpri");	
	    Address address3 = new Address();
	    address.setId(456);
	    address.setLine("Chinchwad");	
	    Address address4 = new Address();
	    address.setId(567);
	    address.setLine("talwade");	
	    Department dept1 = new Department();
	    dept1.setId(234);
	    dept1.setDept("java");
	    Employee emp = service.createEmployee(50948, "Sagar", 60000, dept1  , address);
	    Employee emp1 = service.createEmployee(50949, "Hari", 50000, dept1  , address1);
	    Employee emp2 = service.createEmployee(50949, "Haneef", 40000, dept1  , address2);
	    Employee emp3 = service.createEmployee(50949, "meenal", 50000, dept1  , address3);
	    Employee emp4 = service.createEmployee(50949, "rama", 70000, dept1  , address4);
		//em.getTransaction().commit();

		//em.close();
		ctx.close();
	}

}
