package strategyPattern;

public class Client {
    public static void main(String[] args){
        Strategy strategy = null;
        Soldier rambo = new Soldier(); // 컨텍스트 생성

        // 총을 람보에게 전달해서 전투수행
        strategy = new StrategyGun(); // 전략생성위임
        rambo.runContext(strategy); // 전략을 컨텍스트에 주입

        System.out.println();

        // 검을 람보에게 전달해서 전투수행
        strategy = new StrategySword();
        rambo.runContext(strategy);

        System.out.println();

        // 활을 람보에게 전달해서 전투수행
        strategy = new StrategyBow();
        rambo.runContext(strategy);
    }
}
