package pets_amok;

import java.util.ArrayList;
import java.util.Scanner;

public class VirtualPetShelterApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        VirtualPetShelter shelter = new VirtualPetShelter();

        System.out.println("Welcome to the virtual pet shelter!");
        System.out.println("Admit, adopt, and tend to the pets needs!");
        System.out.println("Keep in mind that different animals have different needs!");
        System.out.println();

        while (true) {
            System.out.println("Organic Dogs Status:");
            shelter.displayOrganicDogStats();
            System.out.println();

            System.out.println("Organic Cats Status:");
            shelter.displayOrganicCatStats();
            System.out.println();

            System.out.println("Organic Cats Litter Box Fullness:");
            System.out.println(shelter.totalingLitterBox());
            System.out.println();

            System.out.println("Organic Bird Status:");
            shelter.displayOrganicBirdStats();
            System.out.println();

            System.out.println("Robotic Dog Status:");
            shelter.displayRoboticDogStats();
            System.out.println();

            System.out.println("Robotic Cat Status:");
            shelter.displayRoboticCatStats();
            System.out.println();

            System.out.println("Press (1) to feed organic pets.");
            System.out.println("Press (2) to water organic pets.");
            System.out.println("Press (3) to play with a pet.");
            System.out.println("Press (4) to adopt a pet from the shelter.");
            System.out.println("Press (5) to admit a new pet.");
            System.out.println("Press (6) to clean an organic pets's cage.");
            System.out.println("Press (7) to walk all dogs.");
            System.out.println("Press (8) to oil all robotic pets.");
            System.out.println("Press (9) to perform maintenance on all robotic pets.");
            System.out.println("Press (10) to clean the organic cat litter box.");
            System.out.println("Press (11) to exit game.");

            int userInput = input.nextInt();
            input.nextLine();

            if (userInput == 1) {
                shelter.feedPets();
                System.out.println("Your organic pets have been fed.");
            } else if (userInput == 2) {
                shelter.waterPets();
                System.out.println("Your organic pets have been watered.");
            } else if (userInput == 3) {
                while (true) {
                    System.out.println("Which pet would you like to play with?");
                    String chosenPet = input.nextLine();
                    System.out.println();
                    if (shelter.playWithPet(chosenPet)) {
                        System.out.println("Okay, you play with " + chosenPet);
                        System.out.println();
                        break;
                    } else {
                        System.out.println("No pets in this shelter go by that name. You idiot. Try again.");
                        // Infinite loop is user continues to try a name that doesn't exist.
                    }
                }
            } else if (userInput == 4) {
                while (true) {
                    System.out.println();
                    System.out.println("Which pet would you like to adopt?");
                    System.out.println();
                    System.out.println("Pets present in this shelter:");
                    System.out.println();
                    shelter.getAllPets();

                    int userChoice = input.nextInt();
                    input.nextLine();

                    if (userChoice < 1 || userChoice > shelter.size()) {
                        System.out.println("Invalid input. Please try again.");
                        continue;
                    } else {
                        ArrayList<VirtualPet> petsInShelter = shelter.getPets();
                        System.out.println(petsInShelter.get(userChoice - 1));
                        VirtualPet petToAdopt = petsInShelter.get(userChoice - 1);
                        shelter.petAdopted(petToAdopt);
                        System.out.println();
                        System.out.println(petToAdopt.getName() + " has been adopted by a loving family!");
                        break;
                    }
                }
            } else if (userInput == 5) {
                System.out.println();
                System.out.println("Press (1) to admit an organic dog.");
                System.out.println("Press (2) to admit an organic cat.");
                System.out.println("Press (3) to admit an organic bird.");
                System.out.println("Press (4) to admit a robotic dog.");
                System.out.println("Press (5) to admit a robotic cat.");

                int userChoice = input.nextInt();
                input.nextLine();

                if (userChoice == 1) {
                    System.out.println();
                    System.out.println("Enter the name of the new pet:");
                    String newName = input.nextLine();

                    System.out.println();
                    System.out.println("Give " + newName + " a description:");
                    String newDescription = input.nextLine();

                    OrganicDog newPet = new OrganicDog(newName, newDescription);
                    shelter.petAdmitted(newPet);
                    System.out.println();
                    System.out.println("You have admitted " + newName + " to the shelter.");
                } else if (userChoice == 2) {
                    System.out.println();
                    System.out.println("Enter the name of the new pet:");
                    String newName = input.nextLine();

                    System.out.println();
                    System.out.println("Give " + newName + " a description:");
                    String newDescription = input.nextLine();

                    OrganicCat newPet = new OrganicCat(newName, newDescription);
                    shelter.petAdmitted(newPet);
                    System.out.println();
                    System.out.println("You have admitted " + newName + " to the shelter.");
                } else if (userChoice == 3) {
                    System.out.println();
                    System.out.println("Enter the name of the new pet:");
                    String newName = input.nextLine();

                    System.out.println();
                    System.out.println("Give " + newName + " a description:");
                    String newDescription = input.nextLine();

                    OrganicBird newPet = new OrganicBird(newName, newDescription);
                    shelter.petAdmitted(newPet);
                    System.out.println();
                    System.out.println("You have admitted " + newName + " to the shelter.");
                } else if (userChoice == 4) {
                    System.out.println();
                    System.out.println("Enter the name of the new pet:");
                    String newName = input.nextLine();

                    System.out.println();
                    System.out.println("Give " + newName + " a description:");
                    String newDescription = input.nextLine();

                    RoboticDog newPet = new RoboticDog(newName, newDescription);
                    shelter.petAdmitted(newPet);
                    System.out.println();
                    System.out.println("You have admitted " + newName + " to the shelter.");
                } else if (userChoice == 5) {
                    System.out.println();
                    System.out.println("Enter the name of the new pet:");
                    String newName = input.nextLine();

                    System.out.println();
                    System.out.println("Give " + newName + " a description:");
                    String newDescription = input.nextLine();

                    RoboticCat newPet = new RoboticCat(newName, newDescription);
                    shelter.petAdmitted(newPet);
                    System.out.println();
                    System.out.println("You have admitted " + newName + " to the shelter.");
                } else {
                    System.out.println("Invalid input.");
                    continue;
                }
            } else if (userInput == 6) {
                while (true) {
                    System.out.println("Which organic dog or bird cage would you like to clean?");
                    String chosenPet = input.nextLine();
                    System.out.println();
                    if (shelter.cleanCage(chosenPet)) {
                        System.out.println("Okay, you clean " + chosenPet + "'s cage.");
                        System.out.println();
                        break;
                    } else {
                        System.out.println("No organic pets in this shelter go by that name. You idiot. Try again.");
                    }
                }
            } else if (userInput == 7) {
                shelter.walkDogs();
                System.out.println("You have taken your dogs on a walk.");
                System.out.println();
            } else if (userInput == 8) {
                shelter.oilPets();
                System.out.println("The robotic pets joint health has improved.");
            } else if (userInput == 9) {
                shelter.maintainPets();
                System.out.println("All robotic pets have been examined and fixed.");
            } else if (userInput == 10) {
                shelter.cleanLitterBox();
                System.out.println("The litter box has been cleaned.");
            } else if (userInput == 11) {
                break;
            }
            shelter.litterBoxCheck();
            shelter.tickAll();

        }
        input.close();
    }
}
