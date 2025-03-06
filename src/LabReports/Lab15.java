package LabReports;

// write a program that demonstrate abstraction using an abstract class or method.
abstract class Vehicle {
    abstract void start();
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car is started");
    }
}


public class Lab15 {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.start();
    }
}
