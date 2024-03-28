package test2;
public class Application {
    /*1. TestMethod의 Calculator을 전달인자로 2,5를 주어 값을 출력해주세요
    * 2. TestMethod의 CircleArea를 원의 넓이는 **입니다를 출력하는 구문을 만들어주세요
    * 3. TestMethod의 TestRandome을 출력해주세요
     */
    public static void main(String[] args) {

        Application testMethod = new Application();

        test1.Application.calculator(2, 5);
        double radius = 5.0;
       System.out.println("원의 넓이는 " + test1.Application.circleArea(radius) + "입니다.");
       System.out.println(test1.Application.Random());
    }
}