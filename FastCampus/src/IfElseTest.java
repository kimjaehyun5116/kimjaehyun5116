import java.util.Scanner;

public class IfElseTest {
    public static void main(String[] args) {
        int x=10;
        if(x>=0){
            System.out.println("0 or 양수입니다.");
        }else{
            System.out.println("음수입니다.");
        }
        // Q. 정수 1개를 입력받아 짝수인지 홀수 인지를 판단하는 프로그램을 만드세요
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int a=sc.nextInt();
        if(a%2==0){
            System.out.println("짝수입니다");
        }else{
            System.out.println("홀수입니다");
        }
        // Q. 입력 받은 수가 12의 배수인지를 출력하는 코드를 작성하세요
        System.out.print("정수를 입력하세요 : ");
        int b=sc.nextInt();
        if(b%12==0){
            System.out.println("12의 배수 입니다");
        }else{
            System.out.println("12의 배수가 아닙니다");
        }
    }
}
