package com.ohgiraffers.section01;

public class Application04 {
    public static void main(String[] args) {

        Application04 app4 = new Application04();
        app4.testMethod("홍길동",20,'남');

        String name = "김재현";
        int age = 38;
        char gender = '남';

        app4.testMethod(name, age, gender);
    }

    public void testMethod(String name, int age, final char gender){

        System.out.println("당신의 이름은 " + name + "이고, 나이는 " +age+ "세 이며 성별은 " +gender+ "입니다.");

    }
}
