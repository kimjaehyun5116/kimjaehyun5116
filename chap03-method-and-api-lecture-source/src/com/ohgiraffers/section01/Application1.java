package com.ohgiraffers.section01;

public class Application1 {
    public static void main(String[] args) {


        System.out.println("main() 시작됨...");
        
        Application1 app = new Application1();
        
        app.methodA();

        System.out.println("main() 끝...");
    }

    private void methodA() {

        System.out.println("뱀 선생님 출근입니다!!!");

        methodB();

        System.out.println("뱀 선생님 퇴근입니다.!!");

    }
    private void methodB() {

        System.out.println("9시 30분에 수업을 시작합니다");

        methodbC();

        System.out.println("6시 20분에 수업을 끝냅니다");


    }
    private void methodbC() {

        System.out.println("점심시간 시작 1시 30분 입니다");

        System.out.println("점시시간 끝은 2시 30분 입니다");
    }
}
