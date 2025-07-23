package DIP.database;

public class ApplicationDIP {
     private IDatabase database;
     
     public ApplicationDIP(IDatabase database) {
    	 this.database = database;
     }
     
     public void start() {
    	 database.connect();
     }
}
