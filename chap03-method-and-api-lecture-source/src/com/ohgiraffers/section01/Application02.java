package com.ohgiraffers.section01;

public class Application02 {

    public static void main(String[] args) {

        System.out.println("main 시작");

        Application02 app2 = new Application02();
        app2.methodA();
        app2.methodB();
        app2.methodC();

        System.out.println("main 끝");

    }
    public void methodA(){

        System.out.println("정규수업 시작함");

        System.out.println("정규수업 끝남");
    }

    public void methodB(){

        System.out.println("취업특강 시작함");

        System.out.println("취업특장 끝남");

    }
    public void methodC(){

        System.out.println("선생님과 상담하는 날입니다.");

        System.out.println("선생님과 상담이 끝났습니다");
    }

}
