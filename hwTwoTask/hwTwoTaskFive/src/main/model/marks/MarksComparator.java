package main.model.marks;

import java.util.Comparator;

public class MarksComparator implements Comparator<Marks> {
    @Override
    public int compare(Marks marks1, Marks marks2) {
        double averageMarks1 = marks1.average();
        double averageMarks2 = marks2.average();

        if (averageMarks1 == averageMarks2) {
            return 0;
        }

        return (averageMarks1 < averageMarks2 ? -1 : 1);
    }
}
