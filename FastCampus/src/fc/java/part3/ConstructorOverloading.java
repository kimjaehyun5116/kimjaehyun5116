package fc.java.part3;

import fc.java.model.PersonVO;

public class ConstructorOverloading {
    public static void main(String[] args) {
        // Q. 생성자 메서드를 통해 PersonVO 객체에 원하는 이름, 나이, 전화번호를 저장하고 출력하세요
        PersonVO vo=new PersonVO("홍길동",50,"010-1234-1234");
        PersonVO vo1=new PersonVO("홍길남",60,"010-2222-2222");
        PersonVO vo2=new PersonVO("홍길서",80,"010-1111-1111");
        System.out.println(vo.getName()+"\t"+vo.getAge()+"\t"+vo.getPhone());
        System.out.println(vo1.getName()+"\t"+vo1.getAge()+"\t"+vo1.getPhone());
        System.out.println(vo2.getName()+"\t"+vo2.getAge()+"\t"+vo2.getPhone());
    }
}
