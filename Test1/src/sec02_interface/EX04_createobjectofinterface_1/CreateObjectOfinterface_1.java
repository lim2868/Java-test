package sec02_interface.EX04_createobjectofinterface_1;

interface A{
	int a = 3;
	void abc();
}
class B implements A{
	public void abc() {
		System.out.println("방법1. 자식 클래스 생성자료 객체 생성");
	}
}
public class CreateObjectOfinterface_1 {

	public static void main(String[] args) {
		
		A b1 = new B();
		A b2 = new B();
		b1.abc();
		b2.abc();
		A a1 = new A() {
			public void abc() {
				System.out.println("방법2. 익명 이너클래스를 이용한 객체 생성");
			}
		};
		A a2 = new A() {
			public void abc() {
				System.out.println("방법2. 익명 이너클래스를 이용한 객체 생성");
			}
		};
		a1.abc();
		a2.abc();
	}
}
