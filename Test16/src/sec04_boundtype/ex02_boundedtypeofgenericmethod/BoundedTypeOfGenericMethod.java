package sec04_boundtype.ex02_boundedtypeofgenericmethod;

class A{
	public <T extends Number> void method1(T t) {
		System.out.println(t.intValue());
	}
}
interface MyInterface{
	public abstract void print();
}
class MI implements MyInterface{
	@Override
	public void print() {
		System.out.println("print() 구현");
	}
}
class B {
	public <T extends MyInterface> void method1(T t) {
		t.print();
	}
}
public class BoundedTypeOfGenericMethod {

	public static void main(String[] args) {
		
		A a = new A();
		a.method1(5.8);
		B b = new B();
		MI mi = new MI();
		b.method1(mi);
//		b.method1(new MyInterface() {
//			@Override
//			public void print() {
//				System.out.println("print() 구현");
//			}
//		});
		
	}

}
