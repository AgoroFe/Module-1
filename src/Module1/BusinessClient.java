package Module1;

public class BusinessClient {
    private String businessClientId;
    private String businessType;
    private String pickupLocation;
    private boolean loggedIn = false;

    public BusinessClient(String businessClientId, String businessType, String pickupLocation, boolean loggedIn) {
        this.businessClientId = businessClientId;
        this.businessType = businessType;
        this.pickupLocation = pickupLocation;
        this.loggedIn = loggedIn;
    }


    public boolean isLoggedIn() {
        return loggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }
}
