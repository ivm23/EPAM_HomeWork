package test.model;

import main.model.marks.Marks;
import main.model.marks.MarksComparator;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class MarksTest {
    private Marks marksForAverage;
    private List<Marks> marksForSort;

    private Comparator<Marks> marksComparator = new MarksComparator();

    @Before
    public void setUp() {
        marksForAverage = new Marks(1, 2, 3, 4, 5);
        marksForSort = new ArrayList<>();
        marksForSort.add(marksForAverage);
        marksForSort.add(new Marks(2, 2));
        marksForSort.add(new Marks(5, 5, 5, 5));
    }

    @Test
    public void getAverageShouldReturnAverage() {
        assertEquals(3.0, marksForAverage.average(), 0.00001);
    }

    @Test
    public void getToStringShouldReturnString() {
        assertEquals("1 2 3 4 5 ", marksForAverage.toString());
    }

    @Test
    public void sortMarksShouldReturnSortedMarks() {
        Collections.sort(marksForSort, marksComparator);
        assertEquals("[2 2 , 1 2 3 4 5 , 5 5 5 5 ]", marksForSort.toString());

    }
}
