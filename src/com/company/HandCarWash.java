package com.company;

public class HandCarWash extends CarWash {
    private int howMuchCarInside = 0;

    @Override
    public void bringTheCarOut() {
        if (howMuchCarInside > 0){
            System.out.println("Машина виїхала з ручної автомийки");
            howMuchCarInside--;
        }else{
            System.out.println("На автомийці немає машин");
        }
    }

    @Override
    public void bringTheCarInside() {
        if (howMuchCarInside < 3){
            System.out.println("Машина приїхала на ручну автомийку");
            howMuchCarInside++;
            System.out.println("Машин на автомийці зараз - " + howMuchCarInside);
        }else{
            System.out.println("На автомийці зайняті всі місця, доведеться почекати");
        }
    }

    public void washTheCarWithWater() {
        System.out.println("Зараз хтось із відвідувачів миє машину водою");
    }

    public void washTheCarWithFoam() {
        System.out.println("Зараз хтось із відвідувачів миє машину піною");
    }

    public void dryTheCar() {
        System.out.println("Зараз хтось із відвідувачів сушить машину");
    }
}
