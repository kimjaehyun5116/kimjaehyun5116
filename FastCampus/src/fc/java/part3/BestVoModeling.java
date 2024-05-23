package fc.java.part3;

import fc.java.model.MovieVO;

public class BestVoModeling {
    public static void main(String[] args) {
        MovieVO vo=new MovieVO("아바타","2022-12-14","제이크 셜리","액션",160,"12세");
        System.out.println(vo.toString());
        System.out.println(vo.getLevel());//getter 를 사용해 하나만 출력도 가능
    }
}
