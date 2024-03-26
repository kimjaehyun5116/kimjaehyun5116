package com.ohgiraffers.section01;

public class Application03 {

    public static void main(String[] args) {

        Application03 app3 = new Application03();

        app3.testMethod(40);

        int age=20;
        app3.testMethod(age);

        byte byteAge = 10;
        app3.testMethod(byteAge);

        long longAge = 80;
        app3.testMethod((int) longAge);

        app3.testMethod(age + 3);
    }

    public void testMethod(int age){

        System.out.println("당신의 나이는 " + age + "세 입니다.");
    }
}
