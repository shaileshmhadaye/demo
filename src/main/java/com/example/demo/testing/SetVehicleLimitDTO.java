package com.example.demo.testing;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SetVehicleLimitDTO {

    private String customerId;
    private String walletId;
    private List<VehicleUsageLimit> vehicleUsageLimit;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getWalletId() {
        return walletId;
    }

    public void setWalletId(String walletId) {
        this.walletId = walletId;
    }

    public List<VehicleUsageLimit> getVehicleUsageLimit() {
        return vehicleUsageLimit;
    }

    public void setVehicleUsageLimit(List<VehicleUsageLimit> vehicleUsageLimit) {
        this.vehicleUsageLimit = vehicleUsageLimit;
    }

    @Override
    public String toString() {
        return "SetVehicleLimitDTO{" +
                "customerId='" + customerId + '\'' +
                ", walletId='" + walletId + '\'' +
                ", vehicleUsageLimits=" + vehicleUsageLimit +
                '}';
    }
}
