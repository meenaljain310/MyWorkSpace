package demo.SpringJPA;


import org.springframework.context.support.GenericXmlApplicationContext;


public class EmployeeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
	/*	EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
		
		EntityManager em = emf.createEntityManager();
		EmployeeService service = new EmployeeService(em);*/
		GenericXmlApplicationContext ctx= new GenericXmlApplicationContext("beanconfig.xml");
		EmployeeService service =ctx.getBean("service",EmployeeService.class);
		/*em.getTransaction().begin();*/
		Address address = new Address();
		address.setId(123);
		address.setLine("Talwade");
		Department department = new Department();
		department.setId(1);
		department.setName("java");
		Employee emp = service.createEmployee(50948, "Sagar", 60000, address, department);
		/*em.getTransaction().commit();*/
		System.out.println("Persisted "+emp);
		
		emp= service.findEmployee(50948);
		System.out.println("Found "+emp);
		
		/*em.getTransaction().begin();*/
		emp =service.raiseEmployeeSalary(50948, 20000);
		/*em.getTransaction().commit();*/
		System.out.println("Updated "+emp);
		/*em.close();
		emf.close();*/
		ctx.close();
	}

}
