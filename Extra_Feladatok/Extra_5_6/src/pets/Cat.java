package pets;

import date.MyDate;

public class Cat extends Pet {
    public Cat() {
    }

    public Cat(MyDate birthDate, String petName, double currentWeight) {
        super(birthDate, petName, currentWeight);
    }
}
