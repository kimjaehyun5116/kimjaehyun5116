package com.ohgiraffers.section01;

public class Application05 {
    public static void main(String[] args) {

        System.out.println("main()메소드 시작함");

        Application05 app5 = new Application05();
        app5.testMethod();

        System.out.println("main()메소드 종료함");
    }
    public void testMethod(){

        System.out.println("테스트 메소드 동작 확인");

        return;
    }

}
