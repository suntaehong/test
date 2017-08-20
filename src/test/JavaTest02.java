package test;

public class JavaTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B Test1 = new B();
		Test1.print();
		Test1.print1();
		
		A Test2 = new B();
		Test2.print();
		Test2.print1();
		
		A Test3 = new C();
		Test3.print1(); 
	}

}

abstract class A
{
	public int m_nVar = 7;
	public void print() {System.out.println("A class");}
	abstract void print1();
}

class B extends A
{
	void print1() {System.out.println("B class");}
}

class C extends A
{
	void print1() {System.out.println("C class");}
}