package sec02_interface.EX07_defaultmethod_2;

interface A{
	default void abc() {
		System.out.println("A인터페이스의 abc()");
	}
}
interface B{
	default void abc() {
		System.out.println("B인터페이스의 abc()");
	}
}
class C implements A,B{
	public void abc() {
		B.super.abc();
		System.out.println("B클래스의 abc()");
	}
}
public class DefalutMethod_2 {

	public static void main(String[] args) {
		
		C c = new C();
		c.abc();
	}
}
