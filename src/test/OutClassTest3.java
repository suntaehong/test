package test;

// ����(static) ����Ŭ���� ��� ��
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
		// ��ü �������� �ٷ� ���� ����Ŭ���� �Լ� ȣ��
		OutClass3.InnerClass3.print();
	}

}
