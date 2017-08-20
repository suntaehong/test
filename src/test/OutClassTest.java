package test;

// 인스턴스 내부클래스  사용 예
class OutClass
{
	int nVar1 = 3;
	
	class InnerClass
	{
		void print() { System.out.println("OutClass nVar1 :" + nVar1); }
	}
	
	InnerClass Inner = new InnerClass();
}

public class OutClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OutClass OutTest1 = new OutClass();
		OutTest1.Inner.print();
	}

}
