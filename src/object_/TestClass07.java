package object_;

public class TestClass07 {
	private void test() {} // * private : 정보 은닉
	public void test1(int num) {
		if(num ==1) {
			System.out.println(1111);
			return ; // 옳다면 "다음 문장 실행" X 메소드 바로 종료
		}
		System.out.println("다음 문장 실행"); 
	} 
	
	public void test2(int n) {
		if (n==1) {
				System.out.println("test 111");
		//return 100; ->오류
			
		}else if (n==1) {
		System.out.println("test2 222");
	 }else {
		System.out.println("다음 문장 실행"); 
		return;//문장 끝 & else 안
	 }
		
   }
	
	public boolean  test3(){
		return true;
	}
		
	/*public int test4() {
		int num = 1;
		if(num==1) 
			return num;
			return 0; //아무 값 없음*/
		
		
		public String test05() {
			int num = 1;
			if(num==1) 
				return "aaa";
				return null; //아무 값 없음
			
		
	}
		
		/*
		 -모든 문제는 main, 연산, 인력, 출력하는 기능으로 만드세요
		 만약 연산하는 기능이 없으면 없어도 됨 
		 
		 1. 3개의 이름을 입력 받아 출력(배열, ArrL, Hashmap)
		 2. 입력값의 짝/홀 구분
		 3. 입력값이 3의 배수인지 구분
		 4. 입력 값이 소수인지 판별
		 5. 절대값을 구하는 메소드
		 */
	
	
	
}//end