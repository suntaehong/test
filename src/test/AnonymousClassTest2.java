package test;

/*
# 익명 클래스(anonymous class) 개념

(1) 클래스명이 없는 클래스를 말함
 - 일반 내부 클래스 : 외부클래스명$내부클래스명.class로 저장
 - 익명 클래스 : 외부클래스명$1.class 로 파일로 존재
 
(2) 선언과 생성이 동시에 이뤄진다.

(3) 일회성

(4) 안드로이드 프로그래밍에서 익명 클래스 형식을 많이 사용한다.

# 익명 클래스(anonymous class) 형식

	클래스명 클래스변수 = new 클래스명() {
		멤버 변수와 메소드들 선언
	}; <-- ';' 이 중요함
	
	인터페이스 인터페이스변수 = new 인터페이스명() {
		변수와 메소드들 선언
	}; <-- ';' 이 중요함

# 익명 클래스(anonymous class) 사용예
 - 인터페이스를 상속한 클래스 사용의 일반적인 형식
 - 인터페이스를 상속한 익명 클래스를 이용 형식
 - 익명 클래스를 메소드의 매개변수로 사용하는 예
	
**/


// 익명 클래스를 메소드의 매개변수로 사용하는 예

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
		
		// 익명 클래스를 메소드의 매개변수로 사용
		Test1.setClass(new ClassC());
		
		Test1.setClass(new ClassC() {
			public void print() {
				System.out.println("good !");
			}
		});
	}

}
