package com.ohgiraffers.section04.overflow;

public class Application1 {
    public static void main(String[] orgs) {

        /* 수업목표. 오버플로우에 대해 이해할 수 있다.*/
        /*자료형의 값의 최대 범위를 벗너아는 경우
        * 발생한 carry를 버림 처리라고 하고 sign bit를 반전시켜 최소값으로 순환시키는 현상이다.
        * */


        /* 1. 오버플로우 */
        byte num1 = 127;

        System.out.println("num1 : " + num1);

        num1++;                 //1이 증가

        System.out.println("num1 오버플로우 : " + num1);

        /* 언더플로우 */
        /* 오버플로우와 반대의 개념으로 최소 범위보다 작은 수를 발생시키는 경우 발생하는 현상이다. */

        byte num2 = -128;        //1이 감소

        System.out.println("num2 : " + num2);

        num2--;                 //1이 증가

        System.out.println("num2 언더플로우 : " + num2);

        int firstNum = 1000000;     //100만
        int secondNum = 700000;      //70만

        int multi = firstNum * secondNum;       //7천억이 나와야함

        System.out.println("firstNum * secondNum = " + multi);

        /* 3. 해결방법 */
        /* 오버플로우를 예측하고 더 큰 자료형으로 결과값을 받아서 처리한다. */
        long longMulti = firstNum * secondNum;

        System.out.println("longMulti : " + longMulti);       //안되지? 똑같지?

        long result = (long) firstNum * secondNum;

        System.out.println("result : " + result);

        /* 이미 오버플로우 처리 된 결과를 가지고 변수에 담기 때문에 위에 결과가 변하지 않는다.
        * 그럼 어떻게 해결을 해야 하나?
        * 계산이 처리 되기 전에 long 타입으로 자료형을 변경해주어야 한다.
        * */


    }
}
