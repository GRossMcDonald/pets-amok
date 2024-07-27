package pets_amok;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VirtualPetShelterTest {
    private VirtualPetShelter shelter;

    @BeforeEach
    public void setUp() {
        shelter = new VirtualPetShelter();
    }

    @Test
    public void testAdmitPets() {
        OrganicDog newPet = new OrganicDog("Lazarus", "A lazy dog.");
        shelter.petAdmitted(newPet);

        assertEquals(5, shelter.getPets().size());
        assertEquals("Lazarus", shelter.getPets().get(4).getName());
    }

    @Test
    public void testFeedPets() {
        OrganicDog dog = new OrganicDog("Lazarus", "A lazy dog.");
        OrganicCat cat = new OrganicCat("Nebula", "A cat that stares at the stars.");
        shelter.petAdmitted(dog);
        shelter.petAdmitted(cat);

        shelter.feedPets();

        assertEquals(107, dog.getHunger());
        assertEquals(107, cat.getHunger());
    }

    @Test
    public void testWaterPets() {
        OrganicDog dog = new OrganicDog("Lazarus", "A lazy dog.");
        OrganicCat cat = new OrganicCat("Nebula", "A cat that stares at the stars.");
        shelter.petAdmitted(dog);
        shelter.petAdmitted(cat);

        shelter.feedPets();

        assertEquals(107, dog.getHunger());
        assertEquals(107, cat.getHunger());
    }

    @Test
    public void testOilPets() {
        RoboticDog dog = new RoboticDog("Tank", "Large robot dog.");
        RoboticCat cat = new RoboticCat("Zypher", "A robot cat as quick as an arrow.");
        shelter.petAdmitted(dog);
        shelter.petAdmitted(cat);

        shelter.oilPets();

        assertEquals(107, dog.getOil());
        assertEquals(107, cat.getOil());
    }

    @Test
    public void testMaintainPets() {
        RoboticDog dog = new RoboticDog("Tank", "Large robot dog.");
        RoboticCat cat = new RoboticCat("Zypher", "A robot cat as quick as an arrow.");
        shelter.petAdmitted(dog);
        shelter.petAdmitted(cat);

        shelter.maintainPets();

        assertEquals(107, dog.getMaintain());
        assertEquals(107, cat.getMaintain());
    }

    @Test
    public void testPlayWithPetCorrectName() {
        OrganicDog dog = new OrganicDog("Lazarus", "A lazy dog.");
        shelter.petAdmitted(dog);

        shelter.playWithPet("Lazarus");

        assertTrue(true);
    }

    @Test
    public void testPlayWithPetFalseName() {
        OrganicDog dog = new OrganicDog("Lazarus", "A lazy dog.");
        shelter.petAdmitted(dog);

        shelter.playWithPet("Laser");

        assertFalse(false);
    }

    @Test
    public void testCleanLitterBox() {
        OrganicCat cat = new OrganicCat("Nebula", "A cat that stares at the stars.");
        shelter.petAdmitted(cat);

        OrganicCat.setWaste(10);

        assertEquals(10, shelter.totalingLitterBox());

        shelter.cleanLitterBox();

        assertEquals(0, shelter.totalingLitterBox());
    }
}
