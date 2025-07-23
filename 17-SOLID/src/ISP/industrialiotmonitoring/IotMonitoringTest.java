package ISP.industrialiotmonitoring;

public class IotMonitoringTest {
     public static void main(String[] args) {
		
    	 IReadableSensors simplePassiveSensor = new SimplePassiveSensor();
    	 System.out.println("simplePassiveSensor reading : " + simplePassiveSensor.getReading());
    	 
    	 IAdvancedSensors advancedSensors = new AdvancedPassiveSensors();
    	 advancedSensors.startSelfStart();
    	 advancedSensors.resetCalibration();
    	 advancedSensors.uploadFirmware();
    	 System.out.println("advancedSensors reading : " + advancedSensors.getReading());
	}
}
