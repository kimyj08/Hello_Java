package chapter17;

public class ProcessEx {

	public static void main(String[] args) {
		
		try {
			// 계산기 실행 -> 계산기 프로그램을 직접 실행하는 것이 아니라 새로운 프로세스를 실행하고 자신은 종료되버리기 때문에 그림판도 같이 종료되고, 새로운 프로세스인 계산기만 남아있게 됨.
			Process p1 = Runtime.getRuntime().exec("calc.exe");
			// 그림판 실행
			Process p2 = Runtime.getRuntime().exec("mspaint.exe");
			
			p1.waitFor(); // p1 프로세스가 종료될때까지 대기
			p2.destroy(); // p1 프로세스가 종료되면 실행
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
