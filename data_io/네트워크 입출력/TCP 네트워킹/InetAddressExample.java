/*
로컬 컴퓨터,네이버 웹사이트의 ip정보 출력
*/

package ch19;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExample {
	public static void main(String[] args) {
		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("내 컴퓨터 IP주소 :" + local.getHostAddress());
			
			InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com");
			for(InetAddress remote:iaArr) {
				System.out.println("www.naver.com의 주소: "+ remote.getHostAddress());
			}
		}catch(UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
