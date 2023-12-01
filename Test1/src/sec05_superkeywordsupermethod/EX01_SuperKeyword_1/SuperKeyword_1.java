package sec05_superkeywordsupermethod.EX01_SuperKeyword_1;

class A{
	void abc() {
		System.out.println("A 클래스의 abc()");
	}
}
class B extends A{
	void abc() {
		System.out.println("B 클래스의 abc()");
	}
	void bcd() {
		abc();        // 자식 B 클래스 호출
		super.abc();  // 숨겨져 있던 부모 A 클래스 호출
	}
}
public class SuperKeyword_1 {

	public static void main(String[] args) {
		
		B bb = new B();
		bb.bcd();
	}
}
