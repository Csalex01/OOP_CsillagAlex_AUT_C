public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie("The Umbrella Academy", "Gerard Way", 2019);

        movie.readActorsFromFile("cast.csv");
        movie.printCast();

        System.out.println(movie.state());

        System.out.println(movie.oldestActor());

        System.out.println(movie);
    }
}
