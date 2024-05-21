public class MovieTest {
    public static void main(String[] args) {
        // Q. 아래에 예시된 한 편의[영화] 데이터를 저장하고 출력하시오
        Movie m = new Movie();
        m.title = "아바타";
        m.releaseDate="2022.12.14";
        m.hero="제이크 설리";
        m.genre="액션";
        m.runningTime=192;
        m.rating="12세";
        System.out.println(m.title+"\t"+m.releaseDate+"\t"+m.hero+"\t"+m.genre+"\t"+m.runningTime+"\t"+m.rating);

    }
}
