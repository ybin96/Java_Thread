package study;

public class BoxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b1 = new Box(20,30,40);
		Box b2 = new Box(20,30,40);
		b1.calcVolume();
		b2.calcVolume();
		
		System.out.println(b1);
		System.out.println(b2);
		
		if (b1.equals(b2)) {
			System.out.println("같아요");
		}else {
			System.out.println("달라요");
		}
	}
}
