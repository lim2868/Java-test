package sec04_anonymousclass.EX01_AnonymousClass_1;

class A{
	C c = new B();
	void abc() {
		c.bcd();
		d.bcd();
	}
	class B implements C {
		public void bcd() {
			System.out.println("인스턴스 이너 클래스");
		}
	}
	
	C d = new C() {
		public void bcd() {
			System.out.println("익명 이너 클래스");
		}
	};
}
interface C {
	public abstract void bcd();
}
public class AnonymousClass_1 {

	public static void main(String[] args) {
		
		A a = new A();
		a.abc();
	}

}
