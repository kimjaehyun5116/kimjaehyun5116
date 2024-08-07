package fc.java.part4;

import fc.java.model.*;


public class OverrideTest {
    public static void main(String[] args) {
        // Upcasting(업캐스팅) : Dog.java(X), Animal<---Dog.class(o)
        Animal ani=new Dog();
        ani.eat();  // Animal---(동적바인딩)--->Dog

        ani=new Cat();  // Animal---(동적바인딩)--->Cat
        ani.eat();

        ani=new Animal();
        ani.eat();
    }
}
