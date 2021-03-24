package pets;

import date.MyDate;

public class Parrot extends Pet {
    public Parrot() {
    }

    public Parrot(MyDate birthDate, String petName, double currentWeight) {
        super(birthDate, petName, currentWeight);
    }
}
