package chapter04;

public class OpEx3_1 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = ++a;
		
		System.out.println("전위연산 결과 : "+b);
		
		int x = 10;
		int y = x++;
		System.out.println("후위연산 결과 : "+y);
		System.out.println("x : "+x);
		// 증감연산은 연산자가 앞에 있는지 뒤에 있는지에 따라 연산 순서가 달라지는 것을 알 수 있었다.
		// 실무에서 사용빈도가 후위연산이 훨씬 높으니 후위연산은 반드시 기억하도록 하자.

	}

}
