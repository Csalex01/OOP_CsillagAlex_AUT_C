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
    private MyDate birthDate;
    private String petName;
    private double currentWeight;

    public Pet() {
        this.petId = Pet.numPets;
        this.birthDate = new MyDate(0, 0, 0);
    }

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
        // TODO: unexpectedIllnessOccurred
        this.healthy = false;
    }

    public void checkHealthStatus() {
        if(this.healthy) {
            System.out.println(this.petName + " is healthy");
            return;
        }

        StringBuilder str = new StringBuilder();

        str.append(this.petName)
            .append(" is suffering from the following diseases: ");

        for(String disease : this.diseases)
            str.append("- ")
                .append(disease)
                .append("\n");

        System.out.println(str);
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
