package pets_amok;

public abstract class VirtualPet {
    protected String name;
    protected String description;
    protected int boredom;
    protected int happiness;
    protected int health;

    public VirtualPet(String name, String description, int boredom, int happiness, int health) {
        this.name = name;
        this.description = description;
        this.boredom = boredom;
        this.happiness = happiness;
        this.health = health;
    }

    public VirtualPet(String name, String description) {
        this(name, description, 50, 50, 100);
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public int getBoredom() {
        return this.boredom;
    }

    public int getHappiness() {
        return this.happiness;
    }

    public int getHealth() {
        return this.health;
    }

    public void play() {
        this.boredom = Math.min(this.boredom + 100, 107);
    }

    
    public abstract String getType();
    public abstract String getSpecies();

    @Override
    public String toString() {
        return this.name + ": " + this.description;
    }
}
