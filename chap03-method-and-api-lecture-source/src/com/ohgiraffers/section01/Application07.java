package com.ohgiraffers.section01;

public class Application07 {
    public static void main(String[] args) {

        int first = 20;
        int second = 10;
        Application07 app7 = new Application07();
        System.out.println("두 수를 더한 결과 : " + app7.plusTwoNum(first,second));
        System.out.println("두 수를 뺀 결과 : " + app7.minusTwoNum(first,second));
        System.out.println("두 수를 곱한 결과 : " + app7.multipleTwoNum(first,second));
        System.out.println("두 수를 나눈 결과 : " + app7.divideTwoNum(first,second));

    }

    public int plusTwoNum(int first, int second){

        return first + second;
    }

    public int minusTwoNum(int first, int second){

        return first - second;
    }

    public int multipleTwoNum(int first, int second){

        return first * second;
    }

    public int divideTwoNum(int first, int second){

        return first / second;
    }
}
