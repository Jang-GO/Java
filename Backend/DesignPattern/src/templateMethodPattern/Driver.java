package templateMethodPattern;

public class Driver {
    public static void main(String[] args){
        Animal dodo = new Dog();
        Animal kiki = new Cat();

        dodo.playWithOwner();

        System.out.println();
        System.out.println();

        kiki.playWithOwner();
    }
}