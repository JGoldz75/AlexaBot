package com.company;

/**
 * Created by 212615199 on 5/31/2017.
 */
public class Car {
    static String type = "vehicle";
    private int numSeats;
    private boolean hasWheel;
    private String color;
    public Car(){

    }

    public Car(int numSeats, boolean hasWheel, String color) {
        this.numSeats = numSeats;
        this.hasWheel = hasWheel;
        this.color = color;
    }

    public int getNumSeats() {
        return numSeats;
    }

    public boolean isHasWheel() {
        return hasWheel;
    }

    public String getColor() {
        return color;
    }
}
