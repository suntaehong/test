package test;

/*
# �͸� Ŭ����(anonymous class) ����

(1) Ŭ�������� ���� Ŭ������ ����
 - �Ϲ� ���� Ŭ���� : �ܺ�Ŭ������$����Ŭ������.class�� ����
 - �͸� Ŭ���� : �ܺ�Ŭ������$1.class �� ���Ϸ� ����
 
(2) ����� ������ ���ÿ� �̷�����.

(3) ��ȸ��

(4) �ȵ���̵� ���α׷��ֿ��� �͸� Ŭ���� ������ ���� ����Ѵ�.

# �͸� Ŭ����(anonymous class) ����

	Ŭ������ Ŭ�������� = new Ŭ������() {
		��� ������ �޼ҵ�� ����
	}; <-- ';' �� �߿���
	
	�������̽� �������̽����� = new �������̽���() {
		������ �޼ҵ�� ����
	}; <-- ';' �� �߿���

# �͸� Ŭ����(anonymous class) ��뿹
 - �������̽��� ����� Ŭ���� ����� �Ϲ����� ����
 - �������̽��� ����� �͸� Ŭ������ �̿� ����
 - �͸� Ŭ������ �޼ҵ��� �Ű������� ����ϴ� ��
	
**/


// �͸� Ŭ������ �޼ҵ��� �Ű������� ����ϴ� ��

interface Testable2 {
	public void print();
}

class ClassC implements Testable2
{
	public void print() { System.out.println("Hi !"); }
}

class ClassD
{
	void setClass( ClassC ObjectA ) 
	{
		ObjectA.print();
	}
}

public class AnonymousClassTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassD Test1 = new ClassD();
		
		// �͸� Ŭ������ �޼ҵ��� �Ű������� ���
		Test1.setClass(new ClassC());
		
		Test1.setClass(new ClassC() {
			public void print() {
				System.out.println("good !");
			}
		});
	}

}
