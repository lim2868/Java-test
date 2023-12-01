package sec02_genericclass.ex03_solution_generic;

class Apple{}
class Pencil{}
class Banana{}
class Car{}
class Goods<T>{
	private T t;
	public T get() {
		return t;
	}
	public void set(T t) {
		this.t = t;
	}
}
public class Solution2_Generic {

	public static void main(String[] args) {
		
		Goods<Apple> goods1 = new Goods<>();
		goods1.set(new Apple());
		Apple apple = goods1.get();
		Goods<Pencil> goods2 = new Goods<>();
		goods2.set(new Pencil());
		Pencil pencil = goods2.get();
		Goods<Apple> goods3 =new Goods<>();
		goods3.set(new Apple());
//		Pencil pencil2 = goods3.get();
//		사과 담을거에 펜으로 담아서 오류뜸
		Goods<Banana> goods4 = new Goods<>();
		goods4.set(new Banana());
		Goods<Car> goods5 = new Goods<>();
		goods5.set(new Car());
		Car car = goods5.get();
	}
}