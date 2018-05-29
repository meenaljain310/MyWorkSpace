package demo.SpringData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service(value="service")
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private EmployeeRepo repo;
	@org.springframework.transaction.annotation.Transactional
	public Employee createEmployee(Employee e) {
		Employee e1= repo.save(e);
		return e1;
	}
	@org.springframework.transaction.annotation.Transactional
	public Employee findEmployee(int id) {
		return repo.findById(id);
	}

}
