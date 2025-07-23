package SRP.healthcare;

public class StoringDataService {
	
     PatientRecord patientRecord = new PatientRecord();
     
     public PatientRecord storeData(String name , Integer age , String assignedDr , String email) {
    	 
    	 patientRecord.setName(name);
    	 patientRecord.setAge(age);
    	 patientRecord.setAssignedDr(assignedDr);
    	 patientRecord.setEmail(email);	 
    	 
    	 return patientRecord;
     }
}
