package object_;


/*
public :클래스 외부 또는 내부에서 접근 가능하다
private : 클래스 내부에서 접근 가능하다  
접근연산자
 */

public class Ex02 {
	public static void main(String[] args) {
		Test02 t = new Test02();
		t.name = "lee";
		
		// t.age = 20; // 요류 : age는 private로 설정. 외부에서 변경 X 
		
		
	}
}
