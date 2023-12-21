package chapter04;

public class OpEx2_0 {

	public static void main(String[] args) {
	
//		int a = 10;
//		int b = 4;
//		
//		System.out.println("10 / 4 = "+a / b); // 결과값 2
		// 자바에서는 정수와 정수의 연산 결과는 항상 정수
		
//		double a = 10;
//		int b = 4;
//		
//		System.out.println("10 / 4 = "+a / b); // 결과값 2.5
		// 2.5가 출력이 되게 하려면 a, b 이 두 변수 중 하나 이상이 실수인 경우 결과값이 실수가 된다.
		
		// 강제형변환 하는 경우
		int a = 10;
		int b = 4;
		System.out.println("10 / 4 = "+ (double)a / b);
		// 변수 a를 double로 강제형변환 한 후 나누기 연산을 하여, 실수와 정수의 연산으로 2.5의 결과값이 나오도록 함.

	}

}
