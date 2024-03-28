package com.ohgiraffers.section03.abstraction;

public class CarRacer {

    private Car car = new Car();

    public void startUp() {car.startUp();}

    public void startAccelator(){car.go();}

    public void stopBreak(){car.stop();}

    public void turOff(){car.turnOff();}

}
