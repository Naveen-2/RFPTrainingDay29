package com;

public class CensusCSV {
    @CsvBindByName(column = "State")
    private String state;

    @CsvBindByName(column = "Population")
    private long pop;

    @CsvBindByName(column = "AreaInSqKm")
    private int area;

    @CsvBindByName(column = "DensityPerSqKm")
    private int density;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public long getPop() {
        return pop;
    }

    public void setPop(long pop) {
        this.pop = pop;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getDensity() {
        return density;
    }

    public void setDensity(int density) {
        this.density = density;
    }

    @Override
    public String toString() {
        return "IndiaStateCensus [ State = " + state + " , Population = " + pop + " , AreaInSqKm = " + area
                + " , density = " + density + " ]";
    }
}
