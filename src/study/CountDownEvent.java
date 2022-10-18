package study;

public class CountDownEvent extends Thread {
	private int time;
	private String message;
	public CountDownEvent(int time, String message) {
		super();
		this.time = time;
		this.message = message;
	}
	public void run() {
		try {
		Thread.sleep(1000*time);
		}catch(Exception e) {
			
		}
		System.out.println(message);
	}
}
	
