package test.model;
import main.model.disciplines.Disciplines;
import main.model.disciplines.DisciplinesComparator;
import org.junit.Before;
import org.junit.Test;

import java.util.Comparator;

import static org.junit.Assert.assertTrue;

public class DisciplinesTest {
    Disciplines disciplinesDecreasing1;
    Disciplines disciplinesDecreasing2;
    Disciplines disciplinesIncreasing1;
    Disciplines disciplinesIncreasing2;
    Disciplines disciplinesEquals1;
    Disciplines disciplinesEquals2;
    Comparator<Disciplines> disciplinesComparator = new DisciplinesComparator();


    @Before
    public void setUp() {
        disciplinesDecreasing1 = Disciplines.BIOLOGY;
        disciplinesDecreasing2 = Disciplines.MATHEMATICS;

        disciplinesIncreasing1 = Disciplines.MATHEMATICS;
        disciplinesIncreasing2 = Disciplines.BIOLOGY;

        disciplinesEquals1 = Disciplines.PHYSICS;
        disciplinesEquals2 = Disciplines.PHYSICS;
    }

    @Test
    public void compareDisciplinesShouldReturnTrueForDecreasingNamesDisciplines() {
        assertTrue(disciplinesComparator.compare(disciplinesDecreasing1, disciplinesDecreasing2) < 0);
    }

    @Test
    public void compareDisciplinesShouldReturnTrueForIncreasingNamesDisciplines() {
        assertTrue(disciplinesComparator.compare(disciplinesIncreasing1, disciplinesIncreasing2) > 0);
    }

    @Test
    public void compareDisciplinesShouldReturnTrueForEqualsNamesDisciplines() {
        assertTrue(disciplinesComparator.compare(disciplinesEquals1, disciplinesEquals2) == 0);
    }
}
