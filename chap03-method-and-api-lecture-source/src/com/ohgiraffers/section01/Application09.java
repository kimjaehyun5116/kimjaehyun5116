package com.ohgiraffers.section01;

public class Application09 {
    public static void main(String[] args) {

        int first = 100;
        int second = 50;

        Calculator cal = new Calculator();
        int min = cal.minNumberOf(first,second);
        System.out.println("두 수 중 최소값은? "+min);

        int max = Calculator.maxNumberOf(first,second);
        System.out.println("두 수 중 최대값은? "+max);

        int max2 = cal.maxNumberOf(first,second);
        System.out.println("두 수 중 최대값은? "+max2);
    }
}
