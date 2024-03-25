package com.ogiraffers.section02.looping;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        A_for a = new A_for();
        a.testSimpleForStatemment();

    }

    public void testForExample1() {

        Scanner sc = new Scanner(System.in);

        System.out.print("1 번째 학생의 이름을 입력해주세요 : ");
        String student1 = sc.nextLine();
        System.out.println("2 번째 학생의 이름은 " + student1 + "입니다.");
        System.out.print("2 번째 학생의 이름을 입력해주세요 : ");
        String student2 = sc.nextLine();
        System.out.println("3 번째 학생의 이름은 " + student2 + "입니다.");
        System.out.print("3 번째 학생의 이름을 입력해주세요 : ");
        String student3 = sc.nextLine();
        System.out.println("4 번째 학생의 이름은 " + student3 + "입니다.");
        System.out.print("4 번째 학생의 이름을 입력해주세요 : ");
        String student4 = sc.nextLine();
        System.out.println("5 번째 학생의 이름은 " + student4 + "입니다.");
        System.out.print("5 번째 학생의 이름을 입력해주세요 : ");
        String student5 = sc.nextLine();
        System.out.println("6 번째 학생의 이름은 " + student5 + "입니다.");
        System.out.print("6 번째 학생의 이름을 입력해주세요 : ");
        String student6 = sc.nextLine();
        System.out.println("7 번째 학생의 이름은 " + student6 + "입니다.");
        System.out.print("7 번째 학생의 이름을 입력해주세요 : ");
        String student7 = sc.nextLine();
        System.out.println("8 번째 학생의 이름은 " + student7 + "입니다.");
        System.out.print("8 번째 학생의 이름을 입력해주세요 : ");
        String student8 = sc.nextLine();
        System.out.println("9 번째 학생의 이름은 " + student8 + "입니다.");
        System.out.print("9 번째 학생의 이름을 입력해주세요 : ");
        String student9 = sc.nextLine();
        System.out.println("10 번째 학생의 이름은 " + student9 + "입니다.");
        System.out.print("10 번째 학생의 이름을 입력해주세요 : ");
        String student10 = sc.nextLine();
        System.out.println("10 번째 학생의 이름은 " + student10 + "입니다.");

        /*
         * 반복해야하는 내용은?
         * 1. 학생의 이름을 입력받아 변수에 저장
         * 안내문구 출력
         * 저장된 이름 출력
         * */

        /* 반복 횟수 1~10까지 1씩 증가하여 총 10번을 반복하였다.]*/

        for (int i = 1; i <= 10; i++) {

            System.out.println(i + " 번째의 학생의 이름을 입력해주세요");
            String student = sc.nextLine();
            System.out.println(i + " 번째 학생의 이름은 " + student + "입니다.");

        }
    }


    public void testForExample2() {
        /*우리가 뭘 반복하는지 확인하여 반복문으로 개선할 수 있다. (2)*/

        /* 문장 속에 규칙 찾기
         *
         * */

        int sum2 = 0;
        for (int i = 1; i <= 10; i++) {
            sum2 += i;
        }
        System.out.println("sum2 : " + sum2);

    }

    public void testForExample3() {
        /*우리가 뭘 반복하는지 확인하여 반복문으로 개산할 수 있다 (3)*/
        /*5~10 사이의 난수를 발생시켜서
         * 1부터 발생한 난수의 합계를 구해보자*/
        int random = (int) (Math.random() * 6) + 5;

        System.out.println("random : " + random);

        /* 뭔가 더해서 담기 위해 sum 변수를 0으로 초기화 */
        int sum = 0;


        if (random == 5) {
            sum += 1;
            sum += 2;
            sum += 3;
            sum += 4;
            sum += 5;
        } else if (random == 6) {
            sum += 1;
            sum += 2;
            sum += 3;
            sum += 4;
            sum += 5;
            sum += 6;
        } else if (random == 7) {
            sum += 1;
            sum += 2;
            sum += 3;
            sum += 4;
            sum += 5;
            sum += 6;
            sum += 7;
        } else if (random == 8) {
            sum += 1;
            sum += 2;
            sum += 3;
            sum += 4;
            sum += 5;
            sum += 6;
            sum += 7;
            sum += 8;
        } else if (random == 9) {
            sum += 1;
            sum += 2;
            sum += 3;
            sum += 4;
            sum += 5;
            sum += 6;
            sum += 7;
            sum += 8;
            sum += 9;
        } else {
            sum += 1;
            sum += 2;
            sum += 3;
            sum += 4;
            sum += 5;
            sum += 6;
            sum += 7;
            sum += 8;
            sum += 9;
            sum += 10;
        }

        System.out.println("1부터 " + random + "까지의 합은 : " + sum);

        /* 반복문을 이용한 개선*/
        int sum2 = 0;

        for (int i = 1; i <= random; i++) {
            sum2 += i;
        }
        System.out.println("1부터" + random + "까지의 합은 : " + sum2);
    }
}

