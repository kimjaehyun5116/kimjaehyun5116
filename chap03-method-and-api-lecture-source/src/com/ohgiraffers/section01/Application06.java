package com.ohgiraffers.section01;

public class Application06 {
    public static void main(String[] args) {

        System.out.println("main 메소드 시작함");
        Application06 app6 = new Application06();
        app6.testMethod();

        String returnText = app6.testMethod();
        System.out.println(returnText);
        System.out.println(app6.testMethod());

        System.out.println("main 메소드 종료함");
    }

    public String testMethod(){

        return"hello world";
    }
}
