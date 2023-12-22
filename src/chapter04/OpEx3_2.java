package chapter04;

public class OpEx3_2 {

	public static void main(String[] args) {
		
		int a = 10;
		a++;
		System.out.println("a++ : "+a);
		int b = 10;
		b += 1;
		System.out.println("b += 1 : "+b);
		int c = 10;
		c = c + 1;
		System.out.println("c = c + 1 : "+c);
		// 위 세가지 코드 방식은 다르지만 모두 11이 출력되는 같은 결과를 보이고 있다.

	}

}
