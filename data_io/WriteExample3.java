package data_io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample3 {
	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("C:/Temp/test3.db");
			
			byte[] array = {10,20,30,40,50};
			
			//write(byte[] b,int off, int len) ==> b[off]부터 len개의 바이트 출력
			os.write(array,1,3);
			
			os.flush(); // 출력버퍼에 잔류하는 모든 바이트를 출력
			os.close(); // 출력스트림을 닫고 사용 메모리 해제
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
