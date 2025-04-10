package com.pluralsight;

public class RemesyClass {

    int bobSalary;
    int garySalary;

    double carPrice;
    double truckPrice;

    public RemesyClass(int bobSalary, int garySalary) {
        this.bobSalary = bobSalary;
        this.garySalary = garySalary;
    }

    public RemesyClass(double carPrice, double truckPrice) {
        this.carPrice = carPrice;
        this.truckPrice = truckPrice;
    }

    public RemesyClass() {
    }

    public int highestSalary() {
        return Math.max(bobSalary, garySalary);
    }

    public double smallestCarPrice() {
        return Math.min(carPrice, truckPrice);
    }

    public double randomNumber() {
        double n = Math.random();
        return Math.floor(n * 100) / 100;
    }

    public int getBobSalary() {
        return bobSalary;
    }

    public void setBobSalary(int bobSalary) {
        this.bobSalary = bobSalary;
    }

    public int getGarySalary() {
        return garySalary;
    }

    public void setGarySalary(int garySalary) {
        this.garySalary = garySalary;
    }
}
