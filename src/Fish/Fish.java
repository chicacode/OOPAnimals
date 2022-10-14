package Fish;

import Animal.Animal;

public class Fish extends Animal{

    private String location;
    private boolean hasGills;
    private boolean releaseElectricCharge;


    public Fish() {
        this.location = "Ocean";
        this.hasGills = true;
        this.releaseElectricCharge = false;
    }

    public Fish(String location, boolean hasGills, boolean releaseElectricCharge, int weight, float height, String animalType, String bloodType) {
        super(weight, height, animalType, bloodType);
        this.location = location;
        this.hasGills = hasGills;
        this.releaseElectricCharge = releaseElectricCharge;
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

    public boolean getReleaseElectricCharge() {
        return this.releaseElectricCharge;
    }

    public void setReleaseElectricCharge(boolean releaseElectricCharge) {
        this.releaseElectricCharge = releaseElectricCharge;
    }
    
}
