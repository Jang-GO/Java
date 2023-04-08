package templateMethodPattern;

public class Cat extends Animal {
    @Override
    // 추상 메서드 오버라이딩
    void play(){
        System.out.println("야옹~ 야옹~");
    }

    @Override
    // Hook메서드 오버라이딩 (선택적)
    void runSomething(){
        System.out.println("쫄쫄쫄");
    }
}   
