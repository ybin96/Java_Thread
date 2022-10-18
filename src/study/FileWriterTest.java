package study;

import java.io.FileWriter;

public class FileWriterTest {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("hello.txt"); // hello 라는 txt를 만들어라
			fw.write("hello java");  // hello java라고 써라
			fw.close(); 	// 닫아주는 수식(사용이 끝나면 닫아줘야한다.
			System.out.println("파일을 생성하였습니다");
		}catch(Exception e) {
			System.out.println("예외발생"+e.getMessage());
		}

	}

}
