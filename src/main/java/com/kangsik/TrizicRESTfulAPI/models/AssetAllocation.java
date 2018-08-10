package com.kangsik.trizicRESTfulAPI.model;



public class AssetAllocation {

    private String symbol;
    private int percentage;

    public AssetAllocation(String symbol, int percentage) {
        this.symbol = symbol;
        this.percentage = percentage;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }
}
