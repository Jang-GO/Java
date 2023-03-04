package data_io;

import java.io.FileWriter;
import java.io.Writer;
import java.io.IOException;

public class WriterExample {
	public static void main(String[] args) {
		try {
			Writer writer = new FileWriter("C:/Temp/test.txt");
			
			//1문자씩 출력
			char a ='A';
			writer.write(a);
			char b ='B';
			writer.write(b);
			
			//char배열 출력
			char[] arr = {'C','D','E'};
			writer.write(arr);
			
			//문자열 출력
			writer.write("FGH");
			//버퍼에 잔류하는 모든 문자를 출력하고, 버퍼를 비움
			writer.flush();
			//출력 스트림을 닫고 메모리 해제
			writer.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}
