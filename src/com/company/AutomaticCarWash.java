package com.company;

public class AutomaticCarWash extends CarWash {
    private boolean busyOrNot = false;

    @Override
    public void bringTheCarOut() {
        if (busyOrNot) {
            System.out.println("Машина виїхала з автоматичної автомийки");
            busyOrNot = false;
        } else {
            System.out.println("На автомийці немає машини");
        }
    }

    @Override
    public void bringTheCarInside() {
        if (!busyOrNot) {
            System.out.println("Машина приїхала на автоматичну автомийку");
            busyOrNot = true;
        } else {
            System.out.println("Автомийка вже зайнята кимось іншим, доведеться почекати");
        }
    }

    public void washTheCarWithWater() {
        System.out.println("Зараз машину миють водою");
    }

    public void washTheCarWithFoam() {
        System.out.println("Зараз машину миють піною");
    }

    public void dryTheCar() {
        System.out.println("Зараз машину сушать");
    }
}
