package DIP.clouddevopsmonitoringsystem;

public class CloudProviderDIP {
	
    private IDashboardService dashboardService;

	public CloudProviderDIP(IDashboardService dashboardService) {
		this.dashboardService = dashboardService;
	}
    
    public void logs() {
    	dashboardService.getLogs();
    }
}
