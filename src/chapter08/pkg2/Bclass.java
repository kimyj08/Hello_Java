package chapter08.pkg2;

import chapter08.pkg1.Aclass;

public class Bclass {

	public void method() {
		Aclass ac = new Aclass();
		ac.varA = "varA"; // 사용불가
		ac.varA2 = "varA2"; // 사용불가
		ac.methodA(); // 사용불가
		ac.methodA2(); // 사용불가
	}
	
}
