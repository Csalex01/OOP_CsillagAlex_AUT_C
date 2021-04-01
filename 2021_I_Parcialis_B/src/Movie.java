import java.util.Random;

public class Movie {
    public static int movieCount = 0;

    private final String id;
    private final String title;
    private final Category category;
    private final int actorCount;
    private final double length;
    private final boolean fiction;

    /**
     * Constructor of the class Movie
     *
     * @param title    The title of the movie
     * @param category The category of the movie
     * @param length   The length of the movie
     * @param fiction  True if the movie is fictional, false when it is not
     */
    public Movie(String title, Category category, double length, boolean fiction) {
        Movie.movieCount++;

        this.title = title;
        this.category = category;
        this.length = length;
        this.fiction = fiction;
        this.id = this.title.substring(0, 1) + "_" + category.toString().substring(0, 1) + "_" + Movie.movieCount;
        this.actorCount = (new Random()).nextInt(31) + 1;
    }

    /*
        GETTER METHODS
     */

    public String getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public Category getCategory() {
        return this.category;
    }

    public int getActorCount() {
        return this.actorCount;
    }

    public double getLength() {
        return this.length;
    }

    public boolean isFiction() {
        return this.fiction;
    }

    /*
        OTHER METHODS
     */

    @Override
    public String toString() {
        StringBuilder buffer = new StringBuilder();

        buffer.append(this.id).append(": \n")
                .append("\tTitle: ").append(this.title).append("\n")
                .append("\tCategory: ").append(this.category).append("\n")
                .append("\tCast count: ").append(this.actorCount).append("\n")
                .append("\tLength: ").append(this.length).append("h\n")
                .append("\tIs it fictional? ").append(this.fiction ? "Yes" : "No").append("\n");

        return buffer.toString();
    }
}
