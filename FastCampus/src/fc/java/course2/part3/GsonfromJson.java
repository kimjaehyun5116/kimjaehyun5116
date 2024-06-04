package fc.java.course2.part3;

import com.google.gson.Gson;
import fc.java.model3.Member;

public class GsonfromJson {
    public static void main(String[] args) {
        String Json="{\"name\":\"홍길동\",\"age\":18,\"email\":\"abc@gmail.com\"}";
        // JSON -> Object(Member)
        Gson gson=new Gson();
        Member mvo=gson.fromJson(Json, Member.class);
        System.out.println("mvo = " + mvo); // mvo = Member{name='홍길동', age=18, email='abc@gmail.com'}
    }
}
