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

    public void poorHealthCheck() {
        int poorCondition = 0;
        if (this.oil < 25 && this.maintain < 25) {
            poorCondition = 15;
        } else if (this.oil < 50 && this.maintain < 50) {
            poorCondition = 5;
        } else if (this.oil == 0 || this.maintain == 0) {
            poorCondition = 10;
        } else if (this.oil < 25 || this.maintain < 25) {
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

    @Override
    public String getType() {
        return "Robotic";
    }

    @Override
    public String getSpecies() {
        return "Cat";
    }

}
