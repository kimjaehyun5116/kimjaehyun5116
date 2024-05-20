public class CharTest {
    public static void main(String[] args) {
        char c='A';
        System.out.println("c = " + c);
        int a='A';
        System.out.println("a = " + a);
        int b='B'+1;
        System.out.println("b = " + b);
        // Q.'A' 라는 한글 한 문자를 변수에 저장하고 출력하시오.
        char han='가';
        System.out.println("han = " + han);
        int hanD='가';   // 44032
        System.out.println("hanD = " + hanD);
        int hanU='\uAC00';
        System.out.println("hanU = " + (char)hanU);
        // Q. 대문자 'A'를 문자 'a'로 변환하여 출력하시오.(ASCII코드 참고)
        char upper='A';
        char lower=(char)(upper+32);
        System.out.println("lower = " + lower); // 'a'

        char lower1='u';    // 117
        int upper1=lower1-32;   // 117-32=985(U)
        System.out.println("upper1 = " + upper1);   //  85->U

        // Q. '1'+'2'=3 이 나오도록 프로그래밍 하시오

        int data='1'+'2';
        System.out.println("data = " + data);   //99

        char i='1'; // 49-98=1
        char j='2'; // 50-48=2
//        int sum=(i-48)+(j-48);
        int sum=(i-'0')+(j-'0');
        System.out.println("sum = " + sum);




    }
}
