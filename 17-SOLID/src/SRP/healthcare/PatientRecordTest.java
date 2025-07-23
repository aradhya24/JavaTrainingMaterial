package SRP.healthcare;

public class PatientRecordTest {

	public static void main(String[] args) {

		PatientRecord patientRecord = new StoringDataService().storeData("Aradhya", 21, "Amar Patil",
				"dangearadhya6@gmail.com");

		SendEmailNotification sendEmailNotification = new SendEmailNotification();
		sendEmailNotification.sendEmail();

		PrintPatientRecord printPatientRecord = new PrintPatientRecord();
		printPatientRecord.printRecord(patientRecord);

	}

}
