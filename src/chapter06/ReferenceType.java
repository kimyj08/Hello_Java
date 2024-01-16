package chapter06;

public class ReferenceType {

	public static void main(String[] args) {
		
		String name1 = "홍길동";
		String name2 = "홍길동";
		
		System.out.println(name1 == name2);
		
		// 값끼리 비교한 것이 아니라, 메모리 주소를 참조하고 있는 값을 비교한 것이다.

	}

}
