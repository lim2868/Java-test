package sec01_finalmodifier.EX02_finalmodefier_2;

class A {
	void abc() {}
	final void bcd() {
		System.out.println("클래스 A의 bcd()메서드입니다.");
	}

}
class B extends A {
	void abc() {}
}
final class C {}
public class FinalModifier_2 {

	public static void main(String[] args) {
		
		A aa = new A();
		aa.bcd();
		B bb = new B();
		bb.bcd();
	}
}