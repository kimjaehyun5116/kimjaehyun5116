package com.ohgiaraffers.section02.abstractclass;

public class SmartPhone extends Product /*, java.util.Scanner*/ {

    public SmartPhone(){}

    @Override
    public void absMethod() {
        System.out.println("Product 클래스의 absMethod를 오버라이딩한 메서드 호출함...");
    }

    public void printSmartPhone(){
        System.out.println("SmartPhone 클래스의 메서드 printSmartPhone 호출함...");
    }

}
