package main.model.student;

import main.model.marks.Marks;
import main.model.disciplines.Discipline;

import java.util.List;


public class DisciplineRegister<T extends Number> {
    private Discipline discipline;
    private Marks marks;

    public DisciplineRegister(Discipline discipline, Marks<T> marks) throws Exception {
        this.discipline = discipline;
        checkTypeMarks(marks.getMarks());

        this.marks = marks;
    }

    public Discipline getDiscipline() {
        return discipline;
    }

    public void setDiscipline(Discipline discipline) {
        this.discipline = discipline;
    }

    public Marks<T> getMarks() {
        return marks;
    }

    public void setMarks(Marks<T> marks) {
        this.marks = marks;
    }

    public void checkTypeMarks(List<T> marks) throws Exception {

        if (discipline == Discipline.MATHEMATICS || discipline == Discipline.PHYSICS) {
            for (T mark : marks) {
                boolean markExist = false;
                for (int existMark : discipline.getIntMarks()) {
                    if (existMark == mark.intValue()) {
                        markExist = true;
                        break;
                    }
                }
                if (!markExist) {
                    throw new Exception(discipline.getName() + " must be integer!");
                }
            }
        } else {
            for (T mark : marks) {
                boolean markExist = false;
                for (double existMark : discipline.getDoubleMarks()) {
                    if (existMark == mark.intValue()) {
                        markExist = true;
                        break;
                    }
                }
                if (!markExist) {
                    throw new Exception(discipline.getName() + " must be double!");
                }
            }
        }
    }

    @Override
    public String toString() {
        return discipline.getName() + " " + marks.toString();
    }

    @Override
    public int hashCode() {
        return toString().hashCode();
    }
}
