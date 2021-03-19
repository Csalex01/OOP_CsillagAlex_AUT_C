package utils;

import java.util.ArrayList;
import java.util.Random;

public class Util {
    public static Random random = new Random();
    public static ArrayList<String> commonWords = new ArrayList<>();
    public static ArrayList<Disease> diseases = new ArrayList<>();

    public static void readDiseasesAndTreatmentsFromFile(String fileName) {
        // TODO: readDiseasesAndTreatmentsFromFile
    }

    public static void printAllDiseasesByPetType(PetType petType) {
        // TODO: printAllDiseasesByPetType
    }

    public static ArrayList<Disease> getDiseasesByPetType(PetType petType) {
        // TODO: getDiseasesByPetType
        return null;
    }

    public static void readCommonWordsFromFile(String fileName) {
        // Todo: readCommonWordsFromFile
    }

    public static int getRandomNumber() {
        return Util.random.nextInt();
    }

    public static int getNumOfDiseasesByPet(PetType petType) {
        return 0;
    }

    public static String treatmentsByDiseaseType(String disease) {
        // TODO: treatmentsByDiseaseType
        return null;
    }
}
