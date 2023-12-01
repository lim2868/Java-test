package sec03_methodoverriding.EX02_methodoverriding_2;
class Animal{ void cry() {}}
class Bird extends Animal{
	@Override
	void cry() {System.out.println("짹짹");}
}
class Cat extends Animal{
	@Override
	void cry() {System.out.println("야옹");}
}
class Dog extends Animal{
	@Override
	void cry() {System.out.println("멍멍");}
}
public class MethodOverriding_2 {
	
	public static void main(String[] args) {
		
		Animal aa = new Animal();
		Bird bb = new Bird();
		Cat cc= new Cat();
		Dog dd= new Dog();
		aa.cry();bb.cry();cc.cry();dd.cry();
		Animal ab = new Bird();
		Animal ac = new Cat();
		Animal ad = new Dog();
		ab.cry();ac.cry();ad.cry();
		Animal[] animals = {ab,ac,ad};
		for(Animal animal : animals) {
			if(animal instanceof Bird) {
				animal.cry();
			}else {
				System.out.println("새가 아닙니다.");
			}
		}
	}
}