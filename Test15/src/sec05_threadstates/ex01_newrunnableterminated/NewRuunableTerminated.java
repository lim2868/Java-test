package sec05_threadstates.ex01_newrunnableterminated;

public class NewRuunableTerminated {

	public static void main(String[] args) {

		Thread.State state;
		Thread myThread = new Thread() {
			@Override
			public void run() {
				for (long i = 0; i < 10000000L; i++) {
}
			}
		};

		state = myThread.getState();
		System.out.println("myThread state = " + state);
		myThread.start();
		state = myThread.getState();
		System.out.println("myThread state = " + state);
		try {
			myThread.join();
		} catch (InterruptedException e) {}
		state = myThread.getState();
		System.out.println("myThread state = " + state);
	}
}