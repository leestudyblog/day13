package object_;

import java.util.Scanner;

public class TestClass06 {
	
	//입력기능
	public int[] myInput() {
		Scanner sc = new Scanner(System.in);
		int n1, n2, sum;
		System.out.println("수 입력 : ");
		n1 = sc.nextInt();
		System.out.println("수 입력 : ");
		n2 = sc.nextInt();
		int [] arr = {n1, n2};
		return arr; // return 하나의 값만 반환할 수 있기 때문에 배열로 만듦
	}
	//연산기능
	public int test(int n1, int n2, int[] n) { //받은 값
		
		int sum = n1+n2;
		return sum;
		
	}
	//출력기능
	public void print(int [] n, int sum) {
		System.out.println(n[0]+"+"+n[1] +"="+sum);
		
	}
	
}
