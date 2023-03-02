package data_io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {
	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("C:/Temp/test1.db");
			
			byte a =10;
			byte b =20;
			byte c =30;
			
			//write(int b) ==> 매개값 int(4byte)중 끝 1byte만 출력
			os.write(a); // 끝 1byte = 00001010 
			os.write(b); // 끝 1byte = 00010100
			os.write(c); // 끝 1byte = 00011110
			
			os.flush(); // 출력버퍼에 잔류하는 모든 바이트를 출력
			os.close(); // 출력스트림을 닫고 사용 메모리 해제
		}catch(IOException e) {
			e.printStackTrace()
		}
	}
}
