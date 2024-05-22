package fc.java.part2;

public class BinaryExam {
    public static void main(String[] args) {
        // Q. 123을 10진수, 2진수, 8진수, 16진수로 출력하시오
        int data = 123;
        String binary=Integer.toBinaryString(data);
        System.out.println("binary = " + binary); // 0b1111011
        String octal=Integer.toOctalString(data);
        System.out.println("octal = " + octal); // 0173
        String hexa=Integer.toHexString(data);
        System.out.println("hexa = " + hexa); // 0x7B

        int i=123;
        System.out.println("i = " + i);
        int b = 0b1111011;
        System.out.println("b = " + b);
        int o=0173;
        System.out.println("o = " + o);
        int h=0x7B;
        System.out.println("h = " + h);


    }
}
