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
        int dirtyAccumulation;
        double dirtiness = Math.random();
        if (dirtiness > .90) {
            if (pooNeediness >= 80) {
                dirtyAccumulation = 20;
            } else if (pooNeediness >= 60) {
                dirtyAccumulation = 15;
            } else if (pooNeediness >= 40) {
                dirtyAccumulation = 12;
            } else if (pooNeediness >= 20) {
                dirtyAccumulation = 8;
            } else {
                dirtyAccumulation = 6;
            }
        } else if (dirtiness > .60) {
            if (pooNeediness >= 80) {
                dirtyAccumulation = 15;
            } else if (pooNeediness >= 60) {
                dirtyAccumulation = 11;
            } else if (pooNeediness >= 40) {
                dirtyAccumulation = 8;
            } else if (pooNeediness >= 20) {
                dirtyAccumulation = 4;
            } else {
                dirtyAccumulation = 2;
            }
        } else if (dirtiness > .40) {
            if (pooNeediness >= 80) {
                dirtyAccumulation = 14;
            } else if (pooNeediness >= 60) {
                dirtyAccumulation = 10;
            } else if (pooNeediness >= 40) {
                dirtyAccumulation = 6;
            } else if (pooNeediness >= 20) {
                dirtyAccumulation = 3;
            } else {
                dirtyAccumulation = 1;
            }
        } else if (dirtiness > .15) {
            if (pooNeediness >= 80) {
                dirtyAccumulation = 12;
            } else if (pooNeediness >= 60) {
                dirtyAccumulation = 9;
            } else if (pooNeediness >= 40) {
                dirtyAccumulation = 5;
            } else if (pooNeediness >= 20) {
                dirtyAccumulation = 2;
            } else {
                dirtyAccumulation = 1;
            }
        } else {
            if (pooNeediness >= 80) {
                dirtyAccumulation = 8;
            } else if (pooNeediness >= 60) {
                dirtyAccumulation = 5;
            } else if (pooNeediness >= 40) {
                dirtyAccumulation = 2;
            } else {
                dirtyAccumulation = 0;
            }
        }
        this.cleanliness = Math.max(this.cleanliness - dirtyAccumulation, 0);
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

    public void organicDogTick() {
        this.hunger = Math.max(this.hunger - 7, 0);
        this.thirst = Math.max(this.thirst - 7, 0);
        this.boredom = Math.max(this.boredom - 7, 0);
        this.pooNeediness = Math.min(this.pooNeediness + 5, 100);
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
        this.pooNeediness = Math.max(this.pooNeediness - 100, 0);
        this.happiness = Math.min(this.happiness + 15, 100);
    }

}
