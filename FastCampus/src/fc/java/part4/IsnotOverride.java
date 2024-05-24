package fc.java.part4;

import fc.java.poly.*;

public class IsnotOverride {
    public static void main(String[] args) {
        // 재정의를 안했기 떄문에 -> 부모가 명령을 내리면(메세지를 보내면) 오동작을 한다.
        // [다형성을 보장하지 않음] -> 그러면 다형성을 보장하려면? (재정의를 강제로 하도록 만들어 주면 된다)
        // 추상클래스, 인터페이스 등장
        // [다형성이 보장이 된다]
        Animal ani=new Dog();
        ani.eat(); // ? -> 재정의 public void eat() {System.out.println("개처럼 먹다");}

        ani=new Cat();
        ani.eat(); // ? -> 재정의 public void eat() {System.out.println("개처럼 먹다");}
    }
}
