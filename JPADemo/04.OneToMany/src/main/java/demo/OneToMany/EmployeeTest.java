package demo.OneToMany;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;


public class EmployeeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
		
		EntityManager em = emf.createEntityManager();
		EmployeeService service = new EmployeeService(em);
		em.getTransaction().begin();
		Address address = new Address();
		address.setId(123);
		address.setLine("Talwade");
		Department dep = new Department();
		dep.setId(1);
		dep.setName("java");
		Department dep1 = new Department();
		dep.setId(2);
		dep.setName(".Net");
		List<Employee> employee1 = new ArrayList<Employee>();
		Employee emp1 = service.createEmployee(50948, "Sagar", 60000,address);
		Employee emp2 = service.createEmployee(50949, "Abhishek",30000,address);
		Employee emp3 = service.createEmployee(50950, "Hari", 20000,address);
		Employee emp4 = service.createEmployee(50951, "Haneef", 10000,address);
		employee1.add(emp1);
		employee1.add(emp2);
		dep.setEmployees(employee1);
		List<Employee> employee2 = new ArrayList<Employee>();
		employee2.add(emp3);
		employee2.add(emp4);
		dep.setEmployees(employee2);
		
		em.getTransaction().commit();
		/*System.out.println("Persisted "+emp);
		
		emp= service.findEmployee(50948);
		System.out.println("Found "+emp);
		
		em.getTransaction().begin();
		emp =service.raiseEmployeeSalary(50948, 20000);
		em.getTransaction().commit();
		System.out.println("Updated "+emp);*/
		em.close();
		emf.close();
	}

}
