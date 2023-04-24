package object_;

import java.util.Scanner;

public class MainClass04 {
public static void main(String[] args) {
		
		//기능 분리
		System.out.println("main start");
		//입력 기능
		Scanner sc = new Scanner(System.in);
		int num =0 , sum =0; 
		System.out.println("수 입력 : ");
		num = sc.nextInt();
		//메소드 호출
		TestClass04 tc = new TestClass04();
		//연산 + 출력 기능
		tc.sumFunc(num);  
		// parameter 파라미터 : 넘겨주는 값 , 인자값
		System.out.println("main end");

		
		
	}
}
