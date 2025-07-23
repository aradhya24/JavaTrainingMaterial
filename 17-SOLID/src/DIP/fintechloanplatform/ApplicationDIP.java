package DIP.fintechloanplatform;

public class ApplicationDIP {
      private ILoanProcessor loanProcessor;

	public ApplicationDIP(ILoanProcessor loanProcessor) {
		this.loanProcessor = loanProcessor;
	}
      
    public void fetch() {
    	loanProcessor.getThirdPartyApi();
    }
}
