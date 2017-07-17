package com.company;

/**
 * Created by 212615199 on 5/31/2017.
 */
public class Lesson {
    public static void main (String arg[]) {
        Car car = new Car(4, true, "black");
        System.out.println(car.getColor());
        System.out.println(Car.type);
    }
}
