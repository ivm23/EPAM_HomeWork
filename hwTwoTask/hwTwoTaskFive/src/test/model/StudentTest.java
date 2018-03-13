package test.model;

import main.model.disciplines.Discipline;
import main.model.disciplines.DisciplinesComparator;
import main.model.marks.Marks;
import main.model.student.Student;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class StudentTest {
    private Student student;
    private Comparator<Discipline> disciplinesComparator = new DisciplinesComparator();

    @Before
    public void setUp() throws Exception {
        student = new Student("John");
        Marks marksForPhysics = new Marks<Integer>(1, 2, 3, 4, 5);
        Marks marksForBiology = new Marks<Double>(1.0, 2.0, 3.0, 4.0, 5.0);
        student.setDisciplineWithMarks(Discipline.PHYSICS, marksForPhysics);
        student.setDisciplineWithMarks(Discipline.BIOLOGY, marksForBiology);
    }

    @Test
    public void getDisciplinesShouldReturnAllDisciplinesOfStudent() {
        List<Discipline> disciplines = new ArrayList<>();

        for (Discipline discipline : student.getDisciplines()) {
            disciplines.add(discipline);
        }

        Collections.sort(disciplines, disciplinesComparator);
        assertEquals("[Biology, Physics]", disciplines.toString());
    }

    @Test
    public void getMarksOfDisciplineShouldReturnMarksForDisciplineBiology() throws Exception {
        assertEquals("1.0 2.0 3.0 4.0 5.0 ", student.getMarksOfDiscipline(Discipline.BIOLOGY).toString());
    }

    @Test(expected = Exception.class)
    public void getMarksOfDisciplineShouldCatchExceptionForNonexistentDiscipline() throws Exception {
        student.getMarksOfDiscipline(Discipline.MATHEMATICS);
    }
}
