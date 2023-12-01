package sec02_staticmodifier.EX01_StaticFideld_1;

class A {
	int m = 3;
	static int n = 5;
}
public class StaticField_1 {

	public static void main(String[] args) {
		A a1 = new A();
		System.out.println(a1.m);
		
		System.out.println(A.n);
		
	}
}
