
public class AnotherThread extends Thread{

	@Override
	public synchronized void start() {
	//	System.out.println(ThreadColor.ANSI_BLUE + "Hello from another thread.");
	//	System.out.println(ThreadColor.ANSI_BLUE + " Hello from " + currentThread().getName()); //this gave me "main" instead of "==Another Thread =="
		System.out.println(ThreadColor.ANSI_BLUE + " Hello from " + getName());
	}
	
}
