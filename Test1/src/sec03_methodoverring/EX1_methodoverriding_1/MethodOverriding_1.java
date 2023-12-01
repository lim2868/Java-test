package sec03_methodoverring.EX1_methodoverriding_1;

class A{
	void print() {
		System.out.println("A클래스");
	}
}
class B extends A{
	@Override // 내가 오버라이딩를 할건데 오버라이딩에 맞지 않는 규격이나 오타가 날 경우 알려달라는 메세지 
	void print() {
		System.out.println("B클래스");
	}
}
class C extends A{
	@Override
	void print() {
		System.out.println("C클래스");
	}
}
public class MethodOverriding_1 {

	public static void main(String[] args) {
		A aa = new A();
		aa.print();
		B bb = new B();
		bb.print();
	    A ab = new B();
	    ab.print();
	}
}
