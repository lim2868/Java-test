package sec05_threadstates.ex03_timedwaiting_sleep;
class MyThread extends Thread{
	@Override
	public void run() {
		try {
			Thread.sleep(10000);
		} catch(InterruptedException e) {
			System.out.println(" -- sleep() 진행중 interrupt 발생");
			for(long i = 0; i<1000000000L; i++) {} 
		}
	}
}
public class TimedWaiting_Sleep {

	public static void main(String[] args) {
		
		MyThread myThread =new MyThread();
		myThread.start();
		try {Thread.sleep(100);}catch(InterruptedException e) {}
		System.out.println("MyThread state = " +  myThread.getState());
		myThread.interrupt();
		try {Thread.sleep(100);}catch(InterruptedException e) {}
		System.out.println("MyThread State = " + myThread.getState());
	}
}