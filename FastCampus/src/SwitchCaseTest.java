import java.util.Scanner;
import java.util.stream.DoubleStream;

public class SwitchCaseTest {
    public static void main(String[] args) {
    // Q. switch ~ case 문을 활용하여 요일에 해당하는 운동을 출력하세요
//        String day="Sunday"; // 야구하기
        System.out.print("요일을 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        String day = sc.nextLine();
        switch(day){
            case "Sunday":
                System.out.println("야구하기");
                break;
            case "Monday":
                System.out.println("농구하기");
                break;
            case "Tuesday":
            case "Wednesday":
                System.out.println("수영하기");
                break;
            default:
                System.out.println("휴식");
        }
    }
}
