
public class ThreadTester {

	public static void main(String[] args) {
		
		System.out.println(ThreadColor.ANSI_PURPLE + " Hello from the main thread.");
		
		Thread anotherThread = new AnotherThread();
		anotherThread.setName("== Another Thread ==");
		anotherThread.start();

		new Thread() {
			public void run() {
			System.out.println(ThreadColor.ANSI_GREEN + " Hello from the anonymous class thread.");	
			}
		}.start();
		
		Thread myRannableThread = new Thread(new MyRunnable() {
			public void run() {
				System.out.println(ThreadColor.ANSI_RED + " Hello from the anonymous class's implementation of run().");
			}
		});
		
		myRannableThread.start();
		System.out.println(ThreadColor.ANSI_PURPLE + " Hello again from the main thread.");
		
		//anotherThread.start();
		
		
	}

}
