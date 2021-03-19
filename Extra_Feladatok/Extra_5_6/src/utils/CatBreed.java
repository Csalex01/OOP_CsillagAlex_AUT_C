package utils;

public enum CatBreed {
    Polydactyl,
    Snowshoe,
    Calico,
    BritishShorthair("British Shorthair"),
    Siamese,
    JapaneseBobtail("Japanese Bobtail"),
    Persian,
    ScottishFold("Japanese Bobtail"),
    GrayTabby("Gray abby");


    private final String value;

    CatBreed() {
        this.value = "";
    }

    CatBreed(String breed) {
        this.value = breed;
    }
}
