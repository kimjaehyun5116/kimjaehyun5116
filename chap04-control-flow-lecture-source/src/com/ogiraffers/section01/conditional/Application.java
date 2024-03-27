package com.ogiraffers.section01.conditional;

public class Application {

    public static void main(String[] args) {


        A_if a = new A_if();

        /* 단독 if 문 흐름 확인용 출력*/
        //a.testSimpleIfStatement();

        /*중첩 if문 흐름 확인용 테스트 출력*/
        //a.testNestedIfStatment();;

        B_ifElse b = new B_ifElse();
        /* 단독 if-else 문 흐름 확인용 메소드 호출*/
        //b.simpleIFlseStatement();

        /*중첩 if-else 문 흐름 확인용 테스트 출력*/
        //b.testNeatedIfElseStatment();

        C_ifElself c = new C_ifElself();
        //c.testSimpleIfElseIfStatement();
        //c.testNestedIfElseIfStatment();
        //c.test1NestedIfElseIfStatment();
        D_switch d = new D_switch();
        //d.testSimpleSimpleStatement();
        //d.testSwitchVendingMachine();
        d.testSwitchVendingMachine1();
    }
}
