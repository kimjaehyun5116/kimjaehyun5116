package test1;

public class Application {

    public static void main(String[] args) {

        byte byteVar = 10;
        short shortVar = 100;
        int intVar = 1000;
        long longVar = 100000L;
        float floatVar = 3.14f;
        double doubleVar = 3.141592;
        char charVar = 'A';
        boolean booleanVar = true;


        int intNum = 10;
        long longNum = 100L;
        long sum = intNum + longNum;
        System.out.println("int와 long의 합계: " + sum);


        String result = (sum > 0) ? "양수입니다." : "음수입니다.";
        System.out.println("합계가 " + result);
    }
}