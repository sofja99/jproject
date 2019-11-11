package edu.jcourse.lesson4;

class Vehicle {

    String name;
    int passengers;
    int tank;
    float fuelPer100km;

    public Vehicle(){}


    public Vehicle(String name, int passengers, int tank, float fuelPer100km) {
        this.name = name;
        this.passengers = passengers;
        this.tank = tank;
        this.fuelPer100km = fuelPer100km;
    }

    void distance(boolean isHighWay) {
        float distance =0;
        if(isHighWay){
            distance=(tank *100)/(fuelPer100km-1.5F);
        }else{
        distance=(tank * 100)/fuelPer100km;}
        System.out.println("Distance for " + name + ": " + distance + "km");
    }
 }
