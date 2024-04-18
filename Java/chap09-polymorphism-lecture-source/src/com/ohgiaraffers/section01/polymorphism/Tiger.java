package com.ohgiaraffers.section01.polymorphism;

public class Tiger extends Animal{

    @Override
    public void eat() {
        System.out.println("호랑이는 고리를 뜯어먹고있습니다.");
    }

    @Override
    public void run() {
        System.out.println("호랑이는 왠만하면 달리지 않습니다. 어슬렁~어슬렁~ 걸어갑니다.");
    }

    @Override
    public void cry() {
        System.out.println("호랑이가 고슴도치한테 처맞고 울고있습니다.");
    }

    public void bite(){
        System.out.println("호랑이가 물어뜯습니다..");
    }
}
