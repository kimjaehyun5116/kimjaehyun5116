package fc.java.part3;

import fc.java.model.Student;

public class ClassObjectInstance {
    public static void main(String[] args) {
        Student st1;    // st1 : object
        Student st2;    // st2 : object
        Student st3;    // st3 : object

        st1=new Student("홍길동","컴공",32,"ibnd@naver.com",2019,"010-2222-2222");  // st1 : instance
        st2=new Student("홍길서","컴공",32,"ibnd@naver.com",2019,"010-2222-2222");  // st2 : instance
        st3=new Student("홍길남","컴공",32,"ibnd@naver.com",2019,"010-2222-2222");  // st3 : instance
        System.out.println(st1.toString());
        System.out.println(st2.toString());
        System.out.println(st3);
    }
}
