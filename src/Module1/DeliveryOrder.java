package Module1;

import java.time.LocalDateTime;

public class DeliveryOrder {
    private String orderId;
    private String businessClientId;
    private LocalDateTime orderCreationTimestamp;
    private OrderType orderType;
    private LocalDateTime pickupTimestamp;
    private Location pickupLocation;
    private Location deliverLocation;
    private LocalDateTime deliveryTimestamp;
    private String endCustomerName;
    private String endCustomerAddress;



    public DeliveryOrder() {

    }

    public String getOrderId() {
        return orderId;
    }

    public String getBusinessClientId() {
        return businessClientId;
    }

    public LocalDateTime getOrderCreationTimestamp() {
        return orderCreationTimestamp;
    }

    public OrderType getOrderType() {
        return orderType;
    }

    public LocalDateTime getPickupTimestamp() {
        return pickupTimestamp;
    }

    public Location getPickupLocation() {
        return pickupLocation;
    }

    public Location getDeliverLocation() {
        return deliverLocation;
    }

    public LocalDateTime getDeliveryTimestamp() {
        return deliveryTimestamp;
    }

    public String getEndCustomerName() {
        return endCustomerName;
    }
    public String getEndCustomerAddress() {
        return endCustomerAddress;
    }

        //Setter Methods
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setBusinessClientId(String businessClientId) {
        this.businessClientId = businessClientId;
    }

    public void setOrderCreationTimestamp(LocalDateTime orderCreationTimestamp) {
        this.orderCreationTimestamp = orderCreationTimestamp;
    }

    public void setOrderType(OrderType orderType) {
        this.orderType = orderType;
    }

    public void setPickupTimestamp(LocalDateTime pickupTimestamp) {
        this.pickupTimestamp = pickupTimestamp;
    }
    public void setPickupLocation(Location pickupLocation) {
        this.pickupLocation = pickupLocation;
    }

    public void setDeliveryTimestamp(LocalDateTime deliveryTimestamp) {
        this.deliveryTimestamp = deliveryTimestamp;
    }

    public void setEndCustomerName(String endCustomerName) {
        this.endCustomerName = endCustomerName;
    }

    public void setEndCustomerAddress(String endCustomerAddress) {
        this.endCustomerAddress = endCustomerAddress;
    }


}
