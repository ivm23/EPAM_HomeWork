import main.model.disciplines.Discipline;
import main.model.marks.Marks;
import main.model.student.DisciplineRegister;
import main.model.student.Student;
import main.model.student.StudentJournalComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        Student student = new Student("Joe");
        Comparator comparator = new StudentJournalComparator();

        Marks marksBiology = new Marks<>(1.0,2.0);

        student.setDisciplineWithMarks(Discipline.BIOLOGY, marksBiology);

        Marks marksPhysics = new Marks<>(3,2);
        student.setDisciplineWithMarks(Discipline.PHYSICS, marksPhysics);

        List<DisciplineRegister> sortedList = new ArrayList<>(student.getStudentJournal());
        Collections.sort(sortedList, comparator);

        for (DisciplineRegister disciplineRegister : sortedList) {
            System.out.println(disciplineRegister.toString());
        }
    }
}
