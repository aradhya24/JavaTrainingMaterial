package SRP.iot_smarthomesystem;

public class Device {
    private String deviceId;
    private String userId;
    private String status;
    
    
    public Device() {
	}
    
    
	public Device(String deviceId, String userId, String status) {
		super();
		this.deviceId = deviceId;
		this.userId = userId;
		this.status = status;
	}
	public String getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
    
    
    
}
