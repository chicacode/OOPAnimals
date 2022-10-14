package Fish;

import Animal.Animal;

public class Fish extends Animal{

    private String location;
    private boolean hasGills;


    public Fish() {
        this.location = "Ocean";
        this.hasGills = true;
    }

    public Fish(String location, boolean hasGills, int weight, float height, String animalType, String bloodType) {
        super(weight, height, animalType, bloodType);
        this.location = location;
        this.hasGills = hasGills;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isHasGills() {
        return this.hasGills;
    }

    public boolean getHasGills() {
        return this.hasGills;
    }

    public void setHasGills(boolean hasGills) {
        this.hasGills = hasGills;
    }

    
}
