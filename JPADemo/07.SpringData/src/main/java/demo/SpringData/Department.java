package demo.SpringData;

import javax.persistence.*;
@Entity
public class Department {
	@Id
	private int Id;
	private String dept;
	
	
	public int getId() {
		return Id;
	}
	public Department(int id, String dept) {
		super();
		Id = id;
		this.dept = dept;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	}
	
	

