package chapter06;

public class ReferenceType2 {

	public static void main(String[] args) {
		
		String name1 = new String("홍길동");
		String name2 = new String("홍길동");
		
		System.out.println(name1 == name2);
		
		// 같은 "홍길동" 문자열 값을 통해 객체를 생성하였지만 name1 == name2 의 결과값은 false이다.
		// 즉 참조하고 있는 메모리 주소가 다른 것이다. 이렇게 문자열인 경우는 ==로 비교하면 안되고 equals 메서드를 사용해야 한다.

	}

}
