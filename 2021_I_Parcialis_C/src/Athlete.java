public class Athlete {
    public static int athleteCount = 0;

    private final String id;
    private final String firstName;
    private final String lastName;
    private final Category category;
    private final boolean gender;
    private int medalCount;
    private int latestAttendanceYear;
    private final int birthYear;
    private double height;

    /**
     * Constructor of the Athlete class
     *
     * @param firstName            First Name
     * @param lastName             Last Name
     * @param category             Category that the participant is participating
     * @param gender               The gender of the participant
     * @param latestAttendanceYear When did the athlete last participate
     * @param birthYear            Birth year
     * @param height               Height
     */
    public Athlete(String firstName,
                   String lastName,
                   Category category,
                   boolean gender,
                   int latestAttendanceYear,
                   int birthYear,
                   double height) {
        Athlete.athleteCount++;

        this.firstName = firstName;
        this.lastName = lastName;
        this.category = category;
        this.gender = gender;
        this.latestAttendanceYear = latestAttendanceYear;
        this.birthYear = birthYear;
        this.height = height;

        this.medalCount = 0;
        this.id = this.firstName.substring(0, 1) + this.lastName.substring(0, 1) + "-" + this.birthYear + "-" + Athlete.athleteCount;
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

    public Category getCategory() {
        return this.category;
    }

    public boolean getGender() {
        return this.gender;
    }

    public int getMedalCount() {
        return this.medalCount;
    }

    public int getLatestAttendanceYear() {
        return this.latestAttendanceYear;
    }

    public int getBirthYear() {
        return this.birthYear;
    }

    public double getHeight() {
        return this.height;
    }

    /*
        SETTER METHODS
     */

    public void setMedalCount(int medalCount) {
        this.medalCount = medalCount;
    }

    public void setLatestAttendanceYear(int latestAttendanceYear) {
        this.latestAttendanceYear = latestAttendanceYear;
    }

    /*
        OTHER METHODS
     */

    /**
     * Returns a string with all the information that the athlete has.
     *
     * @return String containing the data
     */
    @Override
    public String toString() {
        StringBuilder buffer = new StringBuilder();

        buffer.append(this.id).append(": \n")
                .append("\tName: ").append(this.firstName).append(" ").append(this.lastName).append("\n")
                .append("\tBirth year: ").append(this.birthYear).append("\n")
                .append("\tHeight: ").append(this.height).append("\n")
                .append("\tGender: ");

        if (this.gender)
            buffer.append("Male");
        else
            buffer.append("Female");

        buffer.append("\n\tCategory: ").append(this.category).append("\n")
                .append("\tMedal count: ").append(this.medalCount).append("\n")
                .append("\tLatest participation: ").append(this.latestAttendanceYear).append("\n");

        return buffer.toString();
    }
}
