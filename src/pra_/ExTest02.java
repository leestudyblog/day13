package pra_;

import java.util.Scanner;

public class ExTest02 {
	
	public String test1(){
		
		Scanner sc= new Scanner(System.in);
		System.out.println("값을 입력하세요");
		int a=sc.nextInt();
		String b;
			if(a%2==0) {
			b= "짝수입니다.";
		}else {
			b= "홀수입니다.";
			
		}return b;
	} 
	
	
	
	
	/*public String test2( int num) {//연산
		
		
		
	}
	
	public void test3() {//출력
		
	}
	*/
	
	
	
}
