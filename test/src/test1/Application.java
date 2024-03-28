package test1;

import java.util.PrimitiveIterator;
import java.util.Random;

public class Application {

    public static void main(String[] args) {

        byte byteVar = 10;
        short shortVar = 100;
        int intVar = 1000;
        long longVar = 100000L;
        float floatVar = 3.14f;
        double doubleVar = 3.141592;
        char charVar = 'A';
        boolean booleanVar = true;


        int intNum = 10;
        long longNum = 100L;
        long sum = intNum + longNum;

        System.out.println("int와 long의 합계: " + sum);


        String result = (sum > 0) ? "양수입니다." : "음수입니다.";
        System.out.println("합계는 " + result);

    }

    public static void calculator(int num1, int num2) {
        int sum = num1 + num2;
        int dirr = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2;
        int remainder = num1 % num2;

        System.out.println("더하기 결과는  : " + (num1 + num2) + "입니다.");
        System.out.println("빼기 결과는  : " + (num1 - num2) + "입니다.");
        System.out.println("곱하기 결과는  : " + (num1 * num2) + "입니다.");
        System.out.println("나누기 결과는  : " + (num1 / num2) + "입니다.");
        System.out.println("나머지 결과는  : " + (num1 % num2) + "입니다.");

    }

    public static double circleArea(final double radius) {
        final double PI = 3.14;
        double area = PI * radius * radius;
        return area;

    }
    public static String Random() {
        Random random = new Random();
        int randomNumber = random.nextInt(10) + 1;
        return "생성된 난수는 " + +randomNumber + "입니다.";
    }
}
