package com.ohgiraffers.section01.generic;

public class Appliction {


    public static void main(String[] args) {

        /* 제네릭에 대해 이해할 수 있다 */

         GenericTest<Integer> gt1 = new GenericTest<Integer>();

         gt1.setValue(10);
         System.out.println("gt1.getValue() = " + gt1.getValue());
         System.out.println(gt1.getValue() instanceof Integer);

        GenericTest<String> gt2 = new GenericTest<>();
        gt2.setValue("홍길동");
        System.out.println("gt2.getValue() = " + gt2.getValue());
        System.out.println(gt2.getValue() instanceof String);

        GenericTest<Double> gt3 = new GenericTest<>();
        gt3.setValue(0.5);
        System.out.println("gt3.getValue() = " + gt3.getValue());
        System.out.println(gt3.getValue() instanceof Double);
    }

}
