package test1;

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
        System.out.println("합계가 " + result);
    }
    /* TestMethod을 만들고
    * 1. 인자값을 전달받아 사칙연산과 나머지 계산을 하는
    * 매개변수를 전달받는 메소드를 만들어 주세요 메소드 이름 Calculator
    * 출력구문 필요
    * 2. fianl 키워드를 이용한 실수 값 3.14를 초기화하고
    * 반지름 값을 입력 받아 실수형태로 값을 리턴 해주는 CircleArea 메소드를 만들어주세요
    */
    public static void Calculator(int num1, int num2) {
        int sum = num1 + num2;
        int diff = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2;
        int remainder = num1 % num2;

        System.out.println("더하기 결과는  : " + sum + "입니다.");
        System.out.println("빼기 결과는  : " + diff + "입니다.");
        System.out.println("곱하기 결과는  : " + product + "입니다.");
        System.out.println("나누기 결과는  : " + quotient + "입니다.");
        System.out.println("나머지 결과는  : " + remainder + "입니다.");
    }
    public static double circleArea(final double radius){
        final double PI = Math.PI;
        double area = PI * radius * radius;
        return area;
    }
    public static String Random(){
        Random random = new Random();
        int randomNumber = random.nextInt(10)+1;
        return "생선된 난수는 " + randomNumber + "입니다.";
    }
}
