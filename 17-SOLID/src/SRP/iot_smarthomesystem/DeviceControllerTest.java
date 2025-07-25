package SRP.iot_smarthomesystem;

public class DeviceControllerTest {
	public static void main(String[] args) {
		Device device = new Device("D123", "user456", "OFF");

		DeviceConfigurator configurator = new DeviceConfigurator();
		configurator.configureDevice(device, "ON");

		ActivityLogger logger = new ActivityLogger();
		logger.log("Device " + device.getDeviceId() + " status changed to " + device.getStatus());

		ApiService apiService = new ApiService();
		apiService.sendToCloud(device);

		UserAlertService alertService = new UserAlertService();
		alertService.sendAlert(device.getUserId(), "Your device is now " + device.getStatus());
	}
}
