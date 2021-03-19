package utils;

public enum DogBreed {
    LabradorRetrievers("Labrador Retrievers"),
    GermanShepherds("German Shepherds"),
    GoldenRetrievers("Golden Retrievers"),
    FrenchBulldogs("French Bulldogs"),
    Bulldogs,
    Beagles,
    Poodles;

    private String value;

    DogBreed() {
        this.value = "";
    }

    DogBreed(String value) {
        this.value = value;
    }
}
