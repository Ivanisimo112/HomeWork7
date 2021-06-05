package com.company;

public class Main {

    public static void main(String[] args) {
        AutomaticCarWash automaticCarWash = new AutomaticCarWash();

        automaticCarWash.bringTheCarInside();//пригнати машину
        automaticCarWash.washTheCarWithFoam();//помити
        automaticCarWash.washTheCarWithWater();
        automaticCarWash.dryTheCar();
        automaticCarWash.bringTheCarInside();//ще одна машина
        automaticCarWash.bringTheCarOut();//звільнити місце
        automaticCarWash.bringTheCarInside();//нова машина у автомийці

        System.out.println("------------------------------------------------------------");

        HandCarWash handCarWash = new HandCarWash();

        handCarWash.bringTheCarInside();//пригнати машину
        handCarWash.washTheCarWithFoam();//мити машину
        handCarWash.bringTheCarInside();//2 машина
        handCarWash.washTheCarWithWater();//мити машину
        handCarWash.bringTheCarInside();//3 машина
        handCarWash.dryTheCar();//сушити машину
        handCarWash.bringTheCarInside();//4 ,зайва машина
        handCarWash.bringTheCarOut();//усі поїхали додому
        handCarWash.bringTheCarOut();
        handCarWash.bringTheCarOut();
        handCarWash.bringTheCarOut();
        handCarWash.bringTheCarInside();//нова машина приїхала
    }
}
