package pets_amok;

public class OrganicCat extends OrganicPet {
    private int waste;

    public OrganicCat(String name, String description, int boredom, int happiness, int health, int hunger, int thirst, int waste) {
        super(name, description, boredom, happiness, health, hunger, thirst);
        this.waste = waste;
    }

    public OrganicCat(String name, String description) {
        this(name, description, 50, 50, 100, 75, 75, 100);
    }

    public int getWaste() {
        return this.waste;
    }

    public void cleanLitterBox() {
        this.waste = Math.max(this.waste - 100, 0);
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
