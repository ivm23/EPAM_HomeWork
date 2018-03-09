package main.model.disciplines;

import java.util.Comparator;

public class DisciplinesComparator implements Comparator<Disciplines> {
    @Override
    public int compare(Disciplines discipline1, Disciplines discipline2) {
        return discipline1.getName().compareTo(discipline2.getName());
    }
}
