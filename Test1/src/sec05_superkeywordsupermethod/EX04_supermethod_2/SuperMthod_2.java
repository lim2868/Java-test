package sec05_superkeywordsupermethod.EX04_supermethod_2;

class A{
	A(){
		this(3);
		System.out.print("A 생성자 1 ");
	}
	A(int a){
		System.out.print("A 생성자 2 ");
	}
}
class B extends A {
	B(){
		this(3);
		System.out.print("B 생성자 1 ");
	}
	B(int a){
		// super(); 숨겨져 있음 상속받은 B() 생성자 안에 입력 매개변수가 존재하면 super가 생략 되어 있다.
		System.out.print("B 생성자 2 ");
	}
}
public class SuperMthod_2 {
	
	public static void main(String[] args) {
		
		A aa1 = new A(); System.out.println(); 
		A aa2 = new A(3); System.out.println();
		B bb1 = new B(); System.out.println(); 
		B bb2 = new B(3);
	}
}
