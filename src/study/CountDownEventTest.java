package study;

public class CountDownEventTest {

	public static void main(String[] args) {
		CountDownEvent c = new CountDownEvent(5,"안녕");
		c.start();
	}
}
