package com.covid.covidapp.models;

public class LocationStats {

    private String state;
    private String country;
    private int lastestTotalCases;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getLastestTotalCases() {
        return lastestTotalCases;
    }

    public void setLastestTotalCases(int lastestTotalCases) {
        this.lastestTotalCases = lastestTotalCases;
    }
}
