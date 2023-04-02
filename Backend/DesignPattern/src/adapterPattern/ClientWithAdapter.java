package adapterPattern;

public class ClientWithAdapter {

	public static void main(String[] args) {
		AdapterServiceA asa1 = new AdapterServiceA();
		AdapterServiceB asb1 = new AdapterServiceB();
		
		asa1.runService();
		asb1.runService();
	}
}

// 어댑터 패턴: 호출당하는 쪽의 메서드를 호출하는 쪽의 코드에 대응하도록 중간에 변환기를 통해 호출하는 패턴
