package sec05_inheritanceofgeneric.ex01_inheritancegenericclass;

class Parent<T>{
	T t;
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t=t;
	}
}
class Child1<T> extends Parent<T>{}
class Child2<T,V> extends Parent<T>{
	V v;
	public V getV() {
		return v;
	}
	public void setV(V v) {
		this.v=v;
	}
}
public class InheritanceGenericClass {

	public static void main(String[] args) {
		
		Parent<String> p = new Parent<>();
		p.setT("부모 제네릭 클래스");
		System.out.println(p.getT());
		Child1<String> c1 = new Child1<>();
		c1.setT("자식 1 제네릭 클래스");
		System.out.println(c1.getT());
		Child1<Integer> c11 = new Child1<>();
		c11.setT(111);
		System.out.println(c11.getT());
		Child2<String, Integer> c2 = new Child2<>();
		c2.setT("자식 2 제네릭 클래스");
		c2.setV(100);
		Child2<Integer, Integer> c22 = new Child2<>();
		c22.setT(100);
		c22.setV(1000);
		System.out.println(c2.getT());
		System.out.println(c2.getV());
		//<> 이안에 들어오는거는 상속받은게 아님
	}
}