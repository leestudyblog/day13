package pra_;

import java.util.Scanner;

public class ExTest01 {
	public String [] test01() {
		//입력 기능
		Scanner input = new Scanner(System.in);
		String [] arr = new String[3];
	
			for(int i=0; i<arr.length; i++) {
			System.out.println("이름 입력 : ");
			arr[i] = input.next();
			System.out.println("입력 받은 이름 : " + arr[i]);
		}return arr;
		
		
	}
	//출력 기능
	public void print(int [] inputArr) {
		System.out.println("이름 : " + inputArr);
		
	}
	
	
	
	
}
