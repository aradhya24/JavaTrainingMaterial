package ISP.worker;

public class Robot implements IWorkable {

	@Override
	public void start() {
		System.out.println("Robot Started Working....");
	}

	@Override
	public void stop() {
        System.out.println("Robot stoped working....");
	}

}
