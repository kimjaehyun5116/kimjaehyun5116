package fc.java.course2.part2;

import fc.java.model2.Movie;

import java.util.*;

public class ArrayListGeneric {
    public static void main(String[] args) {
        List<Movie> list=new ArrayList<>(); // Object[]
        list.add(new Movie("괴물","봉준호","2006","한국"));
        // list.add("Hello"); // x( Objcet 는 타입의 안정성을 보장하기 어렵다)
        list.add(new Movie("기생충","봉준호","2019","한국"));
        System.out.println(list.get(0));
        System.out.println(list.get(1));
    }
}
