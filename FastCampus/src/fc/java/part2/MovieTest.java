package fc.java.part2;

public class MovieTest {
    public static void main(String[] args) {
        // Q. 아래에 예시된 한 편의[영화] 데이터를 저장하고 출력하시오
        Movie m = new Movie();
        m.title = "아바타";
        m.day=20221214;
        m.major="제이크 설리";
        m.part="액션";
        m.time=192;
        m.level=12;
        System.out.println(m.title+"\t"+m.day+"\t"+m.major+"\t"+m.part+"\t"+m.time+"\t"+m.level);

    }
}
