package chapter06;

import java.util.Arrays;

public class ArrEx15 {

	public static void main(String[] args) {
		
		// < Arrays 클래스를 이용한 배열 복사방법 - Arrays.copyOf() : Arrays 클래스의 copyOf() 메서드를 사용 >
		
		// 원본 배열
		int[] arrInt = {1,2,3};
		
		// 복사할 배열
		int[] arrInt2 = null;
		
		arrInt2 = Arrays.copyOf(arrInt, 5);
		
		// 배열 값 출력
		for (int i=0; i<arrInt2.length; i++) {
			System.out.println(arrInt2[i]);
		}

	}

}
