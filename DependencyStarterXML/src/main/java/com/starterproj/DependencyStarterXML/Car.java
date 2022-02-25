package com.starterproj.DependencyStarterXML;
/*Bean B*/
public class Car {
    private String name="NotAssignedCaryet";
    private int cost;
    private int serialNo;

    public Car() {
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
