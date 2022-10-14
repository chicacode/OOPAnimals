import Animal.Animal;
import Reptile.Reptile;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Animal dog = new Animal(3, 2, "Dog", "Warm");

        System.out.println("The man's best friend is: " + dog.getAnimalType());

        Reptile snake = new Reptile("dry", null, null, 0, 0, "snake", null);

        System.out.println("The " + snake.getAnimalType() + " is in the grass" + " and its skin is " + snake.getSkinType());
    }
}
