package sec02_staticcinnerclass.EX01_CreateObjectAbdAccessMember;

class A {
	int a = 3;
	static int b = 4;

	void method1() {
		System.out.println("instance method");
	}

	static void method2() {
		System.out.println("static method");
	}

	static class B {
		static void bcd() {
//			System.out.println(a);
			System.out.println(b);
//			method1();
			method2();
		}
	}
}

public class CreateObjectAndAccessMember {

	public static void main(String[] args) {

		A.B.bcd(); // static
	}
}