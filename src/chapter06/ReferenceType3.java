package chapter06;

public class ReferenceType3 {

	public static void main(String[] args) {
		
		String name1 = new String("홍길동");
		String name2 = new String("홍길동");
		
		System.out.println(name1.equals(name2));
		
		// == 연산자 말고, equals() 메서드를 이용해서 비교하면 문자열값 자체를 비교할 수 있다.

	}

}
