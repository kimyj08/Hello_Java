package chapter04;

public class OpEx5_3 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 0;
		
		// & 연산
//		System.out.println(b > 0 & (a / b > 0));
		
		/* [ 실행 결과 ]
		 * Exception in thread "main" java.lang.ArithmeticException: / by zero
		 * at test/chapter04.OpEx5_3.main(OpEx5_3.java:11)
		 */
		// 0 값이 오는 경우 0으로 나누면 에러가 난다. 이를 막기 위해 아래 처럼 & 대신 &&를 쓰게 된다.
		
		// && 연산
		System.out.println(b > 0 && (a / b > 0)); // false
		
	}

}
