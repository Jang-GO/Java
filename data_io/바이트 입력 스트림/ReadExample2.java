package data_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample2 {
	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("C:/Temp/test2.db");
			
			byte[] data = new byte[100];
			while(true) {
				//read(byte[] arr) ==> arr의 길이만큼 바이트를 읽고 배열에 저장한 다음 읽은 바이트 수 리턴
				int num = is.read(data);
				if(num==-1) break;
				for(int i=0;i<num;i++) {
					System.out.println(data[i]);
				}
			}
			
			is.close();
		}catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
