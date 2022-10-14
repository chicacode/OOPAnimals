package Reptile;

import Animal.Animal;

public class Reptile extends Animal {

    private String skinType;
    private String bone;
    private String eggType;


    public Reptile() {
        this.skinType = "Dry";
        this.bone = "Backbone";
        this.eggType = "Amniotic";
    }


    public Reptile(String skinType, String bone, String eggType, int weight, float height, String animalType, String bloodType) {
        super(weight, height, animalType, bloodType);
        this.skinType = skinType;
        this.bone = bone;
        this.eggType = eggType;
    }

    public String getSkinType() {
        return this.skinType;
    }

    public void setSkinType(String skinType) {
        this.skinType = skinType;
    }

    public String getBone() {
        return this.bone;
    }

    public void setBone(String bone) {
        this.bone = bone;
    }

    public String getEggType() {
        return this.eggType;
    }

    public void setEggType(String eggType) {
        this.eggType = eggType;
    }
    
}
