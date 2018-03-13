package main.model.student;

import main.model.marks.Marks;
import main.model.marks.MarksComparator;

import java.util.Comparator;

public class StudentJournalComparator implements Comparator<DisciplineRegister> {

    @Override
    public int compare(DisciplineRegister disciplineRegister1, DisciplineRegister disciplineRegister2) {
        Comparator<Marks> marksComparator = new MarksComparator();

        int compareMarks = marksComparator.compare(disciplineRegister1.getMarks(), disciplineRegister2.getMarks());

        return (compareMarks == 0 ? disciplineRegister1.getDiscipline().getName().compareTo(disciplineRegister2.getDiscipline().getName()) : compareMarks);
    }
}
