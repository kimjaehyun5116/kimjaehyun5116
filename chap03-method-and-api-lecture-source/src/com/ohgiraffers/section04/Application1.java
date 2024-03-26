package com.ohgiraffers.section04;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("인삿말을 입력해주세요 : ");
        String greeting1 = sc.nextLine();
        System.out.println(greeting1);

        System.out.println("인삿말을 입력해주세요 : ");
        String greeting2 = sc.next();
        System.out.println(greeting2);
    }
}
