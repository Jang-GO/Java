package singletonPattern;

public class Singleton {
	static Singleton singletonObject; // 정적 참조 변수
	
	private Singleton() {}; // private 생성자(외부에서 new를 통해 객체생성 불가)
	
	//객체 반환 정적 메서드 
	public static Singleton getInstance() {
		if(singletonObject==null) {   // 정적 참조 변수에 객체가 할당돼 있지 않은 경우에만 new로 객체생성
			singletonObject = new Singleton();
		}
		
		return singletonObject; // 
	}
	
}
