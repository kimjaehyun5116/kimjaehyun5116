package fc.java.part3;
// import java.lang.*; // default package
import fc.java.model.CarDAO;
import fc.java.model.CarDTO;

import java.util.Scanner;

public class PackageNameTest {
    public static void main(String[] args) {
        // Q. 지금까지 자바에서 제공해주어서 사용해본 클래스들의 이름을 적어보자
        String str="홍길동";
        Scanner scan=new Scanner(System.in);
        System.out.println("Hello World!");
        // Q. 우리가 직접 만들어서 사용해본 클래스들의 이름을 적어보자
        CarDTO car=new CarDTO();
        CarDAO dao=new CarDAO();
    }
}
