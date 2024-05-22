public class ArithmeticOperTest {
    public static void main(String[] args) {
        // Q. 나누기와 나머지 연산자의 활용(정수의 자릿수 구학)
        int digit=3625;
        System.out.println(digit%10); // 5
        System.out.println(digit/10%10);    //2
        System.out.println(digit/100%10);   //6
        System.out.println(digit/1000%10);  //3

        int num=2579;   // 2+5+7+9=?
        System.out.println((num%10)+(num/10%10)+(num/100%10)+(num/1000%10));

        // 짝수(2로 나눠서 나머지 0), 홀수(2로 나눠서 나머지 1) / 배수 (3으로 나눠서 0으로 나누어떨어지면 3의 배수)
        int su=5;
        if(su%2==0){
            System.out.println("짝수입니다.");
        }else{
            System.out.println("홀수입니다.");

        }
    }
}
