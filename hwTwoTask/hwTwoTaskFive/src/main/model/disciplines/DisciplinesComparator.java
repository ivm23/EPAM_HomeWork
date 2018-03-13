package main.model.disciplines;

import java.util.Comparator;

public class DisciplinesComparator implements Comparator<Discipline> {
    @Override
    public int compare(Discipline discipline1, Discipline discipline2) {
        return discipline1.getName().compareTo(discipline2.getName());
    }
}
