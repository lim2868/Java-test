package sec03_methodoverriding.EX03_methodoverriding_3;

class A{
	void print1() {System.out.println("A 클래스 print1");}
	void print2() {System.out.println("A 클래스 print2");}
}
class B extends A{
	void print1() {
		System.out.println("B 클래스 print1");
	}
	void print2(int a ) {
		System.out.println("B 클래스 print2");
	}
}
public class MethodOverriding_3 {

	public static void main(String[] args) {
		
		A aa = new A();
		aa.print1();
		aa.print2();
		System.out.println();
		B bb = new B();
		bb.print1();
		bb.print2();
		bb.print2(3);
		System.out.println();
		A ab = new B(); // 1. 접근범위는 자료형 2. 오버라이드로 덮어진 코드 실행
		ab.print1();
		ab.print2();
	}
}
