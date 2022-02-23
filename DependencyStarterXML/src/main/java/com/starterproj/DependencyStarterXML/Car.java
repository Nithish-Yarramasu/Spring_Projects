package com.starterproj.DependencyStarterXML;

public class Car {
    private String name;
    private int cost;
    private int serialNo;
    private Person Driver;

    public Car() {
    }



    public Person getDriver() {
        return Driver;
    }

    public void getDriverName(){
       Driver.getDefaultName();
    }

    public void setDriver(Person driver) {
        Driver = driver;
    }



    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(int serialNo) {
        this.serialNo = serialNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
