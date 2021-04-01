public class Main {
    public static void main(String[] args) {
        Cinema cinema = new Cinema("CINEMA", "Nowhere 101");
        cinema.readMoviesFromFile("movies.csv");

        for (Movie movie : cinema.movies)
            System.out.println(movie);

        System.out.println("Movies based on reality: " + cinema.moviesBasedOnRealityCount());

        cinema.printToFile(Category.HISTORIC);

        System.out.println("Can I watch all the movies? " + (cinema.canIWatchIt(2) ? "Yes." : "No."));
        System.out.println("Movie count with less than 10 actors: " + cinema.lessThanTenActors());

        System.out.println(cinema);
    }
}
