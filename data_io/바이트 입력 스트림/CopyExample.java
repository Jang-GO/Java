package data_io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

//복사: 인풋스트림에서 읽은 바이트를 바로 아웃풋 스트림으로 출력함
public class CopyExample {
	public static void main(String[] args) {
		String originalFilename="C:/Temp/test.jpg";
		String tragetFilename="C:/Temp/test2.jpg";
		
		// 입출력스트림 생성
		InputStream is = new FileInputStream(originalFilename); 
		OutputStream os = new FileOutputStream(tragetFilename);
		//읽은 바이트를 저장할 배열 생성
		byte[] data = new byte[1024];
		while(true) {
			int num = is.read(data); // 최대1024바이트를 읽고 배열에 저장, 읽은 바이트는 리턴
			if(num==-1) break; //파일을 다읽으면 read는 -1을 리턴,즉 파일을 다읽으면 while문 종료
			os.write(data,0,num); // 읽은 바이트 수 만큼 출력
		}
		
		os.flush(); // 내부 버퍼 잔류바이트를 출력하고 버퍼를 비움
		os.close();
		is.close();
		
		System.out.println("복사 되었습니다.");		
	}
}
