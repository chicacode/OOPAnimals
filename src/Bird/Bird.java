package Bird;

import Animal.Animal; 

public class Bird extends Animal{

    private boolean hasFethers;
    private boolean canFly;


    public Bird() {
        this.hasFethers = true;
        this.canFly = false;
    }


    public Bird(boolean hasFethers, boolean canFly, int weight, float height, String animalType, String bloodType) {
        super(weight, height, animalType, bloodType);
        this.hasFethers = hasFethers;
        this.canFly = canFly;
    }


    public boolean isHasFethers() {
        return this.hasFethers;
    }

    public boolean getHasFethers() {
        return this.hasFethers;
    }

    public void setHasFethers(boolean hasFethers) {
        this.hasFethers = hasFethers;
    }

    public boolean isCanFly() {
        return this.canFly;
    }

    public boolean getCanFly() {
        return this.canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    
}
