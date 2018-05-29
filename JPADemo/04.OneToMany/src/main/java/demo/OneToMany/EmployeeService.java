package demo.OneToMany;
import javax.persistence.*;
import java.util.List;
public class EmployeeService {

	protected EntityManager em;
	
	public EmployeeService(EntityManager em){
		this.em=em;
	}
	
	public Employee createEmployee(int id,String name,int salary,Address address){
		
		Employee emp = new Employee(id);
		emp.setName(name);
		emp.setSalary(salary);
		emp.setAddress(address);
	/*	emp.setDepartment(department);*/
		em.persist(emp);
		return emp;
	}
	public Department createDepartment(int id,String name)
	{
		Department dep=new Department();
		dep.setId(id);
		dep.setName(name);
		return dep;
		
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


public Department findDepartment(int id)
{
	return em.find(Department.class, id);		
}
public List<Employee> setEmpToDep(int id, List<Employee> employees)
{
	Department dep = findDepartment(id);
	dep.setEmployees(employees);
	em.persist(dep);
	return employees;
	
}
}