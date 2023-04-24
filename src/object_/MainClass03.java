package object_;

import java.util.Scanner;

/*
 method 
 - 함수와 메소드는 비슷하다
 - 어떠한 기능을 가지고 있다면 함수 또는 메소드
 - 소괄호가 있으면 대부분 기능이라 본다
 - 함수는 절차식언어에서 표현되는 방식이며 메소드는 객체지향 표현
 */

public class MainClass03 {
	public static void main(String[] args) {
		
		//메소드 호출
		System.out.println("main start");
		Testclass03 tc = new Testclass03();
		tc.sumFunc(); // Testclass03 에 sumFunc메소드 실행
		System.out.println("main end");
		//디버깅으로 코드 확인 
		
		
	}
}
