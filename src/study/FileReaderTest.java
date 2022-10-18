package study;

import java.io.FileReader;

public class FileReaderTest {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("hello.txt");
			int ch; // 65
			while (true) {
				ch = fr.read();
				if (ch == -1) {
					break;
				}
				System.out.println((char)ch);// 65이므로 char로 형변환해줘야한다.
			}
			fr.close();
		} catch (Exception e) {
			System.out.println("예외발생:" + e.getMessage());
		}

	}

}
