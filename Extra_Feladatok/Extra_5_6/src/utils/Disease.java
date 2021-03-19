package utils;

import java.util.ArrayList;

public class Disease extends Util{
    public ArrayList<String> treatments;
    private PetType petType;
    private String disease;

    public Disease(String disease, PetType petType) {
        super();
        this.disease = disease;
        this.petType = petType;
    }

}
