package factoryMethodPattern;

public class Dog extends Animal {
    @Override
    // 추상 팩터리 메서드 오버라이딩
    AnimalToy getToy(){
        return new DogToy();
    }
}
