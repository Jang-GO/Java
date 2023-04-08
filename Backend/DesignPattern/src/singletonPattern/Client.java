package singletonPattern;

public class Client {
	public static void main(String[] args) {
		// private 생성자이므로 new를 통해 생성불가
		// Singleton s = new Singleton();
		
		Singleton s1 = Singleton.getInstance(); //static메서드이므로 클래스명.메서드
		Singleton s2 = Singleton.getInstance(); //static메서드이므로 클래스명.메서드
		Singleton s3 = Singleton.getInstance(); //static메서드이므로 클래스명.메서드
		
		System.out.println(s1); // 실행결과 3개가 다 똑같다. (단일객체참조)
		System.out.println(s2);
		System.out.println(s3);
		
		s1=null;
		s2=null;
		s3=null;
		
	}
}
