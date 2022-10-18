package study;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		System.out.println("korea");
		System.out.println("korea");
		System.out.println("korea");
		System.out.println("korea");
		System.out.println("korea");
		GregorianCalendar now = new GregorianCalendar();
		System.out.println(now.get(Calendar.HOUR));
		System.out.println(now.get(Calendar.MINUTE));
		System.out.println(now.get(Calendar.SECOND));
	}
}
