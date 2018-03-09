import main.model.disciplines.Disciplines;
import main.model.marks.Marks;
import main.model.student.DisciplineAndMark;
import main.model.student.Student;
import main.model.student.StudentJournalComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class main {
    public static void main(String[] args) {

        Student student = new Student("Joe");
        Comparator<DisciplineAndMark> comparator = new StudentJournalComparator();

        Marks marksBiology = new Marks<>( 2.0);

        student.setDisciplineWithMarks(Disciplines.BIOLOGY, marksBiology);
        Marks marksPhysics = new Marks<>( 1);
        student.setDisciplineWithMarks(Disciplines.PHYSICS, marksPhysics);

        List<DisciplineAndMark> sortedList = new ArrayList(student.getStudentJournal());
        Collections.sort(sortedList, comparator);

        for (DisciplineAndMark disciplineAndMark : sortedList){
            System.out.println(disciplineAndMark.toString());
        }
    }
}
