package sec02_staticmodifier.Ex04_StaticInitialBlock;

class A{
	int a;
	static int b;
	static {
		b = 5;
		System.out.println("클래스 A가 로딩되었습니다");
	}
	A(){
		b = 3;
		System.out.println("클래스 A의 생성자가 호출되었습니다.");
	}
}
public class StaticInitialBlock {

	public static void main(String[] args) {
//		System.out.println(A.b);
		A a = new A();
		System.out.println(A.b);
	}
}
