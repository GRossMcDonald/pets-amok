package pets_amok;

public abstract class RoboticPet extends VirtualPet {
    protected int oil;
    protected int maintain;

    public RoboticPet(String name, String description, int boredom, int happiness, int health, int oil, int maintain) {
        super(name, description, boredom, happiness, health);
        this.oil = oil;
        this.maintain = maintain;
    }

    public RoboticPet(String name, String description) {
        this(name, description, 50, 50, 100, 75, 75);
    }

    public int getOil() {
        return oil;
    }

    public int getMaintain() {
        return maintain;
    }

    public void oil() {
        this.oil = Math.min(this.oil + 35, 107);
        this.health = Math.min(this.health + 10, 100);
    }

    public void maintain() {
        this.maintain = Math.min(this.maintain + 100, 107);
        this.health = Math.min(this.health + 10, 100);
    }
}
