package pets_amok;

public class OrganicCat extends OrganicPet {
    private int waste;

    public OrganicCat(String name, String description, int boredom, int happiness, int health, int hunger, int thirst, int waste) {
        super(name, description, boredom, happiness, health, hunger, thirst);
        this.waste = waste;
    }

    public OrganicCat(String name, String description) {
        this(name, description, 50, 50, 100, 75, 75, 0);
    }

    public int getWaste() {
        return this.waste;
    }

    public void cleanLitterBox() {
        this.waste = Math.max(this.waste - 100, 0);
    }

    public void organicCatTick() { // WHAT TO DO ABOUT SINGULAR LITTER BOX
        this.hunger = Math.max(this.hunger - 7, 0);
        this.thirst = Math.max(this.thirst - 7, 0);
        this.boredom = Math.max(this.boredom - 7, 0);
        this.waste = Math.min(this.waste + 2, 102);
    }

    @Override
    public String getType() {
        return "Organic";
    }

    @Override
    public String getSpecies() {
        return "Cat";
    }
}
