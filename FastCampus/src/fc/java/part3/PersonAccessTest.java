package fc.java.part3;

import java.util.stream.DoubleStream;

public class PersonAccessTest {
    public static void main(String[] args) {
        // Q. Person 클래스에 이름, 나이, 전화번호를 저장하고 출력하세요
        Person p=new Person();
        p.name="아무개";
        p.age=1000; // ?
        p.phone="010-2222-2222";
        System.out.println(p.name+"\t"+p.age+"\t"+p.phone);
    }
}
