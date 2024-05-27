public class AnimalTest {
    public static void main(String[] args) {
        // Polymorphism
        Animal dog = new Dog();
        Animal cat = new Cat();

        // Make sound
        dog.makeSound();
        cat.makeSound();

        // // Play
        // ((Dog) dog).play();
        // ((Cat) cat).play();
    }
}
