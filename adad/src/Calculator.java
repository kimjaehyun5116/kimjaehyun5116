public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.checkMethod(); // 메소드 호출 확인 출력

        // 각 메소드 호출 후 결과 출력
        int sum = calculator.sumTwoNumber(10, 20);
        System.out.println("두 수의 합: " + sum);

        int difference = calculator.minusTwoNumber(30, 15);
        System.out.println("두 수의 차: " + difference);

        int product = calculator.multiTwoNumber(5, 8);
        System.out.println("두 수의 곱: " + product);

        int quotient = calculator.divideTwoNumber(100, 10);
        System.out.println("두 수의 나눈 값: " + quotient);
    }

    public void checkMethod() {
        System.out.println("- 메소드 호출 확인");
    }

    public int sumTwoNumber(int a, int b) {
        return a + b;
    }

    public int minusTwoNumber(int a, int b) {
        return a - b;
    }

    public int multiTwoNumber(int a, int b) {
        return a * b;
    }

    public int divideTwoNumber(int a, int b) {
        return a / b;
    }
}