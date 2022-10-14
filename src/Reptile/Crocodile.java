package Reptile;

public class Crocodile extends Reptile {

    public Crocodile() {
    }

    public Crocodile(String skinType, String bone, String eggType, int weight, float height, String animalType,
            String bloodType) {
        super(skinType, bone, eggType, weight, height, animalType, bloodType);
    }

    public void showInfo() {
        System.out.println("Cocodrile's skin type is" + this.getSkinType());
        System.out.println("Cocodrile's bone is" + this.getBone());
        System.out.println("Cocodrile's egg type is" + this.getEggType());
        System.out.println("Cocodrile's weight is" + this.getWeight());
        System.out.println("Cocodrile's height is" + this.getHeight());
        System.out.println("Cocodrile's animal type is" + this.getAnimalType());
        System.out.println("Cocodrile's blood type is" + this.getBloodType());
    }
}
