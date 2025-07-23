package SRP.healthcare;

import java.util.Iterator;

public class PrintPatientRecord {
     
	public void printRecord(PatientRecord patientRecord) {
		
		System.out.println("Name : " + patientRecord.getName());
		System.out.println("Age : " + patientRecord.getAge());
		System.out.println("email : " + patientRecord.getEmail());
		System.out.println("Assigned Dr : " + patientRecord.getAssignedDr());
		
	}
}
