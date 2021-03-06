package demo.SpringData;


import javax.persistence.*;
@Entity
public class Employee {

	@Id private int id;
	private String name;
	private int salary;
	@OneToOne(cascade=CascadeType.ALL)
	private Address address;
	@ManyToOne(cascade=CascadeType.ALL)
	private Department dept1;
	

	public Address getAddress() {
		return address;
	}

	public Employee(int id, String name, int salary, Address address, Department dept1) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
		this.dept1 = dept1;
	}

	public Department getDept1() {
		return dept1;
	}


	public void setDept1(Department dept1) {
		this.dept1 = dept1;
	}


	public void setAddress(Address address) {
		this.address = address;
	}

	public Employee(){}

	public Employee(int id){
		this.id=id;	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary
				+ "]";
	}
	
}
