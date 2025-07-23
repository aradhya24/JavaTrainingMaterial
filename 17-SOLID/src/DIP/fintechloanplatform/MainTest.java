package DIP.fintechloanplatform;


public class MainTest {
   public static void main(String[] args) {
	   
	   ApplicationDIP creditScoreApi = new ApplicationDIP(new CreditScoreApi());
	   creditScoreApi.fetch();
	   
	   ApplicationDIP documentVerifies = new ApplicationDIP(new DocumentVerifierApi());
	   documentVerifies.fetch();
	   
}
}
