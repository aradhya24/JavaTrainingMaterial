package DIP.database;

public class PostgresSql implements IDatabase{

	@Override
	public void connect() {
		System.out.println("Postgres Sql connected....");
	}

}
