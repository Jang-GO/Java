package data_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {
	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("C:/Temp/test1.db");
			
			while(true) {
				//read() ==> 입력스트림으로부터 1byte를 읽고 int(4byte)타입으로 리턴
				int data = is.read();
				if(data==-1) break;
				System.out.println(data);
			}
			
			is.close();
		}catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
