package com.ohgiraffers.section05.parameter;

public class ParameterTest {

    public void testPrimaryType(int num) {
        System.out.println("내개변수로 전달 받은 값 = " + num);

    }

    public void testPrimaryTypeArray(int[] iarr) {

        System.out.println("매개변수로 전달 받은 값 = " + iarr);

        System.out.print("배열의 값 출력 : ");
        for (int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i] + " ");

        }
        System.out.println();

        iarr[0] = 99;

        System.out.println("변경된 배열의 값 출력 = " + iarr);

        System.out.print("배열의 값 출력 : ");
        for (int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i] + " ");
        }
        System.out.println();
    }

    public void testClassType(RectAngle rectAngle) {

        System.out.println("매개변수로 전달받은 값 = " + rectAngle);

        System.out.println("================ 사각형의 넓이와 둘레 ================");
        rectAngle.calcArea();
        rectAngle.calcRound();

        rectAngle.setWidth(100);
        rectAngle.setHeight(100);

        System.out.println("================ 변경 된 사각형의 넓이와 둘레 ================");
        rectAngle.calcArea();
        rectAngle.calcRound();

    }

    public void testVariableLengthArray(String name, String... hobby) {
        /* (...)은 가변인자를 나타내는 문법. 메서드에 여러 개의 매개변수를 전달할 수 있도록 한다.
        가변인자를 사용하면 메서드를 호출할 때 필요한 수만큼의 인자를 전달할 수 있으며, 메서드 내부에서 해당 이자들을 배열로 처리할 수 있다. */
        System.out.println("이름 : " + name);
        System.out.println("취미의 갯수 : " + hobby.length);
        System.out.print("취미 : ");
        for (int i = 0; i < hobby.length; i++) {
            System.out.print(hobby[i] + " ");
        }
        System.out.println();

    }

}
