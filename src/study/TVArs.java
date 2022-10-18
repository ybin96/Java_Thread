package study;

public class TVArs {

	public static void main(String[] args) {
		Account account = new Account();
		Donor d1 = new Donor("김영빈", account);
		Donor d2 = new Donor("박세인", account);
		Donor d3 = new Donor("강성은", account);
		Donor d4 = new Donor("양희주", account);
		Donor d5 = new Donor("허정인", account);

		d1.start(); // 가능한 공평하게 실행되기 때문에 
		d2.start(); // 총모금액이 중간 아무곳이나 나올수 있다.
		d3.start();
		d4.start();
		d5.start();
		try {
			d1.join(); //
			d2.join();
			d3.join();
			d4.join();
			d5.join();
		} catch (Exception e) {
		}
		System.out.println("총 모금액 : " + account.getBalance());
	}
}
