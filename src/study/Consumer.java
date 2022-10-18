package study;

public class Consumer extends Thread {
	private Product product;

	public Consumer(Product product) {
		super();
		this.product = product;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			product.consume();
			try {
				Thread.sleep(100);
			} catch (Exception e) {
			}
		}
	}
}
