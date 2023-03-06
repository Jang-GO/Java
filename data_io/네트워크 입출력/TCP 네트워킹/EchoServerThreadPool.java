package ch19;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EchoServerThreadPool {
	private static ServerSocket serverSocket = null;
	//10개의 스레드로 요청을 처리하는 스레드풀 생성
	private static ExecutorService executorService =
			Executors.newFixedThreadPool(10);
	public static void main(String[] args) {
		System.out.println("---------------------------------------");
		System.out.println("서버를 종료하려면 q를 입력하고 Enter 키를 입력하세요");
		System.out.println("---------------------------------------");
		
		//TCP서버 시작
		startServer();
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			String key = sc.nextLine();
			if(key.toLowerCase().equals("q")){
					break;
			}	
		}
		sc.close();
		//TCP서버 종료
		stopServer();
	}
	
	public static void startServer() {
		Thread thread = new Thread() {
			public void run() {
				try {
					serverSocket = new ServerSocket(50001);
					System.out.println("[서버] 시작됨");
					
					//연결 수락 및 데이터 통신
					while(true) {
						//연결 수락
						Socket socket = serverSocket.accept();
						//작업 큐에 처리작업 넣기. Runnable은 함수형 인터페이스이므로 람다식으로 표현 가능
						executorService.execute(() ->{
							try {
								//연결된 클라이언트 정보 얻기
								InetSocketAddress isa = (InetSocketAddress)socket.getRemoteSocketAddress();
								System.out.println("[서버] "+ isa.getHostName()+ "의 연결 요청을 수락함");
								
								//데이터 받기
								DataInputStream dis = new DataInputStream(socket.getInputStream());
								String message = dis.readUTF();
								
								//데이터 보내기
								DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
								dos.writeUTF(message);
								dos.flush();
								System.out.println("[서버] 받은 데이터를 다시 보냄: "+message);
								
								//연결 끊기
								socket.close();
								System.out.println("[서버] "+isa.getHostName()+"의 연결을 끊음");
								
								
							}catch(IOException e) {}
						});
					}
				}catch(IOException e) {
					System.out.println("[서버] "+e.getMessage());
				}
			}
		};
		thread.start();
	}
	
	public static void stopServer() {
		try {
			serverSocket.close();
			executorService.shutdownNow();
		}catch(IOException e1) {}
	}
}
