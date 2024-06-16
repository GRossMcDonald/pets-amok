package pets_amok;

public abstract class OrganicPet extends VirtualPet {
    protected int hunger;
    protected int thirst;
    
    public OrganicPet(String name, String description, int boredom, int happiness, int health, int hunger, int thirst) {
        super(name, description, boredom, happiness, health);
        this.hunger = hunger;
        this.thirst = thirst;
    }

    public OrganicPet(String name, String description) {
        this(name, description, 50, 50, 100, 75, 75);
    }

    public int getHunger() {
        return this.hunger;
    }

    public int getThirst() {
        return this.thirst;
    }

    public void feed() {
        this.hunger = Math.min(this.hunger + 35, 107);
        this.health = Math.min(this.health + 10, 100);
    }

    public void water() {
        this.thirst = Math.min(this.thirst + 35, 107);
        this.health = Math.min(this.health + 10, 100);
    }

    public abstract String getSpecies();
}
