package study;

public class Producer extends Thread {
	private Product product; // 생산자가 product라는 객체를 생성

	public Producer(Product product) {
		super();
		this.product = product;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			product.produce();
			try {
				Thread.sleep(200);
			} catch (Exception e) {
			}
		}

	}
}
