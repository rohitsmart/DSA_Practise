// Cat.java
public class Cat extends Animal implements Pet {
    @Override
    public void makeSound() {
        System.out.println("Cat meows: Meow!");
    }

    @Override
    public void play() {
        System.out.println("Cat plays: Chase the mouse");
    }
}