package sec03_threadproperties.ex05_threadproperties_3_3;

class MyThread extends Thread{
	@Override
	public void run() {
		System.out.println(getName() + ": " +(isDaemon()?"데몬쓰레드":"일반쓰레드"));
		for(int i = 0; i<6; i++) {
			System.out.println(getName() + ": " +i+"초");
			try {Thread.sleep(1000);} catch(InterruptedException e) {}
		}
	}
}
public class ThreadProperties_3_3 {

	public static void main(String[] args) {
		
		Thread thread1 = new MyThread();
		thread1.setDaemon(false);
		thread1.setName("thread1");
		thread1.start();
		Thread thread2 = new MyThread();
		thread2.setDaemon(true);
		thread2.setName("thread2");
		thread2.start();
		try {Thread.sleep(3500);}catch(InterruptedException e) {}
		System.out.println("main Thread 종료");
		// 데몬스레드는 프로세스가 살아있는동안 유지된다.
		// => 데몬스레드는 프로세스의 유지를 하지못한다.
		// 메인 스레드가 종료되면 프로세스도 종료되지만 일반스레드는 
	}
}

