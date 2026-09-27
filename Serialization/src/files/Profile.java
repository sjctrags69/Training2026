package files;

import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("profile")
public class Profile {
	private Integer id;
	private String firstname;
	private String lastname;
	private Double salary;
	
	public Profile() {
		
	}
	
	public Profile(Integer id, String firstname, String lastname, Double salary) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.salary = salary;
	}
	
	
	public Integer getId() {
		return id;
	}
	public String getFirstname() {
		return firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public Double getSalary() {
		return salary;
	}
	
	
}
