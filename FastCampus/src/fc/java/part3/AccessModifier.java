package fc.java.part3;

import fc.java.model.MemberDTO;

public class AccessModifier {
    public static void main(String[] args) {
        MemberDTO dto = new MemberDTO();
        dto.name="홍길동";
        dto.phone="010-1111-1111";
        //dto.age=1000; // 에러방생(접근불가)
        System.out.println(dto.name+"\t"+dto.phone);
        dto.paly();

    }
}
