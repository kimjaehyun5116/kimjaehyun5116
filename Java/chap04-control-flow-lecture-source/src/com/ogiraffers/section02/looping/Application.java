package com.ogiraffers.section02.looping;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        A_for a = new A_for();
        //a.testSimpleForStatemment();
        //a.printSimpleGugudan();
        A_nestedFor an = new A_nestedFor();
        //an.printGugudanFromTwoToNice();
        //an.printStarInputRowTimes();
        //an.printTriangleStars();

        B_while anr = new B_while();
        //anr.testSimpleWhileStatement();
        //anr.testWhileExample1();
        anr.testWhileExample1();
        C_doWhile c = new C_doWhile();
        //c.testSimpleDoWhileStatment();
        //c.testDoWhileExample();
    }

}