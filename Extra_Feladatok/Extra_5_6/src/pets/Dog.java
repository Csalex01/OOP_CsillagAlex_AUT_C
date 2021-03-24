package pets;

import date.MyDate;

public class Dog extends Pet {
    public Dog() {
    }

    public Dog(MyDate birthDate, String petName, double currentWeight) {
        super(birthDate, petName, currentWeight);
    }
}
