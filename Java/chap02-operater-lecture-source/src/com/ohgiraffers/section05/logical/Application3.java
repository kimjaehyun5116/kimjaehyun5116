package com.ohgiraffers.section05.logical;

public class Application3 {

    public static void main(String[] args) {

        /*수업목표. 논리연결연산자의 진리표에 대해 이해할 수 있다.*/
        /*
        * AND 연산과 OR 연산의 특징
        * 논리식 && 논리식 : 앞의 결과가 false 이면 뒤도 false 이기때문에 실행 안함.
        * 논리식 || 논리식 : 앞에 결과가 ture 이면 뒤를 실행 안함.
        * */

        /* 1. 논리식 && 논리식 : 앞에 결과가 false 이면 뒤를 실행 안 함.*/
        /*
        * 조건식 두 개가 모두 만족되어야 true를 반환하지만 앞에 미리 false가 나오게 되면
        * 뒤에 조건을 확인할 필용없이 false를 반환한다
        * 따라서 연산 횟수를 줄이기 위해서는 && 연산의 경우 앞에 false가 나올 가능성이 높은 조건을 작성하는 것이 좋다
        * */

        int num1 = 10;

        int result = (false && ++num1 > 0 )? num1 : num1;

        System.out.println("&&실행 확인 : " + result);

        /* 2. 논리식 || 논리식 ㅣ 앞에 결과가 true이면 뒤를 실행 안함*/
        /* 조건식 중 둘 중 하나라고 true를 반환면 ture룰 반환하기 때문에 앞에서 미리 true 가 나온=게 되면
        * 따라서 연산의 횟수를 줄이기 위해서는 || 연산의 경우 true 가 날올 가능성이 높은 조건을 적은하는 게 좋다.
         */

        int num2 = 10;

        int result2 = (true || ++num2 >0 )? num1 : num2;

        System.out.println("||실행 확인 : " + result2);





    }
}
