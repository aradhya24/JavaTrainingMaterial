package SRP.iot_smarthomesystem;

public class UserAlertService {
	public void sendAlert(String userId, String message) {
		System.out.println("Alert sent to " + userId + ": " + message);
	}
}
