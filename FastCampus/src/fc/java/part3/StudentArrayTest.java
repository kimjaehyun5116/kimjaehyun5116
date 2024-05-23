package fc.java.part3;

import fc.java.model.Student;

public class StudentArrayTest {
    public static void main(String[] args) {
        // Q. [객체배열]을 이용하여 4명의 학생(Student) 데이터를 저장하고 출력하세요
        Student[] st=new Student[4];
        st[0]=new Student("홍길동","전기",33,"12i@naver.com",20230121,"010-0000-0000");
        st[1]=new Student("홍길서","체육",23,"1222i@naver.com",20230912,"010-1111-1111");
        st[2]=new Student("홍길님","컴공",44,"12aai@daum.net",20200311,"010-2222-2222");
        st[3]=new Student("홍길북","법학",53,"12wwi@gmail.com",20131231,"010-3333-3333");
        for(int i=0;i<st.length;i++){
            System.out.println(st[i].toString());
        }
        for(Student s:st){
            System.out.println(s.toString());
        }
    }
}
