
public class Dog extends Animal implements Pet {
    @Override
    public void makeSound() {
        System.out.println("Dog barks: Woof!");
    }

    @Override
    public void play() {
        System.out.println("Dog plays: Fetch the ball");
    }
}