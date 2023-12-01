package sec02_interface.EX08_staticmethod;

interface A{
	static void abc() {
		System.out.println("A 인터페이스의 정적 메서드 abc()");
	}
}
public class StaticMethod {

	public static void main(String[] args) {
		
		A.abc();
	}
}