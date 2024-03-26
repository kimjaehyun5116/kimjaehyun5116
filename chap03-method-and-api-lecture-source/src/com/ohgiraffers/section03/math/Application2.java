package com.ohgiraffers.section03.math;

public class Application2 {
    public static void main(String[] args) {

        int random1 = (int)(Math.random() * 10 );
        System.out.println("0부터 9사이의 난수 : " + random1);

        int random2 = (int)(Math.random() * 10 ) +1;
        System.out.println("0부터 10사이의 난수 : " + random1);

        int random3 = (int)(Math.random() * 6) +10;
        System.out.println("10부터 15사이의 난수 : " + random3);
    }
}
