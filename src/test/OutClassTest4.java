package test;

// 외부 클래스 메소드에서 내부 클래스를  사용하는 예(지역 클래스)
class OutClass4
{
	int nVar4 = 3;
	
	class InnerClass4
	{
		void print() { System.out.println("OutClass nVar4 :" + nVar4); }
	}
	
	// 메소드에선 내부 클래스가 지역 클래스 변수
	void print()
	{
		InnerClass4 Inner4 = new InnerClass4();
		Inner4.print();
	}
}

public class OutClassTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OutClass4 OutTest4 = new OutClass4();
		OutTest4.print();
	}

}
