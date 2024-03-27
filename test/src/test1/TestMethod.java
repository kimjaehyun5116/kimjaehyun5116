package test1;

import java.util.Random;
import java.util.Scanner;

public class TestMethod {

    public static void calculator(int num1, int num2) {
        int sum = num1 + num2;
        int diff = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2;
        int remainder = num1 % num2;

        System.out.println("덧셈 결과: " + sum);
        System.out.println("뺄셈 결과: " + diff);
        System.out.println("곱셈 결과: " + product);
        System.out.println("나눗셈 결과: " + quotient);
        System.out.println("나머지 결과: " + remainder);
    }

    public static double circleArea(final double radius) {
        final double PI = 3.14;
        double area = PI * radius * radius;
        return area;
    }

    public static String testRandom() {
        Random random = new Random();
        int randomNumber = random.nextInt(10) + 1; // 1부터 10까지의 난수 생성
        return "생성된 난수는 " + randomNumber + "입니다.";
    }

    public static void main(String[] args) {

        calculator(2, 5);


        Scanner scanner = new Scanner(System.in);
        System.out.print("반지름을 입력하세요: ");
        double radius = scanner.nextDouble();
        System.out.println("원의 넓이는 " + circleArea(radius) + "입니다.");


        System.out.println(testRandom());
    }
}
