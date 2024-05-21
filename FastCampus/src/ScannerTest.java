import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int num=scan.nextInt();     // 블럭상태
        System.out.println("num = " + num);

        System.out.print("실수를 입력하세요 : ");
        float f=scan.nextFloat();    // 블럭상태
        System.out.println("f = " + f);

        System.out.print("문자열 입력하세요 : ");  // "A", "ABC"
        String str=scan.next(); // 공백 전까지
        System.out.println("str = " + str);

        scan.nextLine();    // 버퍼비우기(스트림 비우기)

        System.out.print("문자열을 입력하세요 : ");
        String str2=scan.nextLine();    // 공백도 인식
        System.out.println("str2 = " + str2);
    }
}
