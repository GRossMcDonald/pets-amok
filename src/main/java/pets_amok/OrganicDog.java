package pets_amok;

public class OrganicDog extends OrganicPet implements Dog {
    private int cleanliness;

    public OrganicDog(String name, String description, int boredom, int happiness, int health, int hunger, int thirst, int cleanliness) {
        super(name, description, boredom, happiness, health, hunger, thirst);
        this.cleanliness = cleanliness;
    }

    public OrganicDog(String name, String description) {
        this(name, description, 50, 50, 100, 75, 75, 100);
    }

    public int getCleanliness() {
        return this.cleanliness;
    }

    public void cleanCage() {
        this.cleanliness = Math.min(this.cleanliness + 100, 100);
    }

    public int soiledCage() {
        double dirtiness = Math.random();
        if (dirtiness > .90) {
            return 7;
        } else if (dirtiness > .60) {
            return 5;
        } else if (dirtiness > .40) {
            return 3;
        } else if (dirtiness > .15) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String getType() {
        return "Organic";
    }

    @Override
    public String getSpecies() {
        return "Dog";
    }

    @Override
    public void walk() {
        
    }

}
