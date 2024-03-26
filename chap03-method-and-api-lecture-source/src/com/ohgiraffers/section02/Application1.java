package com.ohgiraffers.section02;

public class Application1 {
    public static void main(String[] args) {

        com.ohgiraffers.section01.Calculator cal = new com.ohgiraffers.section01.Calculator();

        int min = cal.minNumberOf(30,20);

        System.out.println("30과 20중에 더 작은 값은? " + min);

        int max = com.ohgiraffers.section01.Calculator.maxNumberOf(30,20);

        System.out.println("30과 20중에 더 큰 값은? " + max);
    }
}
