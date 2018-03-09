package main.model.student;

import main.model.marks.Marks;
import main.model.marks.MarksComparator;

import java.util.Comparator;

public class StudentJournalComparator implements Comparator<DisciplineAndMark> {

    @Override
    public int compare(DisciplineAndMark disciplineAndMark1, DisciplineAndMark disciplineAndMark2) {
        Comparator<Marks> marksComparator = new MarksComparator();

        int compareMarks = marksComparator.compare(disciplineAndMark1.getMarks(), disciplineAndMark2.getMarks());

        return (compareMarks == 0 ? disciplineAndMark1.getDisciplines().getName().compareTo(disciplineAndMark2.getDisciplines().getName()) : compareMarks);
    }
}
