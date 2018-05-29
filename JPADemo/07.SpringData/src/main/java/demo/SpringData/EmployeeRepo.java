package demo.SpringData;

import org.springframework.data.annotation.QueryAnnotation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{
	
	@Query(value="select e from Employee e JOIN FETCH e.dept1 where e.id=?1")
	public Employee findById(int id);
	

}
