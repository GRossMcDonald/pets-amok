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
        return cleanliness;
    }

    @Override
    public String getType() {
        return "Organic";
    }

    @Override
    public void walk() {
        
    }

}
