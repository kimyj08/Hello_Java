package chapter04;

public class OpEx5_2 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 5;
		
		// & 연산
		System.out.println(a == b & test());
		
		// && 연산
		System.out.println(a == b && test());
		
		/* [ 실행 결과 ]
			test()메서드 실행됨
			false
			false
			
			& 연산은 false & true 논리연산식이 되어 결과값은 false가 출력되는데, 실행결과 출력 전 test()메서드를 실행함.
			&& 연산은 a == b가 이미 false이므로 논리연산의 결과값이 false로 결정되어 오른쪽항을 확인하지 않는 것.
			이런 미세한 차이는 1. 프로그램의 실행속도를 높인다. 2. 방어코드를 작서할 수 있다.의 이유로 사용된다.
		*/

	}
	
	public static boolean test() {
		System.out.println("test()메서드 실행됨");
		return true;
	}

}
