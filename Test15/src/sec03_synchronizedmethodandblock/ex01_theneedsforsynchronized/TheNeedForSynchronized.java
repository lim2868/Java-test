package sec03_synchronizedmethodandblock.ex01_theneedsforsynchronized;

class MyData{
	int data = 3;
	public void plusData() { // 동기화가 필요한 앞에다가 synchronized 붙여줌 
		synchronized(this) {
			int mydata = data;
			try {Thread.sleep(2000);} catch(InterruptedException e) {}
			data = mydata + 1;
		}
//		int mydata = data;
//		try {Thread.sleep(2000);} catch(InterruptedException e) {}
//		data = mydata + 1;
//	}
   }
}
class PlusThread extends Thread{
	MyData myData;
	public PlusThread(MyData myData) {
		this.myData = myData;
	}
	@Override
	public void run() {
		myData.plusData();
		System.out.println(getName() + "실행 결과 : " + myData.data );
	}
}
public class TheNeedForSynchronized {

	public static void main(String[] args) {
		
		MyData myData = new MyData();
		Thread plusThread1 = new PlusThread(myData);
		plusThread1.setName("plusthread1");
		plusThread1.start();
		try {Thread.sleep(1000);}catch(InterruptedException e) {}
		Thread plusThread2 = new PlusThread(myData);
		plusThread2.setName("plusThread2");
		plusThread2.start();
	}	

}
