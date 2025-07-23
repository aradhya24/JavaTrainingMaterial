package ISP.industrialiotmonitoring;

public class SimplePassiveSensor implements IReadableSensors {

	@Override
	public double getReading() {
		return 24.4;
	}

}
