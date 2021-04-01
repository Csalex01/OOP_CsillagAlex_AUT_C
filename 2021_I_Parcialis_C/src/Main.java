public class Main {
    public static void main(String[] args) {
        Athlete a1 = new Athlete("Alex", "Csillag", Category.SWIMMING, true, 2020, 2001, 1.93);
        Athlete a2 = new Athlete("John", "Wick", Category.BOXING, true, 1980, 1960, 1.85);
        Athlete a3 = new Athlete("Usain", "Bolt", Category.RUNNING, true, 2020, 1986, 1.95);

        System.out.println("A1 ID: " + a1.getId());
        System.out.println("A1 firstName: " + a1.getFirstName());
        System.out.println("A1 lastName: " + a1.getLastName());
        System.out.println("A1 category: " + a1.getCategory());
        System.out.println("A1 gender: " + a1.getGender());
        System.out.println("A1 medalCount: " + a1.getMedalCount());
        System.out.println("A1 latestAttendance: " + a1.getLatestAttendanceYear());
        System.out.println("A1 birthYear: " + a1.getBirthYear());
        System.out.println("A1 height: " + a1.getHeight());
        System.out.println();
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        System.out.println("--------------------\n");

        Olympics olympics = new Olympics("Nowhere 101", 2020);
        olympics.readParticipantsFromCSVFile("participants.csv");

        System.out.println("Participants: ");
        for (Athlete athlete : olympics.getParticipants())
            System.out.println(athlete);

        System.out.println("Participant count: " + olympics.getParticipantCount() + "\n");
        olympics.participantCountByCategory(Category.SWIMMING);
        System.out.println("\nAverage height in the category of SWIMMING: " + String.format("%.3f", olympics.averageHeightInSwimming()) + "\n");
        olympics.genderSpread();
        System.out.println();

        System.out.println("Athlete with the most medals: ");
        System.out.println(olympics.mostMedals());
        System.out.println(olympics);
    }
}
