package SRP.iot_smarthomesystem;

public class DeviceConfigurator {

	public void configureDevice(Device device, String newStatus) {
		device.setStatus(newStatus);
		System.out.println("Device " + device.getDeviceId() + " configured to status: " + device.getStatus());
	}
}
