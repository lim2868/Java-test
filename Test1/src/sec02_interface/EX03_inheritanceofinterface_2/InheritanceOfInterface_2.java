package sec02_interface.EX03_inheritanceofinterface_2;

interface A{
	public abstract void abc();
}
interface B{
	void bcd();
}
class C implements A{
	public void abc() {}
}
//class D implements B {
//	void bcd() {}   //interface를 구현할때는 꼭 public 붙어야됨
//}
public class InheritanceOfInterface_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
