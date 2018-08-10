package com.kangsik.TrizicRESTfulAPI.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;


import java.util.ArrayList;
import java.util.List;
@Document(collection = "Portfolios")
public class Portfolio {
    @Id
    private String id;
    private String name;
    private String description;
    private int cashHoldingPercentage;
    private int driftPercentage;
    private String createdOn;
    private String modelType;
    private String rebalanceFrequency;
    private String advisorId;
    private List<AssetAllocation> assetAllocations;

    public Portfolio(String name, String description, int cashHoldingPercentage, int driftPercentage, String createdOn, String modelType, String rebalanceFrequency, String advisorId, List<AssetAllocation> assetAllocations) {
        this.name = name;
        this.description = description;
        this.cashHoldingPercentage = cashHoldingPercentage;
        this.driftPercentage = driftPercentage;
        this.createdOn = createdOn;
        this.modelType = modelType;
        this.rebalanceFrequency = rebalanceFrequency;
        this.advisorId = advisorId;
        this.assetAllocations = assetAllocations;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCashHoldingPercentage() {
        return cashHoldingPercentage;
    }

    public void setCashHoldingPercentage(int cashHoldingPercentage) {
        this.cashHoldingPercentage = cashHoldingPercentage;
    }

    public int getDriftPercentage() {
        return driftPercentage;
    }

    public void setDriftPercentage(int driftPercentage) {
        this.driftPercentage = driftPercentage;
    }

    public String getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }

    public String getModelType() {
        return modelType;
    }

    public void setModelType(String modelType) {
        this.modelType = modelType;
    }

    public String getRebalanceFrequency() {
        return rebalanceFrequency;
    }

    public void setRebalanceFrequency(String rebalanceFrequency) {
        this.rebalanceFrequency = rebalanceFrequency;
    }

    public String getAdvisorId() {
        return advisorId;
    }

    public void setAdvisorId(String advisorId) {
        this.advisorId = advisorId;
    }

    public List<AssetAllocation> getAssetAllocations() {
        return assetAllocations;
    }

    public void setAssetAllocations(List<AssetAllocation> assetAllocations) {
        this.assetAllocations = assetAllocations;
    }
}
