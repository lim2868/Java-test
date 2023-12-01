package sec05_superkeywordsupermethod.EX03_supermethod_1;

class A{
	A(){
		System.out.println("A 생성자");
	}
}
class B extends A{
	B(){
//		super();
		System.out.println("B 생성자");
	}
}
class C {
	C(){
		System.out.println("C 생성자");
	}
}
class D extends C {
	D(){                    // 생성자를 안넣으면 컴파일러가 알아서 
		super();            // D() {super();} 를 만들어줌
	}
}
public class SuperMethod_1 {

	public static void main(String[] args) {
		C cc = new C();
		System.out.println();
		D dd = new D();
	}
}