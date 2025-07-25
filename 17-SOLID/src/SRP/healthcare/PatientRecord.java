package SRP.healthcare;

public class PatientRecord {
	
	private String name;
	private Integer age;
	private String assignedDr;
	private String email;

	public PatientRecord() {
	}
	
	public PatientRecord(String name, Integer age, String assignedDr , String email) {
		this.name = name;
		this.age = age;
		this.assignedDr = assignedDr;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getAssignedDr() {
		return assignedDr;
	}

	public void setAssignedDr(String assignedDr) {
		this.assignedDr = assignedDr;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}