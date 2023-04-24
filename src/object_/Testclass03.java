package object_;

import java.util.Scanner;

public class Testclass03 {
	public void sumFunc() { // method 
		//void : 반환타입
		
		Scanner sc = new Scanner(System.in);
		int num =0 , sum =0; 
		System.out.println("수 입력 : ");
		num = sc.nextInt();
		for (int i=0; i <=num; i++) {
			sum +=i;
		}
		System.out.println("1 ~" +num + "까지의 합 : "+sum);
		//기능 분리 (약한 결합 : 여러 기능으로 분리 되어있는 상태)
		
		
	}
}
