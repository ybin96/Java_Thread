package study;

public class PersonTest {
	public static void main(String[] args) {
		Person kim = new Person("김유신");
		Person lee = new Person("이순신");
		Person hong = new Person("홍길동");
		
		lee.setPriority(Thread.MAX_PRIORITY); // 최고우선순위
		kim.setPriority(Thread.MIN_PRIORITY); // 최저우선순위
		
		
		kim.start();
		lee.start();
		hong.start();
	}
}
