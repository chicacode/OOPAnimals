import Animal.Animal;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Animal dog = new Animal(3, 2, "Dog", "Warm");

        System.out.println("The man's best friend is: " + dog.getAnimalType());
    }
}
