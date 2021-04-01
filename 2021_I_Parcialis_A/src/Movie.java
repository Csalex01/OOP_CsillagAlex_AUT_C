import java.io.File;
import java.io.FileNotFoundException;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Movie {
    private final String title;
    private final String director;
    private final ArrayList<Actor> cast;
    private final int releaseYear;

    /**
     * Constructor of the Movie class
     *
     * @param title       title of the movie
     * @param director    director of the movie
     * @param releaseYear release year of the movie
     */
    public Movie(String title, String director, int releaseYear) {
        this.title = title;
        this.director = director;
        this.releaseYear = releaseYear;
        this.cast = new ArrayList<>();
    }

    /*
        GETTER METHODS
     */

    public String getTitle() {
        return this.title;
    }

    public String getDirector() {
        return this.director;
    }

    public int getReleaseYear() {
        return this.releaseYear;
    }

    /*
        OTHER METHODS
     */

    public void newActor(Actor actor) {
        this.cast.add(actor);
    }

    /**
     * Retires an actor based on the given ID
     *
     * @param ID The ID of the actor
     */
    public void retireActor(String ID) {
        for (Actor actor : this.cast)
            if (actor.getId().equals(ID))
                this.cast.remove(actor);
    }

    public void printCast() {
        System.out.println("The cast: ");

        for (Actor actor : this.cast)
            System.out.println(actor);
    }

    /**
     * Reads data for actors from the given file
     *
     * @param fileName The file name
     */
    public void readActorsFromFile(String fileName) {
        Scanner scanner = null;

        try {
            scanner = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return;
        }

        Actor actor;
        while (scanner.hasNextLine()) {
            String[] line = scanner.nextLine().trim().split(", ");

            actor = new Actor(line[0], line[1], Gender.valueOf(line[2]), Integer.parseInt(line[3]));

            for (int i = 0; i < Integer.parseInt(line[4]); i++)
                actor.setAwardCount();

            this.cast.add(actor);
        }
    }

    public int countFemale() {
        int count = 0;

        for (Actor actor : this.cast)
            if (actor.getGender() == Gender.FEMALE)
                count++;

        return count;
    }

    public String state() {
        StringBuilder buffer = new StringBuilder();

        buffer.append(this.title).append(": \n\t");

        if (this.releaseYear < Calendar.getInstance().get(Calendar.YEAR))
            buffer.append("Relased in: ").append(this.releaseYear);
        else
            buffer.append("Not yet released! Release date: ").append(this.releaseYear);

        return buffer.toString();
    }

    public Actor oldestActor() {
        Actor oldest = this.cast.get(0);

        for (Actor actor : this.cast) {
            int currentIndex = Integer.parseInt(actor.getId().substring(2, actor.getId().length()));
            int oldestIndex = Integer.parseInt(oldest.getId().substring(2, oldest.getId().length()));

            if (actor.getBirthYear() == oldest.getBirthYear() && currentIndex < oldestIndex)
                oldest = actor;

            else if (actor.getBirthYear() < oldest.getBirthYear())
                oldest = actor;
        }

        return oldest;
    }

    public int actorsWithoutAwardsCount() {
        int counter = 0;

        for (Actor actor : this.cast)
            if (actor.getAwardCount() == 0)
                counter++;

        return counter;
    }

    @Override
    public String toString() {
        StringBuilder buffer = new StringBuilder();

        buffer.append(this.title).append(": \n")
                .append("\tDirector: ").append(this.director).append("\n")
                .append("\tRelease date: ").append(this.releaseYear).append("\n")
                .append("\tCast: \n");

        for(Actor actor : this.cast)
            buffer.append("\t\t- ")
                    .append(actor.getFirstName())
                    .append(" ")
                    .append(actor.getLastName())
                    .append("\n");

        return buffer.toString();
    }
}
