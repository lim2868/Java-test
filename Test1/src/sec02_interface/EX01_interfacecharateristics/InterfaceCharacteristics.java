package sec02_interface.EX01_interfacecharateristics;

interface A{
	public static final int a = 3;
	public abstract void abc();
}

interface B{
	int b = 3;         // public static final 생략가능
	void bcd();        // public abstract 생략가능
}
public class InterfaceCharacteristics {

	public static void main(String[] args) {
		
		System.out.println(A.a);
		System.out.println(B.b);
	}
}
