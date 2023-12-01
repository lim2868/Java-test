package sec02_staticmodifier.EX02_StaticFideld_1;

class A {
	int m = 3;
	static int n = 5;
}
public class StaticFielid_2 {

	public static void main(String[] args) {
		
		A a1 = new A();
		A a2 = new A();
		a1.m = 5;
		a2.m = 6;
		System.out.println(a1.m);
		System.out.println(a2.m);
		a2.m = 7;
		a1.n=7;
		a2.n=8;
		System.out.println(a2.m);
		System.out.println(a1.n);
		System.out.println(a2.n);
		A.n=9;
		System.out.println(a1.n);
		System.out.println(a2.n);
	}
}