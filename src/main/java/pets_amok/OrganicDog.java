package pets_amok;

public class OrganicDog extends OrganicPet implements Dog {
    private int cleanliness;
    private int pooNeediness;

    public OrganicDog(String name, String description, int boredom, int happiness, int health, int hunger, int thirst,
            int cleanliness, int pooNeediness) {
        super(name, description, boredom, happiness, health, hunger, thirst);
        this.cleanliness = cleanliness;
        this.pooNeediness = pooNeediness;
    }

    public OrganicDog(String name, String description) {
        this(name, description, 50, 50, 100, 75, 75, 100, 0);
    }

    public int getCleanliness() {
        return this.cleanliness;
    }

    public int getPooNeediness() {
        return this.pooNeediness;
    }

    public void cleanCage() {
        this.cleanliness = Math.min(this.cleanliness + 100, 100);
    }

    public void soiledCage() {
        int dirtyAccumulation = 0;
        double dirtiness = Math.random();
        if (dirtiness > .90) {
            if (pooNeediness >= 80) {
                dirtyAccumulation = 20;
                Math.max(this.cleanliness - dirtyAccumulation, 0);
            } else if (pooNeediness >= 60) {
                dirtyAccumulation = 15;
                Math.max(this.cleanliness - dirtyAccumulation, 0);
            } else if (pooNeediness >= 40) {
                dirtyAccumulation = 12;
                Math.max(this.cleanliness - dirtyAccumulation, 0);
            } else if (pooNeediness >= 20) {
                dirtyAccumulation = 8;
                Math.max(this.cleanliness - dirtyAccumulation, 0);
            } else if (pooNeediness < 20) {
                dirtyAccumulation = 6;
                Math.min(this.cleanliness - dirtyAccumulation, 0);
            }
        } else if (dirtiness > .60) {
            if (pooNeediness >= 80) {
                dirtyAccumulation = 15;
                Math.max(this.cleanliness - dirtyAccumulation, 0);
            } else if (pooNeediness >= 60) {
                dirtyAccumulation = 11;
                Math.max(this.cleanliness - dirtyAccumulation, 0);
            } else if (pooNeediness >= 40) {
                dirtyAccumulation = 8;
                Math.max(this.cleanliness - dirtyAccumulation, 0);
            } else if (pooNeediness >= 20) {
                dirtyAccumulation = 4;
                Math.max(this.cleanliness - dirtyAccumulation, 0);
            } else if (pooNeediness < 20) {
                dirtyAccumulation = 2;
                Math.min(this.cleanliness - dirtyAccumulation, 0);
            }
        } else if (dirtiness > .40) {
            if (pooNeediness >= 80) {
                dirtyAccumulation = 14;
                Math.max(this.cleanliness - dirtyAccumulation, 0);
            } else if (pooNeediness >= 60) {
                dirtyAccumulation = 10;
                Math.max(this.cleanliness - dirtyAccumulation, 0);
            } else if (pooNeediness >= 40) {
                dirtyAccumulation = 6;
                Math.max(this.cleanliness - dirtyAccumulation, 0);
            } else if (pooNeediness >= 20) {
                dirtyAccumulation = 3;
                Math.max(this.cleanliness - dirtyAccumulation, 0);
            } else if (pooNeediness < 20) {
                dirtyAccumulation = 1;
                Math.min(this.cleanliness - dirtyAccumulation, 0);
            }
        } else if (dirtiness > .15) {
            if (pooNeediness >= 80) {
                dirtyAccumulation = 12;
                Math.max(this.cleanliness - dirtyAccumulation, 0);
            } else if (pooNeediness >= 60) {
                dirtyAccumulation = 9;
                Math.max(this.cleanliness - dirtyAccumulation, 0);
            } else if (pooNeediness >= 40) {
                dirtyAccumulation = 5;
                Math.max(this.cleanliness - dirtyAccumulation, 0);
            } else if (pooNeediness >= 20) {
                dirtyAccumulation = 2;
                Math.max(this.cleanliness - dirtyAccumulation, 0);
            } else if (pooNeediness < 20) {
                dirtyAccumulation = 1;
                Math.min(this.cleanliness - dirtyAccumulation, 0);
            }
        } else {
            if (pooNeediness >= 80) {
                dirtyAccumulation = 8;
                Math.max(this.cleanliness - dirtyAccumulation, 0);
            } else if (pooNeediness >= 60) {
                dirtyAccumulation = 5;
                Math.max(this.cleanliness - dirtyAccumulation, 0);
            } else if (pooNeediness >= 40) {
                dirtyAccumulation = 2;
                Math.max(this.cleanliness - dirtyAccumulation, 0);
            } else if (pooNeediness >= 20) {
                dirtyAccumulation = 0;
                Math.max(this.cleanliness - dirtyAccumulation, 0);
            } else if (pooNeediness < 20) {
                dirtyAccumulation = 0;
                Math.min(this.cleanliness - dirtyAccumulation, 0);
            }
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
        this.pooNeediness = Math.min(this.pooNeediness - 50, 0);
        this.happiness = Math.min(this.happiness + 15, 0);
    }

}
