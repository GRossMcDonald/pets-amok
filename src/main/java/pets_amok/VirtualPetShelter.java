package pets_amok;

import java.util.ArrayList;

public class VirtualPetShelter {
    private ArrayList<VirtualPet> pets;

    public VirtualPetShelter() {
        this.initialPetsAtShelter();
    }

    public void initialPetsAtShelter() {
        OrganicDog organicDog1 = new OrganicDog("Malakai", "A happy-go-lucky doggo.");
        OrganicCat organicCat1 = new OrganicCat("Alastair", "He thinks he's the king of the jungle.");
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

    public void listAllPets() {
        System.out.println("Pets inside the shelter:");
        for (int petIndex = 0; petIndex < this.pets.size(); petIndex++) {
            System.out.println((petIndex + 1) + ") " + this.pets.get(petIndex));
        }
    }

    public void listOrganicPets() {
        System.out.println("Organic pets in the shelter:");
        for (VirtualPet pet : this.pets) {
            if (pet.getType().equals("Organic")) {
                System.out.println(pet);
            }
        }
    }

    public void listRoboticPets() {
        System.out.println("Robotic pets in the shelter:");
        for (VirtualPet pet : this.pets) {
            if (pet.getType().equals("Robotic")) {
                System.out.println(pet);
            }
        }
    }

    public void feedPets() {
        for (VirtualPet pet : this.pets) {
            if (pet.getType().equals("Organic")) {
                pet.feed();
            }
        }
    }
}
