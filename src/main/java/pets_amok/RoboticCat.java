package pets_amok;

public class RoboticCat extends RoboticPet implements Cat {

    public RoboticCat(String name, String description, int boredom, int happiness, int health, int oil, int maintain) {
        super(name, description, boredom, happiness, health, oil, maintain);
    }

    public RoboticCat(String name, String description) {
        this(name, description, 50, 50, 100, 75, 75);
    }

    public void roboticCatTick() {
        this.oil = Math.max(this.oil - 7, 0);
        this.maintain = Math.max(this.maintain - 7, 0);
        this.boredom = Math.max(this.boredom - 7, 0);
    }

    @Override
    public String getType() {
        return "Robotic";
    }

    @Override
    public String getSpecies() {
        return "Cat";
    }

}
