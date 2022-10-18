package study;

import java.util.Random;

public class Product {
	private int n; // 제품 : n
	private boolean isNew; // 생산하면 true, 소비하면 false

	// 생산자가 새로운 제품(정수)을 만들어내는 메소드
	public synchronized void produce() {
		while (isNew == true) { // 소비하면 false니깐 탈출한다.
			try {
				wait();
			} catch (Exception e) {
			}
		}
		Random r = new Random();
		n = r.nextInt(100) + 1; // 랜덤으로 1부터 100까지 제품을 생산
		System.out.println("생산자가 새로운 제품을 생산 : "+n);
		isNew = true;
		notify();
	}

	// 소비자가 제품(정수)을 사용하는 메소드
	public synchronized int consume() {
		while (isNew == false) {
			try {
				wait();
			} catch (Exception e) {
			}
		}
		System.out.println("소비자가 제품을 소비함 : "+n);
		isNew = false;
		notify();
		return n;
	}

}
