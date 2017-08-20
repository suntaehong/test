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


// �������̽��� ����� Ŭ���� ����� �Ϲ����� ����
// �������̽��� ����� �͸� Ŭ������ �̿� ����

interface Testable {
	public void print();
}

class InterfaceClass implements Testable
{
	public void print() { System.out.println("Hi !"); }
}

class ClassA
{
	public void print() { System.out.println("good !"); }
}

public class AnonymousClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceClass Test1 = new InterfaceClass();
		Test1.print(); // �Ϲ����� Ŭ���� ȣ��
		ClassA Test2 = new ClassA();
		Test2.print(); // �Ϲ����� Ŭ���� ȣ��
		
		// �������̽��� ����� Ŭ���� ����� �Ϲ����� ����
		InterfaceClass Test3 = new InterfaceClass() {
			public void print() {
				System.out.println("Anonymous interface 1 !");
			}
		};
		Test3.print();
		
		ClassA Test4 = new ClassA() {
			public void print() {
				System.out.println("Anonymous class !");
			}
		};
		Test4.print();
		
		// �������̽��� ����� �͸� Ŭ������ �̿� ����
		Testable Test5 = new Testable() {
			public void print() {
				System.out.println("Anonymous interface 2 !");
			}
		};
		Test5.print();
		
	}

}
