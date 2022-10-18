package study;

public class Person extends Thread{
	private String name;

	public Person(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("hello,"+name+"===>"+i);
			
			try {
				Thread.sleep(200);
			}catch(Exception e) {
			}
		}
	}
}
