package test.model;

import main.model.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

import static java.util.Collections.*;
import static org.junit.Assert.assertArrayEquals;

public class SortTest {
    private OfficeSupplies pen;
    private OfficeSupplies autoPen;
    private OfficeSupplies pencil;
    private OfficeSupplies ruler;
    private OfficeSupplies protractor;
    private OfficeSupplies marker;
    private ArrayList<OfficeSupplies> beginnerKit;
    private ArrayList<OfficeSupplies> beginnerKitSort;
    private ArrayList<OfficeSupplies> beginnerKitSortByName;
    private ArrayList<OfficeSupplies> beginnerKitSortByPrice;
    private Comparator<OfficeSupplies> comparator;
    private Comparator<OfficeSupplies> comparatorByName;
    private Comparator<OfficeSupplies> comparatorByPrice;

    @Before
    public void setUp() {
        comparator = new OfficeSuppliesComparator();
        comparatorByName = new OfficeSuppliesComparator.OfficeSuppliesComparatorByName();
        comparatorByPrice = new OfficeSuppliesComparator.OfficeSuppliesComparatorByPrice();

        pen = new Pen(10, Ink.BALLPOINT);
        autoPen = new Pen(9, Ink.BALLPOINT, true);
        pencil = new Pencil(11, "HS");
        ruler = new Ruler(11, 10.5);
        protractor = new Protractor(14.5, 90);
        marker = new Marker(27.3);
        beginnerKit = new ArrayList<OfficeSupplies>();
        beginnerKit.add(protractor);
        beginnerKit.add(pen);
        beginnerKit.add(ruler);
        beginnerKit.add(marker);
        beginnerKit.add(pencil);
        beginnerKit.add(autoPen);

        beginnerKitSort = new ArrayList<OfficeSupplies>();
        beginnerKitSort.add(autoPen);
        beginnerKitSort.add(pen);
        beginnerKitSort.add(pencil);
        beginnerKitSort.add(ruler);
        beginnerKitSort.add(protractor);
        beginnerKitSort.add(marker);

        beginnerKitSortByName = new ArrayList<OfficeSupplies>();
        beginnerKitSortByName.add(marker);
        beginnerKitSortByName.add(pen);
        beginnerKitSortByName.add(autoPen);
        beginnerKitSortByName.add(pencil);
        beginnerKitSortByName.add(protractor);
        beginnerKitSortByName.add(ruler);

        beginnerKitSortByPrice = new ArrayList<OfficeSupplies>();
        beginnerKitSortByPrice.add(autoPen);
        beginnerKitSortByPrice.add(pen);
        beginnerKitSortByPrice.add(ruler);
        beginnerKitSortByPrice.add(pencil);
        beginnerKitSortByPrice.add(protractor);
        beginnerKitSortByPrice.add(marker);
    }

    @Test
    public void sortByNameTestShouldReturnArraySortedByName() {
        sort(beginnerKit, comparatorByName);
        assertArrayEquals(beginnerKitSortByName.toArray(), beginnerKit.toArray());
    }

    @Test
    public void sortByPriceTestShouldReturnArraySortedByPrice() {
        sort(beginnerKit, comparatorByPrice);
        assertArrayEquals(beginnerKitSortByPrice.toArray(), beginnerKit.toArray());
    }

    @Test
    public void sortTestShouldReturnArraySorted() {
        sort(beginnerKit, comparator);
        assertArrayEquals(beginnerKitSort.toArray(), beginnerKit.toArray());
    }
}
