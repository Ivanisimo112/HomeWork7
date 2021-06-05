package com.company;

public abstract class CarWash {
    public void washTheCarWithWater() {
        System.out.println("Машину миють");
    }

    public void washTheCarWithFoam() {
        System.out.println("Машину миють");
    }

    public void dryTheCar() {
        System.out.println("Машину миють");
    }

    public abstract void bringTheCarOut();

    public abstract void bringTheCarInside();
}
