package Bird;

public class Eagle extends Bird {

    public Eagle() {
    }
    
    public Eagle(boolean hasFethers, boolean canFly, int weight, float height, String animalType, String bloodType){
        super(hasFethers, canFly, weight, height, animalType, bloodType)
    }

    public void showInfo() {
        System.out.println("Eagle's feather" + this.getHasFethers());
        System.out.println("Eagle's can fly" + this.getCanFly());
        System.out.println("Eagle's weight is" + this.getWeight());
        System.out.println("Eagle's height is" + this.getHeight());
        System.out.println("Eagle's animal type is" + this.getAnimalType());
        System.out.println("Eagle's blood type is" + this.getBloodType());
    }
}
