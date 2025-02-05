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

    public void oilPets() {
        for (VirtualPet pet : this.pets) {
            if (pet.getType().equals("Robotic")) {
                if (pet.getSpecies().equals("Cat")) {
                    RoboticCat roboticCat = (RoboticCat) pet;
                    roboticCat.oil();
                } else if (pet.getSpecies().equals("Dog")) {
                    RoboticDog roboticDog = (RoboticDog) pet;
                    roboticDog.oil();
                }
            }
        }
    }

    public void maintainPets() {
        for (VirtualPet pet : this.pets) {
            if (pet.getType().equals("Robotic")) {
                if (pet.getSpecies().equals("Cat")) {
                    RoboticCat roboticCat = (RoboticCat) pet;
                    roboticCat.maintain();
                } else if (pet.getSpecies().equals("Dog")) {
                    RoboticDog roboticDog = (RoboticDog) pet;
                    roboticDog.maintain();
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

    public boolean cleanCage(String name) {
        for (VirtualPet pet : this.pets) {
            if (pet.getType().equals("Organic")) {
                if (pet.getSpecies().equals("Dog")) {
                    OrganicDog organicDog = (OrganicDog) pet;
                    if (organicDog.getName().equalsIgnoreCase(name)) {
                        organicDog.cleanCage();
                        return true;
                    }
                } else if (pet.getSpecies().equals("Bird")) {
                    OrganicBird organicBird = (OrganicBird) pet;
                    if (organicBird.getName().equalsIgnoreCase(name)) {
                        organicBird.cleanCage();
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int totalingLitterBox() {
        return OrganicCat.getWaste();
    }

    public void litterBoxCheck() {
        if (totalingLitterBox() >= 20) {
            for (VirtualPet pet : this.pets) {
                if (pet.getType().equals("Organic") && pet.getSpecies().equals("Cat")) {
                    OrganicCat organicCat = (OrganicCat) pet;
                    organicCat.sicknessOutbreak();
                }
            }
        }
    }

    public void cleanLitterBox() {
        for (VirtualPet pet : this.pets) {
            if (pet.getType().equals("Organic") && pet.getSpecies().equals("Cat")) {
                OrganicCat organicCat = (OrganicCat) pet;
                organicCat.cleanLitterBox();
            }
        }
    }

    public void walkDogs() {
        for (VirtualPet pet : this.pets) {
            if (pet.getSpecies().equals("Dog")) {
                if (pet.getType().equals("Organic")) {
                    OrganicDog organicDog = (OrganicDog) pet;
                    organicDog.walk();
                } else if (pet.getType().equals("Robotic")) {
                    RoboticDog roboticDog = (RoboticDog) pet;
                    roboticDog.walk();
                }
            }
        }
    }

    public void petAdopted(VirtualPet pet) {
        pets.remove(pet);
    }

    public void petAdmitted(VirtualPet pet) {
        pets.add(pet);
    }

    public void tickAll() {
        for (VirtualPet pet : this.pets) {
            if (pet.getType().equals("Organic")) {
                if (pet.getSpecies().equals("Cat")) {
                    OrganicCat organicCat = (OrganicCat) pet;
                    organicCat.poorHealthCheck();
                    organicCat.sadnessIndex();
                    organicCat.happinessIndex();
                    organicCat.organicCatTick();
                } else if (pet.getSpecies().equals("Dog")) {
                    OrganicDog organicDog = (OrganicDog) pet;
                    organicDog.poorHealthCheck();
                    organicDog.soiledCage();
                    organicDog.sadnessIndex();
                    organicDog.happinessIndex();
                    organicDog.organicDogTick();
                } else if (pet.getSpecies().equals("Bird")) {
                    OrganicBird organicBird = (OrganicBird) pet;
                    organicBird.poorHealthCheck();
                    organicBird.sadnessIndex();
                    organicBird.happinessIndex();
                    organicBird.organicBirdTick();
                }
            } else if (pet.getType().equals("Robotic")) {
                if (pet.getSpecies().equals("Cat")) {
                    RoboticCat roboticCat = (RoboticCat) pet;
                    roboticCat.poorHealthCheck();
                    roboticCat.sadnessIndex();
                    roboticCat.happinessIndex();
                    roboticCat.roboticCatTick();
                } else if (pet.getSpecies().equals("Dog")) {
                    RoboticDog roboticDog = (RoboticDog) pet;
                    roboticDog.poorHealthCheck();
                    roboticDog.sadnessIndex();
                    roboticDog.happinessIndex();
                    roboticDog.roboticDogTick();
                }
            }
        }
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
        System.out.printf("%-" + (longestNameLength + 5)
                + "s|Happiness |Health |Boredom |Hunger |Thirst |Cleanliness |Urge to Poop%n", "Name");
        System.out.printf(
                "%-" + (longestNameLength + 5)
                        + "s|----------|-------|--------|-------|-------|------------|------------%n",
                "-".repeat(longestNameLength + 5));
        for (VirtualPet pet : pets) {
            if (pet.getType().equals("Organic") && pet.getSpecies().equals("Dog")) {
                OrganicDog organicDog = (OrganicDog) pet;
                System.out.printf("%-" + (longestNameLength + 5) + "s|%-10d|%-7d|%-8d|%-7d|%-7d|%-12d|%-13d%n",
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
        System.out.printf("%-" + (longestNameLength + 5)
                + "s|Happiness |Health |Boredom |Hunger |Thirst |Litter Box%n", "Name");
        System.out.printf(
                "%-" + (longestNameLength + 5)
                        + "s|----------|-------|--------|-------|-------|------------%n",
                "-".repeat(longestNameLength + 5));
        for (VirtualPet pet : pets) {
            if (pet.getType().equals("Organic") && pet.getSpecies().equals("Cat")) {
                OrganicCat organicCat = (OrganicCat) pet;
                System.out.printf("%-" + (longestNameLength + 5) + "s|%-10d|%-7d|%-8d|%-7d|%-7d|%-10d%n",
                        organicCat.getName(),
                        organicCat.getHappiness(),
                        organicCat.getHealth(),
                        organicCat.getBoredom(),
                        organicCat.getHunger(),
                        organicCat.getThirst(),
                        OrganicCat.getWaste());
            }
        }
    }

    public void displayOrganicBirdStats() {
        int longestNameLength = 0;
        for (VirtualPet pet : pets) {
            if (pet.getType().equals("Organic") && pet.getSpecies().equals("Bird")) {
                OrganicBird organicBird = (OrganicBird) pet;
                if (organicBird.getName().length() > longestNameLength) {
                    longestNameLength = organicBird.getName().length();
                }
            }
        }
        System.out.printf("%-" + (longestNameLength + 5)
                + "s|Happiness |Health |Boredom |Hunger |Thirst |Cleanliness %n", "Name");
        System.out.printf(
                "%-" + (longestNameLength + 5)
                        + "s|----------|-------|--------|-------|-------|------------%n",
                "-".repeat(longestNameLength + 5));
        for (VirtualPet pet : pets) {
            if (pet.getType().equals("Organic") && pet.getSpecies().equals("Bird")) {
                OrganicBird organicBird = (OrganicBird) pet;
                System.out.printf("%-" + (longestNameLength + 5) + "s|%-10d|%-7d|%-8d|%-7d|%-7d|%-12d%n",
                        organicBird.getName(),
                        organicBird.getHappiness(),
                        organicBird.getHealth(),
                        organicBird.getBoredom(),
                        organicBird.getHunger(),
                        organicBird.getThirst(),
                        organicBird.getCleanliness());
            }
        }
    }

    public void displayRoboticDogStats() {
        int longestNameLength = 0;
        for (VirtualPet pet : pets) {
            if (pet.getType().equals("Robotic") && pet.getSpecies().equals("Dog")) {
                RoboticDog organicDog = (RoboticDog) pet;
                if (organicDog.getName().length() > longestNameLength) {
                    longestNameLength = organicDog.getName().length();
                }
            }
        }
        System.out.printf("%-" + (longestNameLength + 5)
                + "s|Happiness |Health |Boredom |Oil  |Maintain%n", "Name");
        System.out.printf(
                "%-" + (longestNameLength + 5)
                        + "s|----------|-------|--------|-----|---------%n",
                "-".repeat(longestNameLength + 5));
        for (VirtualPet pet : pets) {
            if (pet.getType().equals("Robotic") && pet.getSpecies().equals("Dog")) {
                RoboticDog organicDog = (RoboticDog) pet;
                System.out.printf("%-" + (longestNameLength + 5) + "s|%-10d|%-7d|%-8d|%-5d|%-9d%n",
                        organicDog.getName(),
                        organicDog.getHappiness(),
                        organicDog.getHealth(),
                        organicDog.getBoredom(),
                        organicDog.getOil(),
                        organicDog.getMaintain());
            }
        }
    }

    public void displayRoboticCatStats() {
        int longestNameLength = 0;
        for (VirtualPet pet : pets) {
            if (pet.getType().equals("Robotic") && pet.getSpecies().equals("Cat")) {
                RoboticCat roboticCat = (RoboticCat) pet;
                if (roboticCat.getName().length() > longestNameLength) {
                    longestNameLength = roboticCat.getName().length();
                }
            }
        }
        System.out.printf("%-" + (longestNameLength + 5)
                + "s|Happiness |Health |Boredom |Oil  |Maintain%n", "Name");
        System.out.printf(
                "%-" + (longestNameLength + 5)
                        + "s|----------|-------|--------|-----|---------%n",
                "-".repeat(longestNameLength + 5));
        for (VirtualPet pet : pets) {
            if (pet.getType().equals("Robotic") && pet.getSpecies().equals("Cat")) {
                RoboticCat roboticCat = (RoboticCat) pet;
                System.out.printf("%-" + (longestNameLength + 5) + "s|%-10d|%-7d|%-8d|%-5d|%-9d%n",
                        roboticCat.getName(),
                        roboticCat.getHappiness(),
                        roboticCat.getHealth(),
                        roboticCat.getBoredom(),
                        roboticCat.getOil(),
                        roboticCat.getMaintain());
            }
        }
    }
}
