package fc.java.part4;

import fc.java.model.*;

public class PolyMethodTest {
    public static void main(String[] args) {
        Dog d=new Dog();
        display(d);
        Cat c=new Cat();
        display(c);
    }
/*
    private static void display(Cat c) {
        c.eat();
    }

    private static void display(Dog d) {
        d.eat();
    }*/
    public static void display(Animal ani){ // 1. 다형성 인수
        ani.eat();
        // Cat 타입으로 받은 경우에만 실행 -> if
        if(ani instanceof Cat){
            ((Cat)ani).night(); // Cat
        }
        // ((Cat)ani).night(); // Cat

    }
}
