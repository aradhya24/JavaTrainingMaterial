package com.aurionpro.hospital_system_mgmt;

public abstract class HospitalStaff {
	protected Long staffId;
	protected String name;
	Department department;

	public HospitalStaff(Long staffId, String name, Department department) {
		super();
		this.staffId = staffId;
		this.name = name;
		this.department = department;
	}

	abstract void work();

	public String toString() {
		return ("Name : " + name + "\nStaff id : " + staffId + "\nDepartment :" + department);
	}
}
