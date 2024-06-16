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
        return waste;
    }

    @Override
    public String getType() {
        return "Organic";
    }
}
