package fc.java.part4;

import fc.java.poly.*;

public class InterfaceTest {
    public static void main(String[] args) {
        // 리모콘으로 Radio 와 TV 를 동작시켜보자
        // 다형성이 100%보장이된다
        // 부모가 인터페이스이면 자식의 내부 동작방식을 전혀 몰라도 동작을 시킬수가 있다
        // RemoCon r=new RemoCon(); 객체 생성 불가
        // 부모의 역할을 할 수 있다
        RemoCon remo=new Radio();
        remo.chUp();
        remo.chDown();
        remo.volUp();
        remo.volDown();
        remo.internet();    //  ?   오동작 // 라디오에 인터넷이 구동되는 것은 어색하다

        remo=new TV();
        remo.chUp();
        remo.chDown();
        remo.volUp();
        remo.volDown();
        remo.internet();

    }
}
