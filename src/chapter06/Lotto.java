package chapter06;

public class Lotto {

	public static void main(String[] args) {
		
		// 로또번호 6개를 담기 위한 정수타입의 길이가 6인 배열 변수 선언
		int[] lotto = new int[6];
		
		// 로또번호의 인덱스 값을 담을 변수 0으로 초기화
		int idx = 0;
		
		// 반복문의 횟수를 알 수 없기 때문에 while문 사용
		while (true) {
			int number = (int)(Math.random()*45)+1; // Math.random()은 Math라는 클래스의 random()메서드를 실행하여 랜덤수를 구하는 코드
			
			// 번호 중복여부를 확인하는 코드 : 로또 변수에 중복 번호가 추가되지 않도록 함
			boolean insert = true;
			for (int i=0; i<=idx; i++) {
				if (lotto[i] == number) {
					insert = false;
					break;
				}
			}
			// 중복된 번호가 아닐 때, 로또 배열변수의 idx 인덱스번호에 랜덤수를 대입하는 코드
			if (insert == true) {
				lotto[idx] = number;
				idx++;
			}
			
			if (idx == 6) break;
		}
		
		for (int i=0; i<lotto.length; i++) {
			System.out.println(lotto[i]);
		}

	}

}
