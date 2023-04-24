package object_;

public class TestClass05 {
	public int sumFunc(int num) { //반환타입 : void -> int(반환할 sum이 int)
		
		int sum=0;
		for (int i=0; i <=num; i++) {
			sum +=i;
		}
		//return : 값을 돌려주면서 해당 메소드 종료
		// 값이 없으면 해당 메소드만 종료
		// return으로 값을 돌려줄 경우 하나만 가능하다.
		
		//리턴 자료형 - 반환 타입 자료형 맞추기
		return sum; 
		
		
	}
}
