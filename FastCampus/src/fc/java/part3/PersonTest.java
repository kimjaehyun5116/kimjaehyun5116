package fc.java.part3;

public class PersonTest {
    public static void main(String[] args) {
        // Q. 한사람의 데이터를 저장할 [변수를 선언]하세요
        // 모델링 된 Person 클래스를 이용하여 [객체를 메모리에 생성]하세요
        // [인스턴스를 만드는 과정]
        Person p = new Person();
        p.name="김필기";
        p.age=18;
        p.phone="010-8888-8888";
        System.out.println(p.name+"\t"+p.age+"\t"+p.phone);
        p.play();
        p.eat();
        p.walk();

        Person p1 = new Person();
        p1.name="이필기";
        p1.age=28;
        p1.phone="010-2222-8888";
        System.out.println(p1.name+"\t"+p1.age+"\t"+p1.phone);
        p1.play();
        p1.eat();
        p1.walk();
    }
}
