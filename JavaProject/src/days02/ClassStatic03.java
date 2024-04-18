package days02;

class MemberCall {
	int iv = 10; //인스턴스 변수
	static int sv = 20; // 스태틱 변수
	int iv2 = sv; // 스태틱 변수로 인스턴스 변수 값을 초기화O
//	static int sv2 = iv; // 인스턴스 변수 스태틱변수 초기화X
	static int sv2 = new MemberCall().iv;
	
	void instanceMethod1() { // 인스턴스 메서드
	   System.out.println(iv); //인트턴스 메서드에서는 인스턴스 변수 사용 O
	   System.out.println(sv); //인트턴스 메서드에서는 스태틱 변수 사용 O
	   intanceMethod2(); // 인스턴스 메서드에서는 인스턴스 메서드 호출 O
	   staticMethod2(); // 인스턴스 메서드에서는 스태틱 메서드 호출 O
	}
	static void staticMethod() { // 스태틱 메서드
		 // System.out.println(iv); //인트턴스 메서드에서는 인스턴스 변수 사용 X
		 System.out.println(sv); //인트턴스 메서드에서는 스태틱 변수 사용 O
	   //  intanceMethod2(); // 인스턴스 메서드에서는 인스턴스 메서드 호출 X
		   staticMethod2(); // 인스턴스 메서드에서는 스태틱 메서드 호출 O
		
	}
	
	void intanceMethod2() {
	}
	static void staticMethod2() {
	}
	
}
public class ClassStatic03 {

	public static void main(String[] args) {

		// 스태틱 멤버는 개체 생성없이 바로 사용이 가능
		MemberCall.sv = 300;
		MemberCall.staticMethod();
		
		// 인스턴스 메서드는 객체생성 이후에 사용이 가능
		MemberCall mc = new MemberCall();
		mc.iv = 30;
		mc.instanceMethod1();
		
		// Integer.pasrseInt(null)
//		Math.random()
//		Math.sqrt()
//		Math.sbs()
		
	}

}
