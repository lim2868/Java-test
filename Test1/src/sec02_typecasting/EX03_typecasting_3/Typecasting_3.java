package sec02_typecasting.EX03_typecasting_3;
class A{}
class B extends A{}

public class Typecasting_3 {

	public static void main(String[] args) {
		
		A aa = new A();
		A ab = new B();
		System.out.println(aa instanceof A);
		System.out.println(ab instanceof A);
		System.out.println(aa instanceof B);
		System.out.println(ab instanceof B);
		if(aa instanceof B) {
			B b = (B) aa;
			System.out.println("aa를 B로 다운캐스팅");
		} else {
			System.out.println("aa를 B로 다운캐스팅 불가");
		}
		if(ab instanceof B) {
			B b = (B) ab;
			System.out.println("ab를 B로 다운캐스팅");
		} else {
			System.out.println("ab는 B로 다운캐스팅 불가");
		}
		if("안녕" instanceof String) {
			System.out.println("\"안녕\"은 String클래스입니다");
		}
	}
}
