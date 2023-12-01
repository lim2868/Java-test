package sec04_userexception.EX02_Exceptionmethod_2;

class A{
	void abc() throws NumberFormatException{
		bcd();
	}
	void bcd() throws NumberFormatException{
		cde();
	}
	void cde() throws NumberFormatException{
		int num = Integer.parseInt("10A");
	}
}
public class ExceptionMethod_2 {

	public static void main(String[] args) {
		
		A a = new A();
		try {
			a.abc();
		} catch(NumberFormatException e) {
			e.printStackTrace();
		}
	}
}
