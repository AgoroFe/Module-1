package Module1;

import java.util.ArrayList;
import java.util.List;

public class BusinessClient {
    private String businessClientId;
    private String businessType;
    private List <Location> pickupLocation = new ArrayList<>();


    public BusinessClient(String businessClientId, String businessType, List<Location> pickupLocation) {
        this.businessClientId = businessClientId;
        this.businessType = businessType;
        this.pickupLocation = pickupLocation;

    }

    public String getBusinessClientId() {

        return businessClientId;
    }

    public void setBusinessClientId(String businessClientId) {
        this.businessClientId = businessClientId;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public List<Location> getPickupLocation() {
        return pickupLocation;
    }
    public void setPickupLocation(List<Location> pickupLocation) {
        this.pickupLocation = pickupLocation;
    }



}
