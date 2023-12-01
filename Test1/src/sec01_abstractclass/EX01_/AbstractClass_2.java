package sec01_abstractclass.EX01_;

abstract class A1{
	abstract void abc();
}

public class AbstractClass_2 {

	public static void main(String[] args) {
		
		A1 a1 = new A1() {
			void abc() {
				System.out.println("방법2. 익명 이너 크래스 방법으로 객체 생성");
			}
		};
		A1 a2 = new A1() {
			void abc() {
				System.out.println("방법2. 익명 이너 크래스 방법으로 객체 생성");
			}
		};
		a1.abc();
		a2.abc();
	}
}
