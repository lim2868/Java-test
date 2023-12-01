package sec03_throwsexception.EX03_throwsexception_3;

class A{
	void abc() {
		bcd();
	}
	void bcd() {
		try {
			Class clas = Class.forName("java.lang.Object");
			Thread.sleep(1000);
		} catch(InterruptedException | ClassNotFoundException e) {}
	}
}
class B{
	void abc() {
		try {
			bcd();
		}catch(InterruptedException | ClassNotFoundException e) {}
	}
	void bcd() throws InterruptedException, ClassNotFoundException {
		Class cls = Class.forName("java.lang.Object");
		Thread.sleep(1000);
	}
}
public class ThrowsException_3 {

	public static void main(String[] args) {

	}
}
