package com.ohgiraffers.section04;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner((System.in));

        System.out.println("이름을 입력해주세요 : ");
        String name = sc.nextLine();
        System.out.println("입력하신 이름은  " + name + "입니다.");

        System.out.println("나이를 입력하세요 : ");
        int age = sc.nextInt();
        System.out.println("입력하신 나이는 " + age + "입니다.");

        System.out.println("원하는 실수를 입력해주세요 : ");
        double num = sc.nextDouble();
        System.out.println("입력하신 실수는 " + num + "입니다.");

        System.out.println("참과 거짓의 한가지를 true or false로 입력해주세요 : ");
        boolean isTrue = sc.nextBoolean();
        System.out.println("입력하신 논리값은  " + isTrue + "입니다. ");

        sc.nextLine();
        System.out.println("아무 문자나 입력해주세요 : ");
        char ch = sc.nextLine().charAt(0);
        System.out.println("입력하신 문자는  " + ch + "입니다. ");

    }
}
