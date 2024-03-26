package com.ohgiraffers.section03.math;

import java.util.Random;

public class Application3 {
    public static void main(String[] args) {

        Random Random = new Random();
        
        int randomNum = Random.nextInt(10);

        System.out.println("0부터 9까지의 난수 ? " + randomNum);

        int randomNum1 = Random.nextInt(10) + 1;

        System.out.println("1부터 10까지의 난수 ?" + randomNum1);
        
        int randomNum2 = Random.nextInt(26) + 20;

        System.out.println("20부터 45까지의 난수 ? " + randomNum2);
        
        int randomNum4 = new Random().nextInt(256) - 128;
        System.out.println("128~127까지의 난수발생 " + randomNum4);
        
        
    }
}
