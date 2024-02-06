package chapter07;

public class Student {

	// 필드
	String name; // 학생명
	int grade; // 학년
	String department; // 학과
	
	// 변수 초기화 부분
	
//	Student(String n, int g, String d) {
//		name = n;
//		grade = g;
//		department = d;
//	}
//	
//	// 기본 생성자
//	Student() {
//		
//	}
	
	// 생성자 오버로딩 부분

	// 1번 생성자
	Student() {
		
	}
	
	// 2번 생성자
	Student(String n) {
		name = n;
	}
	
	//3번 생성자
	Student(String n, int g) {
		name = n;
		grade = g;
	}
	
	// 4번 생성자
	Student(String n, int g, String d) {
		name = n;
		grade = g;
		department = d;
	}
	
}
