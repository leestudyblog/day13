package object_;

import java.util.Scanner;

public class TestClass04 {
	public void sumFunc(int num) { // 파라미터 변수명과 같지 않아도 됨
		//받아올 변수 생성 : MainClass04에서 받아온 값(자료형 일치)
		//argument : 메소드에서 받아주는 값 , 매게변수
		
		//기능 분리 
		int sum=0;
		for (int i=0; i <=num; i++) {
			sum +=i;
		}
		System.out.println("1 ~ " +num + "까지의 합 : "+sum);
		
		
		
	}
}
