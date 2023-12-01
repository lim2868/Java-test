package sec03_threadproperties.ex03_threadproperties_3_1;

class MyThread extends Thread{
	@Override
	public void run() {
		System.out.println(getName() + ": "+(isDaemon()?"데몬쓰레드":"일반쓰레드" ));
		for (int i = 0; i<6; i++) {
			System.out.println(getName()+": " + i + "초");
			try {Thread.sleep(1000);}catch(InterruptedException e) {}
		}
	}
}
public class ThreadProperties_3_1 {

	public static void main(String[] args) {
		
		Thread thread1 = new MyThread();
		thread1.setDaemon(true); // false 일반쓰레드 : 메인 쓰레드가 종료되도 계속 진행
		                         // true 데몬쓰레드 : 메인쓰레드가 종료되면 더이상 진행하지 않음.
		thread1.setName("thread1");
		thread1.start();
//		try {
//			thread1.setDaemon(true);
//		} catch(IllegalThreadStateException e) {
//			System.out.println("쓰레드 start 이후에는 데몬 상태를 변경할 수 없음");
//		}
		try {Thread.sleep(3500);}catch(InterruptedException e) {}
		System.out.println("main thread 종료");
	}
}
