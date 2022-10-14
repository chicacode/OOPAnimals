package Animal;

public class Animal {

    private int weight;
    private float height;
    private String animalType;
    private String bloodType;


    public Animal() {
        this.weight = 0;
        this.height = 0;
        this.animalType = "fish";
        this.bloodType = "unknown";
    }

    public Animal(int weight, float height, String animalType, String bloodType) {
        this.weight = weight;
        this.height = height;
        this.animalType = animalType;
        this.bloodType = bloodType;
    }


    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return this.height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String getAnimalType() {
        return this.animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public String getBloodType() {
        return this.bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    
}
