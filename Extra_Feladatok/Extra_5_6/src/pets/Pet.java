package pets;

import date.MyDate;
import utils.PetType;
import utils.Taxonomy;
import utils.Util;

import java.util.ArrayList;

public class Pet implements interfaces.IPatient{
    public static int numPets = 0;
    public ArrayList<String> diseases;

    private final int petId;
    private Taxonomy taxonomy;
    private boolean healthy;
    private final MyDate birthDate;
    private String petName;
    private double currentWeight;

    public Pet(MyDate birthDate, String petName, double currentWeight) {
        this.petId = Pet.numPets;
        this.birthDate = birthDate;
        this.petName = petName;
        this.currentWeight = currentWeight;
        this.healthy = true;
    }

    public String speak() {
        return "DEFAULT SPEAK";
    }

    public void unexpectedIllnessOccurred() {

    }

    public void checkHealthStatus() {

    }

    public void healing() {

    }

    public static int getNumPets() {
        return numPets;
    }

    @Override
    public String toString() {
        return "";
    }
}
