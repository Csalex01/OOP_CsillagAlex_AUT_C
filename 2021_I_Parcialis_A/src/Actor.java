public class Actor {
    public static int actorCount = 0;

    private final String id;
    private final String firstName;
    private final String lastName;
    private final Enum gender;
    private final int birthYear;
    private int awardCount;

    /**
     * Constructor of the Actor class
     *
     * @param firstName first name of the actor
     * @param lastName  last name of the actor
     * @param gender    gender of the actor
     * @param birthYear birth year of the actor
     */
    public Actor(String firstName, String lastName, Enum gender, int birthYear) {
        Actor.actorCount++;

        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthYear = birthYear;

        this.id = this.firstName.substring(0, 1) + this.lastName.substring(0, 1) + Actor.actorCount;
    }

    /*
        GETTER METHODS
     */

    public String getId() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public Enum getGender() {
        return this.gender;
    }

    public int getBirthYear() {
        return this.birthYear;
    }

    public int getAwardCount() {
        return this.awardCount;
    }

    /*
        SETTER METHODS
     */

    public void setAwardCount() {
        this.awardCount++;
    }

    /*
        OTHER METHODS
     */

    /**
     * Prints out all the fields of the current actor using StringBuilder.
     *
     * @return The built string
     */
    @Override
    public String toString() {
        StringBuilder buffer = new StringBuilder();

        buffer.append(this.id).append(": \n")
                .append("\tName: ").append(this.firstName).append(" ").append(this.lastName).append("\n")
                .append("\tBirth year: ").append(this.birthYear).append("\n")
                .append("\tGender: ").append(this.gender).append("\n")
                .append("\tAwards count: ").append(this.awardCount)
                .append("\n");

        return buffer.toString();
    }
}
