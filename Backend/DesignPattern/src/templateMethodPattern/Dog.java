package templateMethodPattern;

public class Dog extends Animal {
    @Override
    //추상 메서드 오버라이딩
    void play(){
        System.out.println("멍! 멍!");
    }

    @Override
    // Hook메서드 오버라이딩 (선택적)
    void runSomething() {
        System.out.println("살랑살랑");
    }
}
