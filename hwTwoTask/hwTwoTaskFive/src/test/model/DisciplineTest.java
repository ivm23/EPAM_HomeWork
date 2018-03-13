package test.model;

import main.model.disciplines.Discipline;
import main.model.disciplines.DisciplinesComparator;
import org.junit.Before;
import org.junit.Test;

import java.util.Comparator;

import static org.junit.Assert.assertTrue;

public class DisciplineTest {
    private Discipline disciplineDecreasing1;
    private Discipline disciplineDecreasing2;
    private Discipline disciplineIncreasing1;
    private Discipline disciplineIncreasing2;
    private Discipline disciplineEquals1;
    private Discipline disciplineEquals2;
    private Comparator<Discipline> disciplinesComparator = new DisciplinesComparator();


    @Before
    public void setUp() {
        disciplineDecreasing1 = Discipline.BIOLOGY;
        disciplineDecreasing2 = Discipline.MATHEMATICS;

        disciplineIncreasing1 = Discipline.MATHEMATICS;
        disciplineIncreasing2 = Discipline.BIOLOGY;

        disciplineEquals1 = Discipline.PHYSICS;
        disciplineEquals2 = Discipline.PHYSICS;
    }

    @Test
    public void compareDisciplinesShouldReturnTrueForDecreasingNamesDisciplines() {
        assertTrue(disciplinesComparator.compare(disciplineDecreasing1, disciplineDecreasing2) < 0);
    }

    @Test
    public void compareDisciplinesShouldReturnTrueForIncreasingNamesDisciplines() {
        assertTrue(disciplinesComparator.compare(disciplineIncreasing1, disciplineIncreasing2) > 0);
    }

    @Test
    public void compareDisciplinesShouldReturnTrueForEqualsNamesDisciplines() {
        assertTrue(disciplinesComparator.compare(disciplineEquals1, disciplineEquals2) == 0);
    }
}
