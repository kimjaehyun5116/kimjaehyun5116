package fc.java.course2.part3;

import com.google.gson.Gson;
import fc.java.model3.Member;

public class GsontoJson {
    public static void main(String[] args) {
        Member mbo = new Member("홍길동",30,"bit@naver.com");
        // Json -> { "name" : "홍길동", "age" : 30, "email" : "bit@naver.com" }
        // 객체생성
        Gson gson = new Gson();
        // Object(Member) -> JSON
        String json = gson.toJson(mbo);
        System.out.println("json = " + json); // json = {"name":"홍길동","age":30,"email":"bit@naver.com"}

    }
}
