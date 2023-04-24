package object_;

import java.util.Scanner;

public class MainClass06 {
	public static void main(String[] args) {
		TestClass06 t = new TestClass06(); //객체화 t : 참조형 변수(객체 주소를 담음)
		
		int[] num = t.myInput(); //배열 값 받기
		
		int p = t.test(num[0], num[1], num); //연산 확인 후 분리, test 메소드에 입력
		
		t.print(num, p);//출력
		
		
	}
}
