package data_io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample2 {
	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("C:/Temp/test2.db");
			
			byte[] array = {10,20,30};
			
			//write(byte[] b) ==> 매개값으로 주어진 배열의 모든 바이트를 출력
			os.write(array);
			
			os.flush(); // 출력버퍼에 잔류하는 모든 바이트를 출력
			os.close(); // 출력스트림을 닫고 사용 메모리 해제
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
