package test;

// �ν��Ͻ� ����Ŭ����  ��� ��
class OutClass2
{
	int nVar1 = 3;
	
	class InnerClass2
	{
		void print() { System.out.println("OutClass nVar1 :" + nVar1); }
	}
}

public class OutClassTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OutClass2 OutTest2 = new OutClass2();
		
		// �幰�� ���
		OutClass2.InnerClass2 InnerTest2 = OutTest2.new InnerClass2();
		InnerTest2.print();
	}

}
