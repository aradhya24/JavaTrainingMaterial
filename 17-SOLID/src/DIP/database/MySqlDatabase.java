package DIP.database;

public class MySqlDatabase implements IDatabase {

	@Override
	public void connect() {
        System.out.println("Mysql database connected...");
	}

}
