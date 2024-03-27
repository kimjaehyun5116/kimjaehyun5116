package com.ogiraffers.section01.conditional;

import java.util.Scanner;

public class B_ifElse {

    public void simpleIFlseStatement(){
        /*수업목표. if-else문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다. */
        /*
        * [is-eslse표현식]
        * if(조건식){
        *       조건식이 ture일 때 식행한 명령문;
        * } else {
        *       조건식이 false일 때 실행형 명령문;
        * }
        * */

        /* if문은 조건식의 결과가 참이면 if{}안에 있는 코드를 실행하고
        * 조건식의 결과가 거짓이면 else {}안에 있는 코드를 실행한다.
        * */

        /* 정수 한 개를 입력받아 그 수가 홀수이면 "입력하신 숫자는 홀수 입니다"를 출력하고
        *  홀수가 아니면 "입력하신 숫자는 짝수입니다"를 출력하는 프로그램을 작성해보자
        * 단, 조건과 상관없이 프로그램이 종료할 때 "프로그램을 종료합니다"라고 출력되도록한다.
        * */


        /* 짝수인지 조건 확인 */
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 한개를 입력 하세요 : ");
        int num = sc.nextInt();
        if(num%2!=0){
          /* 조건문이 참일 때 출력할 내용 */
            System.out.println("입력하신 숫자는 홀수 입니다. ");
        }else {
            /* 조건문이 거짓일 때 출력할 내용 */
            System.out.println("입력하신 숫자는 짝수 입니다. ");
        }

        /* 조건문과 상관 없이 프로그램 종료시 출력할 내용 */
        System.out.println("프로그램이 종료합니다.");

    }

    public void testNeatedIfElseStatment(){
        /* 수업목표. 중첩된 if-else 문의 흐름을 이해하고 적용할 수 있다. */
        /* 중첩된 if-else문 실행 흐름 확인 */

        /*
        * 숫자를 하나를 입력받아 양수이면 "입력하신 숫자는 양수입니다"를 출력하고
        * 음수이면 "입력하신 숫자는 음수입니다를 출력."
        * 단, 0이면 "0입니다"라고 출력하세요
        * 조건과 상관없이 프로그램이 종료될때는
        * */

        Scanner sc = new Scanner(System.in);
        System.out.print("정수 하나를 입력하세요 : ");
        int num = sc.nextInt();

        if(num!=0){

            if(num > 0){

                System.out.println("입력하신 숫자는 양수입니다.");
            }else{
                System.out.println("입력하신 숫자는 음수입니다.");
            }

        }else{ //num == 0
            System.out.println("입력하신 숫자는 0입니다.");
        }


    }


}
