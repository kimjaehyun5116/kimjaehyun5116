package fc.java.part2;

public class CharExam {
    // '1'+'2'+'3'+'4'+'5'=15 이 나오도록 프로그래밍하시요 CharExam 클래스
    public static void main(String[] args) {
//        int sum = ('1'+'2'+'3'+'4'+'5'-240);
//        System.out.println("sum = " + sum);
        int sum=0;  // '0' -> 48
        sum=sum+('1'-'0');    // '1' -> 49 - '0'(48)=1
        sum=sum+('2'-'0');
        sum=sum+('3'-'0');
        sum=sum+('4'-'0');
        sum=sum+('5'-'0');
        System.out.print("sum = " + sum);
        System.out.println();   // 개행, 줄바꿈
    }
}
