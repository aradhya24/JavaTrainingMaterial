package ISP.worker;

public class WorkerTest {

	public static void main(String[] args) {
        
		IWorker loader = new Loader();
		loader.start();
		loader.eat();
		loader.rest();
		loader.stop();
		
		IWorkable robot = new Robot();
		robot.start();
		robot.stop();
	}

}
