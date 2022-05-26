package com.example.demo.testing;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class VehicleUsageLimit{

    private String vehicleId;
    private String usageLimit;
    private String minLimit;
    private String usageLimitFlag;

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getUsageLimit() {
        return usageLimit;
    }

    public void setUsageLimit(String usageLimit) {
        this.usageLimit = usageLimit;
    }

    public String getMinLimit() {
        return minLimit;
    }

    public void setMinLimit(String minLimit) {
        this.minLimit = minLimit;
    }

    public String getUsageLimitFlag() {
        return usageLimitFlag;
    }

    public void setUsageLimitFlag(String usageLimitFlag) {
        this.usageLimitFlag = usageLimitFlag;
    }

    @Override
    public String toString() {
        return "VehicleUsageLimit{" +
                "vehicleId='" + vehicleId + '\'' +
                ", usageLimit='" + usageLimit + '\'' +
                ", minLimit='" + minLimit + '\'' +
                ", usageLimitFlag='" + usageLimitFlag + '\'' +
                '}';
    }
}
