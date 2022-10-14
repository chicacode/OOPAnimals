package Fish;

public class Eel extends Fish{

    

    public Eel() {
    
    }

    public Eel(boolean releaseElectricCharge, String location, boolean hasGills, int weight, float height, String animalType, String bloodType) {
        super(location, hasGills, releaseElectricCharge, weight, height, animalType, bloodType);

    }

    public void showInfo() {
        System.out.println("Eel's skin type is" + this.getAnimalType());
        System.out.println("Eel's electric charge" + this.getReleaseElectricCharge());
        System.out.println("Eel's gills " + this.getHasGills());
        System.out.println("Eel's lives in" + this.getLocation());
        System.out.println("Eel's weight is" + this.getWeight());
        System.out.println("Eel's height is" + this.getHeight());
        System.out.println("Eel's animal type is" + this.getAnimalType());
        System.out.println("Eel's blood type is" + this.getBloodType());
    }
    
}
