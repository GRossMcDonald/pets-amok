package pets_amok;

public class OrganicBird extends OrganicPet {
    private int cleanliness;

    public OrganicBird(String name, String description, int boredom, int happiness, int health, int hunger, int thirst,
            int cleanliness) {
        super(name, description, boredom, happiness, health, hunger, thirst);
        this.cleanliness = cleanliness;
    }

    public OrganicBird(String name, String description) {
        this(name, description, 50, 50, 100, 75, 75, 100);
    }

    public int getCleanliness() {
        return this.cleanliness;
    }

    public void cleanCage() {
        this.cleanliness = Math.min(this.cleanliness + 100, 100);
    }

    public void poorHealthCheck() {
        int poorCondition = 0;
        if (this.hunger < 25 && this.thirst < 25 && this.cleanliness < 25) {
            poorCondition = 15;
        } else if (this.hunger < 50 && this.thirst < 50 && this.cleanliness < 50) {
            poorCondition = 5;
        } else if (this.hunger == 0 || this.thirst == 0 || this.cleanliness == 0) {
            poorCondition = 10;
        } else if (this.hunger < 25 || this.thirst < 25 || this.cleanliness < 25) {
            poorCondition = 5;
        }
        this.health = Math.max(this.health - poorCondition, 0);
    }

    public void sadnessIndex() {
        int conditions = 0;
        if (this.boredom < 25 && this.health < 25) {
            conditions = 10;
        } else if (this.boredom < 50 && this.health < 50) {
            conditions = 5;
        } else if (this.boredom < 25 || this.health < 25) {
            conditions = 5;
        } else if (this.health < 50) {
            conditions = 2;
        }
        this.happiness = Math.max(this.happiness - conditions, 0);
    }

    public void happinessIndex() {
        int conditions = 0;
        if (this.boredom >= 75 && this.health >= 75) {
            conditions = 10;
        }
        this.happiness = Math.min(this.happiness + conditions, 100);
    }

    public void organicBirdTick() {
        this.hunger = Math.max(this.hunger - 3, 0);
        this.thirst = Math.max(this.thirst - 3, 0);
        this.boredom = Math.max(this.boredom - 3, 0);
        this.cleanliness = Math.max(this.cleanliness - 3, 0);
    }

    @Override
    public String getType() {
        return "Organic";
    }

    @Override
    public String getSpecies() {
        return "Bird";
    }
}
