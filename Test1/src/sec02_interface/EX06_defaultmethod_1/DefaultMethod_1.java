package sec02_interface.EX06_defaultmethod_1;

interface A{
	void abc();
	default void bcd() {
		
	}
}
class B implements A{
	public void abc() {
		System.out.println("B 클래스의 abc()");
	}
}
class C implements A{
	public void abc() {
		System.out.println("C클래스의 abc()");
	}
	public  void bcd() {
		System.out.println("C클래스의 bcd()");
	}
}
public class DefaultMethod_1 {

	public static void main(String[] args) {
		
		A a1 = new B();
		A a2 = new C();
		a1.abc();
		a1.bcd();
		a2.abc();
		a2.bcd();
	}
}
