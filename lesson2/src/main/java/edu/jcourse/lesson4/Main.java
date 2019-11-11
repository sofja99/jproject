package edu.jcourse.lesson4;

public class Main {

    public static void main(String[] args) {
        Vehicle miniVan=new Vehicle();
        miniVan.passengers=7;
        miniVan.tank=70;
        miniVan.fuelPer100km=8.5F;
        miniVan.name= "MiniVan";
        miniVan.distance(false);

        Vehicle car1=new Vehicle("audi", 5, 50, 7.0F);

        Vehicle sportCar = new Vehicle();
        sportCar.passengers=2;
        sportCar.tank=50;
        sportCar.fuelPer100km=18.5F;
        sportCar.name="Sport Car";

        sportCar.distance(true);
    }
}
