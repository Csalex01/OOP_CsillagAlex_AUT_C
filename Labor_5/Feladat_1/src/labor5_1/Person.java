package labor5_1;

public class Person {
    private final String firstName;
    private String lastName;
    private final int birthYear;

    public Person(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();

        str.append(this.firstName)
            .append(" ")
            .append(this.lastName)
            .append(", ")
            .append(this.birthYear);

        return str.toString();
    }
}
