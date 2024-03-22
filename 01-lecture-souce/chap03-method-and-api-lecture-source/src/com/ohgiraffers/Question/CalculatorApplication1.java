package com.ohgiraffers.Question;

public class CalculatorApplication1 {

    public static void main(String[] args) {

        /*다음 조건을 만족하는 프로그램을 작성하시오.
        * 구현 클래스 Calculator, Application01
        * 구현 내용
        * Calculator
        * - checkMethod(): void 설명 : 함수 호출, 확인용 메소드
        * - sumTwoNumber(a:int, b:int): int 설명 : 두 수를 입력 받아 합을 리턴한다.
        * */

        int num1 = 20;
        int num2 = 30;

        CalculatorApplication1 app1 = new Application1();
        System.out.println("두수를 더한 결과? " + app1.plusTwoNum(num1,num2));
        System.out.println("두수를 뺀 결과? " + app1.minusTwoNum(num1,num2));
        System.out.println("두수를 곱한 결과? " + app1.multipelTwoNum(num1,num2));
        System.out.println("두수를 나눈 결과? " + app1.divideTwoNum(num1,num2));
        System.out.println("두수를 나누기한 나머지 결과? " + app1.remainderTwoNum(num1,num2));



    }
    public int plusTwoNum(int num1, int num2){

        return num1 + num2;
    }

    public int minusTwoNum(int num1, int num2){

        return num1 - num2;
    }

    public int multipelTwoNum(int num1, int num2){

        return num1 * num2;
    }

    public int divideTwoNum(int num1, int num2){

        return num1 / num2;
    }

    public int remainderTwoNum(int num1, int num2){

        return num1 % num2;
    }

}
