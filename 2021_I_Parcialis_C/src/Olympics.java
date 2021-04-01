import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Olympics {
    private final String location;
    private final int year;
    private final ArrayList<Athlete> participants;

    /**
     * Constructor of the Olympics class
     *
     * @param location Location of the Olympics
     * @param year     The year which the Olympics will be held
     */
    public Olympics(String location, int year) {
        this.location = location;
        this.year = year;
        this.participants = new ArrayList<>();
    }

    /*
        GETTER METHODS
     */

    public String getLocation() {
        return location;
    }

    public int getYear() {
        return year;
    }

    public ArrayList<Athlete> getParticipants() {
        return participants;
    }

    /*
        OTHER METHODS
     */
    public int getParticipantCount() {
        return this.participants.size();
    }

    public void registerParticipant(Athlete athlete) {
        if (athlete.getLatestAttendanceYear() < this.year)
            athlete.setLatestAttendanceYear(this.year);

        this.participants.add(athlete);
    }

    public void printParticipantDataById(String id) {
        for (Athlete athlete : this.participants)
            if (athlete.getId().equals(id))
                System.out.println(athlete);
    }

    public void readParticipantsFromCSVFile(String fileName) {
        Scanner scanner = null;

        try {
            scanner = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return;
        }

        while (scanner.hasNextLine()) {
            String[] line = scanner.nextLine().trim().split(", ");

            if (line.length == 0)
                continue;

            // Sequence: firstName, lastName, category, gender, lastAttendanceYear, birthYear, height
            Athlete athlete = new Athlete(line[0], line[1], Category.valueOf(line[4]), Boolean.parseBoolean(line[2]), this.year, Integer.parseInt(line[3]), Double.parseDouble(line[5]));
            athlete.setMedalCount((new Random()).nextInt(5) + 1);
            this.participants.add(athlete);
        }
    }

    public void participantCountByCategory(Category category) {
        System.out.println("Athletes in the category: " + category);
        for (Athlete athlete : this.participants)
            if (athlete.getCategory() == category)
                System.out.println(athlete);
    }

    public double averageHeightInSwimming() {
        double avg = 0;
        int count = 0;

        for (Athlete athlete : this.participants)
            if (athlete.getCategory() == Category.SWIMMING) {
                avg += athlete.getHeight();
                count++;
            }

        if (count == 0)
            return 0;

        return avg / count;
    }

    public void genderSpread() {
        int maleCount = 0;
        int femaleCount = 0;

        for (Athlete athlete : this.participants)
            if (athlete.getGender())
                maleCount++;
            else
                femaleCount++;

        if (maleCount > femaleCount)
            System.out.println("MALE > FEMALE");
        else if (maleCount < femaleCount)
            System.out.println("MALE < FEMALE");
        else
            System.out.println("MALE = FEMALE");
    }


    public Athlete mostMedals() {
        // The athlete with the most medals and the highest index
        Athlete maxAthlete = this.participants.get(0);

        // Loop through each athelete in the participants ArrayList
        for (Athlete athlete : this.participants) {
            // Calculate the indices (first 8 digit reserved for first name, last name and birth year, plus "- "
            // after that there is the index that we need)
            int currentIndex = Integer.parseInt(athlete.getId().substring(8, athlete.getId().length()));
            int maxIndex = Integer.parseInt(maxAthlete.getId().substring(8, maxAthlete.getId().length()));

            // If the current athlete has the same amount of medals asa maxAthlete,
            // we need to check whether the currentIndex is bigger, or the maxIndex.
            if (athlete.getMedalCount() == maxAthlete.getMedalCount() && currentIndex > maxIndex)
                maxAthlete = athlete;
            else if (athlete.getMedalCount() > maxAthlete.getMedalCount())
                maxAthlete = athlete;
        }

        // Return the max athlete
        return maxAthlete;
    }

    /**
     * Return a string with all the information required.
     *
     * @return String containing the data
     */
    @Override
    public String toString() {
        StringBuilder buffer = new StringBuilder();

        buffer.append("Olympics: ").append("\n")
                .append("\tLocation: ").append(this.location).append("\n")
                .append("\tYear: ").append(this.year).append("\n")
                .append("\tAthletes: ").append("\n");

        for (Athlete athlete : this.participants)
            buffer.append("\t\t- ")
                    .append(athlete.getFirstName()).append(" ").append(athlete.getLastName())
                    .append("\n");

        return buffer.toString();
    }
}
