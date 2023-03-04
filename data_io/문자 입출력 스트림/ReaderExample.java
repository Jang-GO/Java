package data_io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderExample {
	public static void main(String[] args) {
		try {
			Reader reader = null;
			
			reader = new FileReader("C:/Temp/test.txt");
			while(true) {
				int data = reader.read(); // 1문자를 읽음
				if(data==-1) break;
				System.out.println((char)data);
			}
			reader.close();
			System.out.println();
			
			reader = new FileReader("C:/Temp/test.txt");
			char[] data = new char[100];
			while(true) {
				int num = reader.read(data);//읽은 문자는 배열에 저장, 읽은 문자수는 리턴
				if(num==-1) break;
				for(int i=0;i<num;i++) {
					System.out.println(data[i]);
				}
			}
			reader.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
