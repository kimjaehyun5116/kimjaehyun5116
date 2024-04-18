package com.greedy.level01.basic.member.run;

import com.greedy.level01.basic.member.model.vo.MemberVO;

import javax.management.InvalidApplicationException;

public class Application {
    public static void main(String[] args) {
        MemberVO member = new MemberVO(null, null, null, 0, ' ', null, null);

        printMemberInfo("", member); // 이부분에 그냥 프린트로 직접 기입 해보자

        member.setId("user01");
        member.setPwd("pass01");
        member.setName("홍길동");
        member.setAge(20);
        member.setGender('M');
        member.setPhone("010-1234-5678");
        member.setEmail("hong123@greedy.com");

        printMemberInfo("변경 후 : ", member); // 이부분도 제외하고 해보자
    }

    private static void printMemberInfo(String message, MemberVO member) {
        System.out.println(message + "id : " + member.getId());
        System.out.println(message + "pwd: " + member.getPwd());
        System.out.println(message + "name: " + member.getName());
        System.out.println(message + "age: " + member.getAge());
        System.out.println(message + "gender: " + member.getGender());
        System.out.println(message + "phone: " + member.getPhone());
        System.out.println(message + "email: " + member.getEmail());
        System.out.println();
    }
}
