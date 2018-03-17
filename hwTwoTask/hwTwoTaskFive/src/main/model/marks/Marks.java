package main.model.marks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Marks<T extends Number> {
    private List<T> marks;

    public Marks(T... marks) {
        this.marks = new ArrayList<T>();
        this.marks.addAll(Arrays.asList(marks));
    }

    public List<T> getMarks() {
        return marks;
    }

    public double average() {
        Double sumOfMArks = 0.0;
        for (T mark : marks) {
            sumOfMArks += mark.doubleValue();
        }
        return sumOfMArks / marks.size();
    }

    @Override
    public String toString() {
        StringBuilder marksString = new StringBuilder();
        for (T mark : marks) {
            marksString.append(mark.toString());
            marksString.append(" ");
        }
        return marksString.toString();
    }

}
