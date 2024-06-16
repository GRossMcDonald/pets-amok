package pets_amok;

public class RoboticDog extends RoboticPet implements Dog {

    public RoboticDog(String name, String description, int boredom, int happiness, int health, int oil, int maintain) {
        super(name, description, boredom, happiness, health, oil, maintain);
    }

    public RoboticDog(String name, String description) {
        this(name, description, 50, 50, 100, 75, 75);
    }

    @Override
    public String getType() {
        return "Robotic";
    }

    @Override
    public String getSpecies() {
        return "Dog";
    }

    @Override
    public void walk() {
        
    }

}
