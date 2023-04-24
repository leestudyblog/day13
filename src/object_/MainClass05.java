package object_;

import java.util.Scanner;

public class MainClass05 {
public static void main(String[] args) {
		
		//기능 분리
		System.out.println("main start");
		//입력 기능
		Scanner sc = new Scanner(System.in);
		int num =0 , sum =0; 
		System.out.println("수 입력 : ");
		num = sc.nextInt();
		//메소드 호출
		TestClass05 tc = new TestClass05();
		//연산 기능
		sum = tc.sumFunc(num);  //값 받은 변수 지정(자료형 동일) = 메소드(넘길 값)
		// parameter 파라미터 : 넘겨주는 값 , 인자값
		System.out.println("main end");
		//출력 기능
		System.out.println("1 ~ " +num + "까지의 합 : "+sum);
		
		
	}
}
