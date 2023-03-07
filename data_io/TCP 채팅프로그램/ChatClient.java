/*
 * 채팅서버로 연결을 요청하고 연결된 후에는 제일먼저 대화명을 보냄.
 */
package ch19;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;
import org.json.JSONObject;

public class ChatClient {
	Socket socket; // 연결 요청,끊을때 필요
	DataInputStream dis; // 문자열을 읽고 보내기 위한 보조스트림
	DataOutputStream dos; 
	String chatName; // 클라이언트의 대화명
	
	//채팅서버에 연결요청 다른PC에있는 채팅서버와 연결을 하고싶다면 localhost 대신 IP주소 작성
	public void connect() throws IOException{
		socket = new Socket("localhost",50001);
		dis = new DataInputStream(socket.getInputStream());
		dos = new DataOutputStream(socket.getOutputStream());
		System.out.println("[클라이언트] 서버에 연결됨");
	}
	
	//서버가 보낸 JSON메세지 읽기
	//dis.readUTF() 로 JSON을 읽고 JSONObject로 파싱해서 3개의 정보 얻어내고 출력
	public void receive() {
		Thread thread = new Thread(() ->{
			try {
				while(true) {
					String json = dis.readUTF();
					JSONObject root = new JSONObject(json);
					String clientIp= root.getString("clientIp");
					String chatName= root.getString("chatName");
					String message= root.getString("message");
					System.out.println("<"+chatName+"@"+clientIp+">"+message);
				}
			}catch(IOException e) {
					System.out.println("[클라이언트] 서버 연결 끊김");
					System.exit(0);
			}
		});
		thread.start();
	}
	//서버로 JSON메세지를 보내는 역할
	public void send(String json) throws IOException {
		dos.writeUTF(json);
		dos.flush();
	}
	//서버와 연결 끊기
	public void unconnect() throws IOException{
		socket.close();
	}
	
	public static void main(String[] args) {
		try {
			ChatClient chatClient = new ChatClient();
			chatClient.connect();
			
			Scanner sc = new Scanner(System.in);
			System.out.println("대화명 입력: ");
			chatClient.chatName = sc.nextLine();
			
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("command","incoming");
			jsonObject.put("data",chatClient.chatName);
			String json = jsonObject.toString();
			chatClient.send(json);
			
			chatClient.receive();
			
			System.out.println("-----------------------------");
			System.out.println("보낼 메세지를 입력하고 Enter");
			System.out.println("채팅을 종료하려면 q를 입력하고 Enter");
			System.out.println("-----------------------------");
			while(true) {
				String message = sc.nextLine();
				if(message.toLowerCase().equals("q")) {
					break;
				}else {
					jsonObject = new JSONObject();
					jsonObject.put("command","message");
					jsonObject.put("data",message);
					json = jsonObject.toString();
					chatClient.send(json);
				}
			}
			sc.close();
			chatClient.unconnect();
		}catch(IOException e) {
			System.out.println("[클라이언트] 서버 연결 안됨 ");
		}
	}
}
