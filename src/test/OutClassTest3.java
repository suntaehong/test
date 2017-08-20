package test;

// 정적(static) 내부클래스 사용 예
class OutClass3
{
	static int nVar3 = 3;
	
	static class InnerClass3
	{
		static void print() { 
			System.out.println("static inner class"); 
			System.out.println("out class static nVar3 : " + nVar3); 
		}
	}
}

public class OutClassTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 객체 생성없이 바로 정적 내부클랙스 함수 호출
		OutClass3.InnerClass3.print();
	}

}
