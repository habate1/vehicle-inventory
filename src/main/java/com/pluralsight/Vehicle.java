package com.pluralsight;

public class Vehicle {

    /*
    create these properties

    vehicleId - a long (ex: 101121)
    makeModel - a string (ex: Ford Explorer)
    color - a string (ex: Red)
    odometerReading - an int (ex: 32775)
    price - a double (ex: 12250.00) (no Lamborghinis here!)

    make private for encapsulation. if we want ppl to have access to it, use setters/getters
     */
    private long vehicleId;
    private String makeModel;
    private String color;

    public Vehicle(long vehicleId, String makeModel, String color, int odometerReading, double price) {
        this.vehicleId = vehicleId;
        this.makeModel = makeModel;
        this.color = color;
        this.odometerReading = odometerReading;
        this.price = price;
    }

    private int odometerReading;
    private double price;


    public long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public int getOdometerReading() {
        return odometerReading;
    }

    public void setOdometerReading(int odometerReading) {
        this.odometerReading = odometerReading;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}

