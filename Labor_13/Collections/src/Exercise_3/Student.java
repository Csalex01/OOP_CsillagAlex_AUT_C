package Exercise_3;

import java.util.HashMap;
import java.util.Map;

public class Student {
    private final int ID;

    private final String firstName;
    private final String lastName;

    private final Map<Subject, Double> marks;

    public Student(int ID, String firstName, String lastName) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.marks = new HashMap<>();
    }

    public void addMark(Subject subject, double mark) {
        this.marks.put(subject, mark);
    }

    public boolean hasPassed() {
        double avg = 0;

        for(Map.Entry<Subject, Double> entry : marks.entrySet()) {
            if(entry.getValue() < 5)
                return false;

            avg += entry.getValue();
        }

        return (avg / marks.keySet().size()) >= 6;
    }

    @Override
    public String toString() {
        StringBuilder buffer = new StringBuilder();

        buffer.append(this.firstName).append(" ").append(this.lastName)
                .append("\t[ ");

        for (Subject subject : marks.keySet()) {
            buffer.append(subject)
                    .append("(")
                    .append(marks.get(subject))
                    .append(")");
        }
        
        buffer.append(" ]");

        return buffer.toString();
    }
}
