package ISP.industrialiotmonitoring;

public class AdvancedPassiveSensors implements IAdvancedSensors {

	@Override
	public void startSelfStart() {
		System.out.println("Self start Detected.");
		
	}

	@Override
	public void uploadFirmware() {
		System.out.println("Firmware uploaded..");
	}

	@Override
	public void resetCalibration() {
		System.out.println("Calibrate resetted sucesss.");
	}

	@Override
	public double getReading() {
		return 53.3;
	}

}
