package com.ohgiaraffers.section01.polymorphism;

public class Application2 {
    public static void main(String[] args) {

        /* 다형성을 적용하여 객체 배열을 만들어 인스턴스 연속처리 할 수 있다. */

        Animal[] animals = new Animal[5];
        animals[0] = new Rabbit();
        animals[1] = new Tiger();
        animals[2] = new Rabbit();
        animals[3] = new Tiger();
        animals[4] = new Rabbit();

        /* Animal 클래스가 가지는 메서드를 오버라이딩한 메서드를 호출시 동적 바인딩을 이용할 수 있다. */
        for (int i = 0; i < animals.length; i++ ) {
            animals[i].cry();
        }

        for (int i = 0; i < animals.length; i++ ) {

            if(animals[i] instanceof Rabbit){
                ((Rabbit)animals[i]).jump();

            }else if(animals[i] instanceof Tiger){
                ((Tiger)animals[i]).bite();
            }else{
                System.out.println("호랑이나 토끼가 아닙니다.");
            }
        }


    }
}
