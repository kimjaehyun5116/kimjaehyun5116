package test2;

import test1.TestMethod;

public class Application {

    public static void main(String[] args) {

        TestMethod.calculator(2, 5);


        double radius = 5.0;
        System.out.println("원의 넓이는 " + TestMethod.circleArea(radius) + "입니다.");


        System.out.println(TestMethod.testRandom());
    }
}