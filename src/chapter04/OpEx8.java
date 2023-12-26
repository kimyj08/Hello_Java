package chapter04;

public class OpEx8 {

	public static void main(String[] args) {

		String name = "홍길동";
		System.out.println("안녕하세요 " + name + " 입니다.");
		
		int height = 180;
		System.out.println("저의 키는 " + height + "cm입니다.");
		
		//String weight = 75.5; // 에러발생(문자자료형 변수에는 숫자 대입 못함)
		String weight = 75.5 + "";
		System.out.println("제 몸무게는 " + weight + "kg입니다.");
		
		int ageInt = 30;	  // 정수
		String ageStr = "30"; // 문자열

		// 숫자는 문자열과 계산이나 연산이 불가능하다. 그런데 정상적으로 출력이 된 것은 180이라는 값이 자동으로 문자열로 형변환 된 것이다라고 추측할 수 있다.
		// 14번 라인에도 보듯이 숫자는 문자열과 +연산이 되면 문자열로 자동형변환이 일어난 것을 알 수 있다.
		
	}

}
