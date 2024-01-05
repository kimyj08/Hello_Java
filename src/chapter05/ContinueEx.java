package chapter05;

public class ContinueEx {

	public static void main(String[] args) {
		
		for (int i=0; i<10; i++) {
			if (i == 5) {
				continue;
			}
			System.out.println(i);
		}

		// continue는 현재 반복만 중지되고, 다음 반복으로 계속된다.
		
	}

}
