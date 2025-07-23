package SRP.iot_smarthomesystem;

public class ApiService {
     
	public void sendToCloud(Device device) {
		System.out.println("Sending device data to cloud : " + device.getDeviceId() 		+ " - " + device.getStatus());
	}
}
