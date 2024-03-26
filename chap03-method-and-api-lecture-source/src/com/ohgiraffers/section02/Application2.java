package com.ohgiraffers.section02;

import com.ohgiraffers.section01.Calculator;

import java.util.Calendar;

import static com.ohgiraffers.section01.Calculator.maxNumberOf;

public class Application2 {

    public static void main(String[] args) {

        Calculator calc = new Calculator();
        int min = calc.minNumberOf(50,60);

        System.out.println("50과 60중 더 작은 값은 : " + min);

        int max = maxNumberOf(50,60);

        System.out.println("50과 60중 더 큰 값은 : " + max);

        int max2 = maxNumberOf(100,200);
        System.out.println("100과 200중에 더 큰 값은? " + max2);
    }
}
