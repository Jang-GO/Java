package factoryMethodPattern;

public class DogToy extends AnimalToy {
    @Override
    // 팩터리 메서드가 생성할 객체
    void identify(){
        System.out.println("나는 dog의 Toy");
    }
}
