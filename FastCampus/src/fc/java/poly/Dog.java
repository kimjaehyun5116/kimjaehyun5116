package fc.java.poly;

public class Dog extends Animal { // Animal -> ea†(){ ? }
   // 재정의를 하지 않음(x) ---> 오류입니다(재정의를 하세요 라는 메세지가 없음)
   // 재정의를 반드시 해야한다 ---> 구현해야한다. 바디({       })를 만들면 된다.
   public void eat(){
       System.out.println("개처럼 먹다");
   }
}
