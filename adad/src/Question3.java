public class Question3 {
    public static void main(String[] args) {

          /* Application01
        int x = 2;
		int y = 5;
		char c = 'A'; // 'A'의 문자코드는 65
		System.out.println(y >= 5 || x < 0 && x > 2);
		 // y >=5 는 true 이므로 이후의 것은 평가되지 않는다. 따라서 true
		System.out.println(y += 10 - x++);
		// y = y + (10 - x++) 을 의미한다 x++은 후위 증가 연산자 이므로 y = 5+ (10-2)
		   따라서 13이 된다
		System.out.println(x+=2);
		// 전 식에서 x가 후위 증가되어서 3이 되었으니 3+2=5가 된다 따라서 5가 출력된다
		System.out.println( !('A' <= c && c <='Z') );
		// !true 를 의미한다. 'A'는 'Z' 사이에 있으므로 (true && true)가 되어 true가 됩니다 . 따라서 false가 출력됩니다.
		System.out.println('C'-c);
		// 'C'-c'는 'c'와 'A'사이의 차이를 나타냅니다. 'C'는 ASCII에서 67이고 'A'는 65 이므로 결과는 2가 됩니다.
		System.out.println('5'-'0');
		// '5'-'0'은 문자열 '5'와 '0' 사이의 차이를 나타냅니다. 따라서 결과는 5가 됩니다.
            따라서 5가 출력됩니다.
		System.out.println(c+1);
		// c+1은 'A' + 1을 의미하며, ASCII에서 'A'는 65이므로 결과는 66이 됩니다.
          따라서 66이 출력됩니다.
		System.out.println(++c);
		// ++c는 c를 증가시킨 후의 값을 사용합니다. 따라서 'B'로 변경됩니다.
            따라서 'B'가 출력됩니다.
		System.out.println(c++);
        // c++는 현재의 c 값을 사용한 후에 c를 증가시킵니다. 따라서 이전에 'B'였던 값이 출력되고, 그 후에 c는 'C'로 증가합니다.
           따라서 'B'가 출력됩니다.
		System.out.println(c);
        // 이전에 c가 'C'로 증가되었으므로, 'C'가 출력됩니다
        */

        int x = 2;
        int y = 5;
        char c = 'A';
        System.out.println(y >= 5 || x < 0 && x > 2);
        System.out.println(y += 10 - x++);
        System.out.println(x += 2);
        System.out.println(!('A' <= c && c <= 'Z'));
        System.out.println('C' - c);
        System.out.println('5' - '0');
        System.out.println(c + 1);
        System.out.println(++c);
        System.out.println(c++);
        System.out.println(c);
    }
}


