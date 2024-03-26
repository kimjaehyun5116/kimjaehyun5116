package com.ohgiraffers.section01;

public class Application08 {
    public static void main(String[] args) {

        System.out.println("10과 20의 합 : " + Application08.sumTwoNum(10,20));

        System.out.println("10과 20의 합 : " + sumTwoNum(10,20));
    }

    public static int sumTwoNum(int first, int second){

        return first + second;
    }
}
