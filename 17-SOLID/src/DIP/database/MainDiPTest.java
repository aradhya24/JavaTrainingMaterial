package DIP.database;

public class MainDiPTest {
     
	public static void main(String[] args) {
		ApplicationDIP app1 = new ApplicationDIP(new MySqlDatabase());
		app1.start();
	}
}
