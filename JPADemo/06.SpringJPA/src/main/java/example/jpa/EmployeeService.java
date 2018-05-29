package example.jpa;
import javax.persistence.*;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Repository(value="service")
public class EmployeeService {
    @PersistenceContext
	protected EntityManager em;
	
	/*public EmployeeService(EntityManager em){
		this.em=em;
	}
	*/
    @Transactional
	public Employee createEmployee(int id,String name,int salary,Department dept1, Address address){
		
		Employee emp = new Employee(id);
		emp.setName(name);
		emp.setSalary(salary);
		emp.setAddress(address);
		emp.setDept1(dept1);
		//emp.setDept2(dept2);
		em.merge(emp);
	//	em.persist(emp);
		return emp;
	}
	
	public void removeEmployee(int id){
		Employee emp = findEmployee(id);
		if(emp !=null){
			em.remove(emp);
		}
	}

	public Employee raiseEmployeeSalary(int id, int raise){
		Employee emp = findEmployee(id);
		if(emp !=null){
			emp.setSalary(emp.getSalary()+raise);
		}
		return emp;
	}
	
	public List<Employee> findAllEmployees(){
		TypedQuery<Employee> query = em.createQuery("Select e from Employee e",Employee.class);
		return query.getResultList();
		
	}
	public Employee findEmployee(int id) {
		// TODO Auto-generated method stub
		return em.find(Employee.class, id);
	}
}
