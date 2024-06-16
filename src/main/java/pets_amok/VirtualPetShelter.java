package pets_amok;

import java.util.ArrayList;

public class VirtualPetShelter {
    private ArrayList<VirtualPet> pets;

    public VirtualPetShelter() {
        this.pets = new ArrayList<>();
        this.initialPetsAtShelter();
    }

    public void initialPetsAtShelter() {
        OrganicDog organicDog1 = new OrganicDog("Malakai", "A happy-go-lucky doggo.");
        OrganicCat organicCat1 = new OrganicCat("Alastair", "This cat thinks he's thinks he's the king of the jungle.");
        RoboticDog roboticDog1 = new RoboticDog("Borg", "A dumb AI dog.");
        RoboticCat roboticCat1 = new RoboticCat("Cypher", "A villainous and cunning AI cat.");

        this.pets.add(organicDog1);
        this.pets.add(organicCat1);
        this.pets.add(roboticDog1);
        this.pets.add(roboticCat1);
    }

    public ArrayList<VirtualPet> getPets() {
        return this.pets;
    }

    public int size() {
        return pets.size();
    }

    public void getAllPets() {
        for (int petIndex = 0; petIndex < this.pets.size(); petIndex++) {
            System.out.println((petIndex + 1) + ") " + this.pets.get(petIndex));
        }
    }

    public void getAllOrganicPets() {
        for (VirtualPet pet : this.pets) {
            if (pet.getType().equals("Organic")) {
                System.out.println(pet);
            }
        }
    }

    public void getAllRoboticPets() {
        for (VirtualPet pet : this.pets) {
            if (pet.getType().equals("Robotic")) {
                System.out.println(pet);
            }
        }
    }

    public void getOrganicDogs() {
        for (VirtualPet pet : this.pets) {
            if (pet.getType().equals("Organic") && pet.getSpecies().equals("Dog")) {
                System.out.println(pet);
            }
        }
    }

    public void getOrganicCats() {
        for (VirtualPet pet : this.pets) {
            if (pet.getType().equals("Organic") && pet.getSpecies().equals("Cat")) {
                System.out.println(pet);
            }
        }
    }

    public void feedPets() {
        for (VirtualPet pet : this.pets) {
            if (pet.getType().equals("Organic")) {
                if (pet.getSpecies().equals("Cat")) {
                    OrganicCat organicCat = (OrganicCat) pet;
                    organicCat.feed();
                } else if (pet.getSpecies().equals("Dog")) {
                    OrganicDog organicDog = (OrganicDog) pet;
                    organicDog.feed();
                }
            }
        }
    }

    public void waterPets() {
        for (VirtualPet pet : this.pets) {
            if (pet.getType().equals("Organic")) {
                if (pet.getSpecies().equals("Cat")) {
                    OrganicCat organicCat = (OrganicCat) pet;
                    organicCat.water();
                } else if (pet.getSpecies().equals("Dog")) {
                    OrganicDog organicDog = (OrganicDog) pet;
                    organicDog.water();
                }
            }
        }
    }

    public boolean playWithPet(String name) {
        for (VirtualPet pet : pets) {
            if (pet.getName().equalsIgnoreCase(name)) {
                pet.play();
                return true;
            }
        }
        return false;
    }

    public void petAdopted(VirtualPet pet) {
        pets.remove(pet);
    }

    public void petAdmitted(VirtualPet pet) {
        pets.add(pet);
    }

    public void displayOrganicDogStats() {
        int longestNameLength = 0;
        for (VirtualPet pet : pets) {
            if (pet.getType().equals("Organic") && pet.getSpecies().equals("Dog")) {
                OrganicDog organicDog = (OrganicDog) pet;
                if (organicDog.getName().length() > longestNameLength) {
                    longestNameLength = organicDog.getName().length();
                }
            }
        }
        System.out.printf("%-" + (longestNameLength + 2)
                + "s|Happiness |Health |Boredom |Hunger |Thirst |Cleanliness |Urge to Poop%n", "Name");
        System.out.printf(
                "%-" + (longestNameLength + 2)
                        + "s|----------|-------|--------|-------|-------|------------|------------%n",
                "-".repeat(longestNameLength + 2));
        for (VirtualPet pet : pets) {
            if (pet.getType().equals("Organic") && pet.getSpecies().equals("Dog")) {
                OrganicDog organicDog = (OrganicDog) pet;
                System.out.printf("%-" + (longestNameLength + 2) + "s|%-10d|%-7d|%-8d|%-7d|%-7d|%-12d|%-13d%n",
                        organicDog.getName(),
                        organicDog.getHappiness(),
                        organicDog.getHealth(),
                        organicDog.getBoredom(),
                        organicDog.getHunger(),
                        organicDog.getThirst(),
                        organicDog.getCleanliness(),
                        organicDog.getPooNeediness());
            }
        }
    }

    public void displayOrganicCatStats() {
        int longestNameLength = 0;
        for (VirtualPet pet : pets) {
            if (pet.getType().equals("Organic") && pet.getSpecies().equals("Cat")) {
                OrganicCat organicCat = (OrganicCat) pet;
                if (organicCat.getName().length() > longestNameLength) {
                    longestNameLength = organicCat.getName().length();
                }
            }
        }
        System.out.printf("%-" + (longestNameLength + 2)
                + "s|Happiness |Health |Boredom |Hunger |Thirst |Litter Box%n", "Name");
        System.out.printf(
                "%-" + (longestNameLength + 2)
                        + "s|----------|-------|--------|-------|-------|------------%n",
                "-".repeat(longestNameLength + 2));
        for (VirtualPet pet : pets) {
            if (pet.getType().equals("Organic") && pet.getSpecies().equals("Cat")) {
                OrganicCat organicCat = (OrganicCat) pet;
                System.out.printf("%-" + (longestNameLength + 2) + "s|%-10d|%-7d|%-8d|%-7d|%-7d|%-10d%n",
                        organicCat.getName(),
                        organicCat.getHappiness(),
                        organicCat.getHealth(),
                        organicCat.getBoredom(),
                        organicCat.getHunger(),
                        organicCat.getThirst(),
                        organicCat.getWaste());
            }
        }
    }
}
