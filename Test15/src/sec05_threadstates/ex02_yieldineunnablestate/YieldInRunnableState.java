package sec05_threadstates.ex02_yieldineunnablestate;

class MyThread extends Thread{
	boolean yieldFlag;
	@Override
	public void run() {
		while(true) {
			if(yieldFlag) {
				Thread.yield();
			}else {
				System.out.println(getName() + " 실행");
				for(long i = 0; i<1000000000L; i++) {}
			}
		}
	}
}
public class YieldInRunnableState {

	public static void main(String[] args) {
		
		MyThread thread1 = new MyThread();
		thread1.setName("thread1");
		thread1.yieldFlag = false;
		thread1.setDaemon(true);
		thread1.start();
		MyThread thread2 = new MyThread();
		thread2.setName("thread2");
		thread2.yieldFlag = true;
		thread2.setDaemon(true);
		thread2.start();
		for(int i = 0; i<6; i++) {
			try {Thread.sleep(1000);} catch(InterruptedException e) {}
			thread1.yieldFlag = !thread1.yieldFlag;
			thread2.yieldFlag = !thread2.yieldFlag;
		}
	}

}
