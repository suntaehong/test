package test;

// �ܺ� Ŭ���� �޼ҵ忡�� ���� Ŭ������  ����ϴ� ��(���� Ŭ����)
class OutClass4
{
	int nVar4 = 3;
	
	class InnerClass4
	{
		void print() { System.out.println("OutClass nVar4 :" + nVar4); }
	}
	
	// �޼ҵ忡�� ���� Ŭ������ ���� Ŭ���� ����
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
