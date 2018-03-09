package test.model;
import main.model.disciplines.Disciplines;
import main.model.disciplines.DisciplinesComparator;
import main.model.marks.Marks;
import main.model.student.Student;
import main.model.student.StudentHasNotSuchDiscipline;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class StudentTest {
    private Student student;
    private Comparator<Disciplines> disciplinesComparator = new DisciplinesComparator();

    @Before
    public void setUp() {
        student = new Student ("John");
        Marks marks = new Marks(1,2,3,4,5);
        student.setDisciplineWithMarks(Disciplines.PHYSICS, marks);
        student.setDisciplineWithMarks(Disciplines.BIOLOGY, marks);
    }

    @Test
    public void getDisciplinesShouldReturnAllDisciplinesOfStudent() {
        List<Disciplines> disciplines = new ArrayList<>();

        for (Disciplines discipline: student.getDisciplines()) {
            disciplines.add(discipline);
        }

        Collections.sort(disciplines, disciplinesComparator);
        assertEquals("[Biology, Physics]", disciplines.toString());
    }

    @Test
    public void getMarksOfDisciplineShouldReturnMarksForDisciplineBiology() throws StudentHasNotSuchDiscipline {
        assertEquals("1 2 3 4 5 ", student.getMarksOfDiscipline(Disciplines.BIOLOGY).toString());
    }
    @Test(expected = StudentHasNotSuchDiscipline.class)
    public void getMarksOfDisciplineShouldCatchExceptionForNonexistentDiscipline() throws StudentHasNotSuchDiscipline {
        student.getMarksOfDiscipline(Disciplines.MATHEMATICS);
    }
}
