import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cinema {
    private final String name;
    private final String address;
    private boolean open;
    public final ArrayList<Movie> movies;

    public Cinema(String name, String address) {
        this.name = name;
        this.address = address;

        this.open = true;
        this.movies = new ArrayList<>();
    }

   /*
        GETTER METHODS
     */

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public boolean isOpen() {
        return this.open;
    }

    /*
        SETTER METHODS
     */
    public void setOpen() {
        this.open = !this.open;
    }

    /*
        OTHER METHODS
     */
    public void addNewMovie(Movie movie) {
        this.movies.add(movie);
    }

    public void printMovieById(String id) {
        for (Movie movie : this.movies)
            if (movie.getId().equals(id))
                System.out.println(movie);
    }

    public void readMoviesFromFile(String fileName) {
        Scanner scanner = null;

        try {
            scanner = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return;
        }

        while (scanner.hasNextLine()) {
            String[] line = scanner.nextLine().trim().split(", ");
            this.movies.add(new Movie(line[0], Category.valueOf(line[1]), Double.parseDouble(line[2]), !Boolean.parseBoolean(line[3])));
        }
    }

    public int moviesBasedOnRealityCount() {
        int count = 0;

        for (Movie movie : this.movies)
            if (!movie.isFiction())
                count++;

        return count;
    }

    public void printToFile(Category category) {
        FileWriter file = null;

        try {
            file = new FileWriter("output.txt");

            for (Movie movie : this.movies)
                if (movie.getCategory() == category)
                    file.write(movie.toString());

            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean canIWatchIt(double time) {
        if(!this.open)
            return false;

        double totalTime = 0;

        for(Movie movie : this.movies)
            totalTime += movie.getLength();

        return totalTime <= time;
    }

    public int lessThanTenActors() {
        int count = 0;

        for(Movie movie : this.movies)
            if(movie.getActorCount() < 10)
                count++;

        return count;
    }

    @Override
    public String toString() {
        StringBuilder buffer = new StringBuilder();

        buffer.append(this.name).append(": \n")
                .append("\tAddress: ").append(this.address).append("\n")
                .append("\tOpen: ").append(this.open).append("\n");

        buffer.append("\tMovies: \n");
        for(Movie movie : this.movies)
            buffer.append("\t\t- ")
                    .append(movie.getTitle())
                    .append("\n");

        return buffer.toString();
    }
}
