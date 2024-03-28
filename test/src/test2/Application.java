package test2;

public class Application {

    public static void main(String[] args) {

        test1.Application.Calculator(2, 5);

        double radius = 5.0;
        System.out.println("원의 넓이는 " + test1.Application.circleArea(radius) + "입니다.");

        System.out.println(test1.Application.Random());
    }
}