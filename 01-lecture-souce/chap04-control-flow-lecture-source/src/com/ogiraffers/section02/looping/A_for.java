package com.ogiraffers.section02.looping;

public class A_for {

    public void testSimpleForStatemment() {
        /* 수업목표. for 단독 사용에 대한 흐름 이해하고 적용할 수 있다. */
        /*
         * [for문 표현식]
         * for(초기식; 조건식; 증감식){
         *   조건을 만족하는 경우 수행할 구문(반복할 구문)
         *}
         * */

        /* 1부터 10까지 1씩 증가시키며 10번 i 값을 증가시키는 기본 박복문*/
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        int j = 1;
        for (; j <= 15; j++) {
            System.out.println(j);
        }
        int k = 1; //이렇게도 할수 있다
        for (; k <= 20; ) {
            System.out.println(k);
            k++;

        }
    }
}